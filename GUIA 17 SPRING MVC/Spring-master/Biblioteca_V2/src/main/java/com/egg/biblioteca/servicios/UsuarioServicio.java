package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Imagen;
import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.enumeraciones.Rol;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.UsuarioRepositorio;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.Servlet;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private ImagenServicio imagenServicio;

    @Transactional
    public void registrar (MultipartFile archivo, String nombre, String email, String password, String password2) throws MiException{

        validar(nombre,email,password,password2);

        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);

        Imagen imagen = imagenServicio.guardar(archivo);
        usuario.setImagen(imagen);

        usuarioRepositorio.save(usuario);

    }

    @Transactional
    public void actualizar(MultipartFile archivo, String idUsuario, String nombre, String email, String password, String password2) throws MiException {

        validar(nombre, email, password, password2);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setEmail(email);

            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuario.setRol(Rol.USER);
            //actualizar imagen
            //creo una variable para alojar el id de imagen
            String idImagen = null;
            //verifico que si la imagen que tiene el usuario sea distinto de nulo (que haya una imagen)
            // si hay algo entonces que traiga la imagen que ya estaba vinculada con el usuarion
            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
            }
            //despues creamos una imagen y actualizamos.
            Imagen imagen = imagenServicio.actualizar(archivo, idImagen);
            //setear la imagen nueva
            usuario.setImagen(imagen);

            usuarioRepositorio.save(usuario);
        }

    }

    private void validar(String nombre, String email, String password,String password2) throws MiException{
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("el nombre no puede ser nulo o estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("el email no puede ser nulo o estar vacio");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }

        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }

    }

    //METODO USADO PARA CUANDO EL USUARIO SE LOGUEE
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//buscar un usuario de nuestro dominio y transformarlo en un usuario de dominio de spring security

        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_"+ usuario.getRol().toString());

            permisos.add(p);

            //interceptar ese punto - atrapar el usuario ya autenticado y guardarlo en la sesion web

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            //lo guardamos dentro de un objeto de la interfaz hhtsession.
            HttpSession sesion = attr.getRequest().getSession();
            //en esa variable sesion seteamos el atributo usuariosesion como llave que contiene el valor con todos los datos del objeto usuario (autenticado)
            sesion.setAttribute("usuariosession", usuario);


            return new User(usuario.getEmail(), usuario.getPassword(), permisos);


        }else{
            return null;
        }

    }

    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);
    }

    @Transactional(readOnly=true)
    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList();

        usuarios = usuarioRepositorio.findAll();

        return usuarios;
    }

    @Transactional
    public void cambiarRol(String id){
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if(respuesta.isPresent()) {

            Usuario usuario = respuesta.get();

            if(usuario.getRol().equals(Rol.USER)) {

                usuario.setRol(Rol.ADMIN);

            }else if(usuario.getRol().equals(Rol.ADMIN)) {
                usuario.setRol(Rol.USER);
            }
        }
    }
}
