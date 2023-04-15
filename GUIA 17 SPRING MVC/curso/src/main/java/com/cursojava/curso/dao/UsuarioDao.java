package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuarioDao {  //genera error hasta que se implemente en UsuarioDaoImpl

    List<Usuario> getUsuarios();//indica cómo debería ser la función.

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean obtenerUsuarioPorCredenciales(Usuario usuario);


}