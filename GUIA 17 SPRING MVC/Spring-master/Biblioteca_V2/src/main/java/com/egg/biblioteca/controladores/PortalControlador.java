package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PortalControlador {


    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }


    @GetMapping("/registrar")
    public String registrar(){
        return "registro.html";
    }


    @PostMapping("/registro")
    public String registro(MultipartFile archivo, @RequestParam String nombre, @RequestParam String email, @RequestParam
    String password, @RequestParam String password2, ModelMap model){

        try {
            usuarioServicio.registrar(archivo,nombre,email,password,password2);
            model.put("exito","usuario registrado correctamente!");

            return "index.html";
        } catch (MiException e) {
            model.put("error",e.getMessage());
            model.put("nombre",nombre);
            model.put("email",email);
            return "registro.html";
        }


    }
    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap model){
        if (error !=null){
            model.put("error", "Usuario o Contraseña invalidos!");
        }

        return "login.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping ("/inicio")
    public String inicio(HttpSession sesion){
        Usuario logueado = (Usuario) sesion.getAttribute("usuariosession");
        //todos los datos estan guardados en esa variable. -> despues validamos

        if (logueado.getRol().toString().equals("ADMIN")){
            return "redirect:/admin/dashboard";
        }
        return "inicio.html";
    }



    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo,HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", usuario);
        return "usuario_modificar.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo, @PathVariable String id, @RequestParam String nombre, @RequestParam String email,
                             @RequestParam String password, @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.actualizar(archivo, id, nombre, email, password, password2);

            modelo.put("exito", "Usuario actualizado correctamente!");

            return "inicio.html";
        } catch (MiException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

            return "usuario_modificar.html";
        }

    }
}
