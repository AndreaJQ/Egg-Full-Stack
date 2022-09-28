package EjdeAprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un
 * mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 * @author andreajalil
 */
public class ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System. in) ;
        System.out.println("ingrese una frase: ");
        String frase=leer.next();
        if(frase.length ()==8){//el largo de frase igual a 8 caracteres
            
            System.out.println("Correcto");
   
        }else{
            
            System.out.println("Incorrecto");
            
        }       
    }      
}
            
