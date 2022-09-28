package EjdeAprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Crear un programa que pida una frase 
 * y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, 
 * sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.

 * @author andreajalil
 */
public class ejercicio07 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        String frase = leer.next ();
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("CORRECTO");
        }else
        System.out.println("INCORRECTO");
    }
    
}
