package EjdeAprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Escribir un programa que pida una frase y 
 * la muestre toda en mayúsculas y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author andreajalil
 */
public class ejercicio03 {

    public static void main(String[] args) {
        String frase, mayus, minus;
        Scanner leer=new Scanner(System. in);
        leer.useDelimiter("\n"); // incluye los espacios
        System.out.println("Ingrese la trase a convertir");
        frase=leer.next();
        mayus=frase.toUpperCase();
        minus=frase.toLowerCase();
        System.out.println("La frase en mayuscula quedaria: "+mayus) ;
        System.out.println("La frase en minuscuza quedaria: " +minus);
                
    }

    
    
}
