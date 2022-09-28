package EjdeAprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Escriba un programa que pida una frase o palabra y valide 
 * si la primera letra de esa frase es una ‘A’. 
 * Si la primera letra es una ‘A’,
 * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
 * la función Substring y equals() de Java.
   ver los videos relacionados con este tema, antes de empezar los
 ejercicios, los podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
 * @author andreajalil
 */
public class ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System. in) ;
        System.out.println("ingrese una frase: ");
        String frase=leer.next();
        //char letra = "A";
        if(frase.substring(0,1).equalsIgnoreCase ("A")){
            System.out.println("si coincide");
        }else{ 
            System.out.println("no coincide");
            
        }
        
    }
    
}
