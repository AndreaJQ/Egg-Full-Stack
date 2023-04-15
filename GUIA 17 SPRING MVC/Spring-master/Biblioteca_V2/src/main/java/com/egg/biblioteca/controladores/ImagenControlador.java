
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imagen")
public class ImagenControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    //ubicación
    @GetMapping("/perfil/{id}")
    public ResponseEntity<byte[]> imagenUsuario (@PathVariable String id){
        //llega la id como parametro y buscamos el usuario que tenga ese id
        //creamos un usuario y lo igualamos a lo que nos trae el servicio
        Usuario usuario = usuarioServicio.getOne(id);

        //de ese usuario necesito la imagen y el contenido
        //eso lo guardo en un arreglo de byte

        byte[] imagen= usuario.getImagen().getContenido();

        //cabeceras del pedido que nos provee Spring
        //le dicen al navegador que lo que estamos devolviendo es una image.
        //le seteamos el ContentType.
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.IMAGE_JPEG);


        //retornamos un response Entity que manda una imagen(formato byte)
        //recibe la cabezera y el estado http.ok
        return new ResponseEntity<>(imagen,headers, HttpStatus.OK);
        //la respuesta es el arreglo de byte
        //en vez de mostrar todo un html mostramos una vista de la imagen.
    }
}