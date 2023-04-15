/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *lleva la logica de la entidad libro
 * va a ejecutar todas las funciones necesarias para que la app cumpla
 * @author andreajalil
 */

@Service
public class LibroServicio {
    
    @Autowired  /*inyeccion de dependencias*/
    private LibroRepositorio libroRepositorio;
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    /*Permitir crear un libro*/  
  
    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial= new Editorial();
        
        if(respuestaAutor.isPresent()){
            
            autor = respuestaAutor.get();
        }
        
        if(respuestaEditorial.isPresent()){
            
            editorial = respuestaEditorial.get();
        }
      
        Libro libro = new Libro();
        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
       libroRepositorio.save(libro);
    }
   
    /*listar objetos*/
    @Transactional(readOnly = true)
    public List<Libro> listarLibros(){
        
        List<Libro> libros = new ArrayList();
        
        libros =libroRepositorio.findAll();
        
        return libros;
        
    }
    
    /* cuales metodos efectuan una transaccion en la base de datos
    @transactional
    
    establece que si el metodo se ejecuta sin lanzar excepciones se realiza el commit a la db y se aplica un cambion
    
    en cambio si el metodo lanza una exception y no es atrapada se vuelve atras con la transaccion y no se aplica nada en sb.
    rollback si hay errores.
    
    todos los metodos deben estar identificados con @transactional
    
    */
    
    /*editar los datos de un libro*/
    
    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{
        
        modificarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
    }

    /* cuales metodos efectuan una transaccion en la base de datos
    @transactional
    establece que si el metodo se ejecuta sin lanzar excepciones se realiza el commit a la db y se aplica un cambion
    en cambio si el metodo lanza una exception y no es atrapada se vuelve atras con la transaccion y no se aplica nada en sb.
    rollback si hay errores.
    todos los metodos deben estar identificados con @transactional
     */
    /*editar los datos de un libro*/
    
    @Transactional
    public void modificarLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        Optional<Libro> respuesta = libroRepositorio.findById(isbn); /*objeto contenedor, devuelve true y devuelve el valor con un get*/
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idAutor);
        Autor autor = new Autor();
        Editorial editorial= new Editorial();
        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }
        if (respuestaEditorial.isPresent()) {
            editorial=respuestaEditorial.get();
        }
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            
                     
            libro.setTitulo(titulo);
            
            libro.setEjemplares(ejemplares);
            
            libro.setAutor(autor);
            
            libro.setEditorial(editorial);
            
           
            libroRepositorio.save(libro);
        }
    }
    
     @Transactional(readOnly = true)
    public Libro getOne(Long isbn){
       return libroRepositorio.getOne(isbn);
    }
    
   
    
    /*VALIDAR DATOS INGRESADOS*/
    
private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
       
        if(isbn == null){
            throw new MiException("el isbn no puede ser nulo"); //
        }
        if(titulo.isEmpty() || titulo == null){
            throw new MiException("el titulo no puede ser nulo o estar vacio");
        }
        if(ejemplares == null){
            throw new MiException("ejemplares no puede ser nulo");
        }
        if(idAutor.isEmpty() || idAutor == null){
            throw new MiException("el Autor no puede ser nulo o estar vacio");
        }
        
        if(idEditorial.isEmpty() || idEditorial == null){
            throw new MiException("La Editorial no puede ser nula o estar vacia");
        }
    }
}
