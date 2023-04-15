/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author andreajalil
 */
@Service
public class AutorServicio {
    
    @Autowired
    AutorRepositorio autorRepositorio;
    
    @Transactional
    public  void crearAutor(String nombre) throws MiException {
        validar(nombre, nombre);
        
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
    }
    
      @Transactional(readOnly = true)
        public List<Autor> listarAutores(){
        
        List<Autor> autores = new ArrayList();
        
        autores =autorRepositorio.findAll();
        
        return autores;
        
    }
        
         @Transactional
        public void modificarAutor(String nombre, String id) throws MiException{
            
            validar(nombre, id);
            
            Optional<Autor> respuesta = autorRepositorio.findById(id);
            
            if (respuesta.isPresent()) {
                Autor autor = respuesta.get();
                
                autor.setNombre(nombre);
                
                autorRepositorio.save(autor);
                
            }
        }
        
        @Transactional(readOnly = true)
        public Autor getOne(String id){
        return autorRepositorio.getOne(id);
    }
        
            @Transactional
    public void eliminar(String id) throws MiException{
        
        Autor autor = autorRepositorio.getById(id);
        
        autorRepositorio.delete(autor);

    }
        
        private void validar(String nombre, String id)throws MiException {
        if (id==null) {
            throw new MiException("El id no puede ser nulo");
        }
        if (nombre.isEmpty()|| nombre==null) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }
        
    }
        
    
}
