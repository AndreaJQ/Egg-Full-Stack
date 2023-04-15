package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import com.cursojava.curso.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutController {

    @Autowired
    private UsuarioDao usuarioDao;


    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {


        if (usuarioDao.obtenerUsuarioPorCredenciales(usuario)) {
              return "OK";
        }
        return "FAIL";
    } //genero el metodo y me largará error porque no está en el dao -> se lo crea autom.

}
