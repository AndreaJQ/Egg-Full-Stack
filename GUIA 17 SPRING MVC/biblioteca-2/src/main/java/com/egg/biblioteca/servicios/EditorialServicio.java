/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
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
public class EditorialServicio {
    
    @Autowired
    EditorialRepositorio editorialRepositorio;
    
    
    @Transactional
    public void crearEditorial(String nombre) throws MiException{
        validar(nombre, nombre);
        
        Editorial editorial = new Editorial();
        
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
        
    }
    
    @Transactional(readOnly = true)
        public List<Editorial> listarEditoriales(){
        
        List<Editorial> editoriales = new ArrayList();
        
        editoriales =editorialRepositorio.findAll();
        
        return editoriales;
        
    }
            
        @Transactional
         public void modificarEditorial(String nombre, String id) throws MiException{
             validar(nombre, id);
            Optional<Editorial> respuesta = editorialRepositorio.findById(id);
            
            if (respuesta.isPresent()) {
                Editorial editorial = respuesta.get();
                
                editorial.setNombre(nombre);
                
                editorialRepositorio.save(editorial);
                
            }
        }
         
          @Transactional(readOnly = true)
    public Editorial getOne(String id){
        return editorialRepositorio.getOne(id);
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
