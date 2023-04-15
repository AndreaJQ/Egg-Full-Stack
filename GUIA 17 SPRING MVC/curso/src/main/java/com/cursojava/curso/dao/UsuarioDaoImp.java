package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository  //conexion con base de datos
@Transactional //permite armar las consultas fragmentos de transacción
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    EntityManager entityManager; //sirve para hacer la conexion con la base de datos.

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query= "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }


    @Override
    public boolean obtenerUsuarioPorCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .getResultList();

        if (lista.isEmpty()) {
            return false;
        }else {
            return true;
        }

        //String passwordHashed = lista.get(0).getPassword();

        //Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        //return argon2.verify(passwordHashed, usuario.getPassword());

        }




}
