/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */ //comentario MULTILINEA barra/ asterisco*
package andrea.introjava;

import java.util.Scanner;//importa otro código

/**
 *
 * @author andreajalil
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //se crea una variable scanner que se utiliza para leer datos del usuario
       Scanner leer = new Scanner (System.in);
       //se crea una variable cadena string que se utiliza para leer datos del usuario
       String nombre;
       //muestra un mensaje por pantalla
       System.out.println("ingresa tu nombre"); //print line -> imprime cualquier tipo de cadena
       //leemos el nombre de la persona en la variable nombre
       nombre = leer.next();
       //mostramos por sonsola un saludo personalizado
       System.out.println("Hola Mundo! SOY " + nombre + " y estoy programando en java!");
        
    }
    
}
