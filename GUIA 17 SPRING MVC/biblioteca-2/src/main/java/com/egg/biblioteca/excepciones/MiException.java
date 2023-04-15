/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.excepciones;

/**
 *
 * @author andreajalil
 */
public class MiException extends Exception{
    
    
    public MiException(String msg){
        super(msg);
    }/* generamos esta clase para diferenciar los errores nuestro que los propios del sistema*/
}
