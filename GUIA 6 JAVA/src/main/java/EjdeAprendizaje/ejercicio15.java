/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjdeAprendizaje;

/**
 *Realizar un algoritmo que rellene un vector con los 100
 * primeros números enteros y los muestre por pantalla en orden descendente.
 * @author andreajalil
 */
public class ejercicio15 {

    public static void main(String[] args) {
       int vector[] = new int[100]; // Le ponemos la dimension al vector
        
       
        for (int i = 1; i < 100; i++) {
         
            vector[i] = i; // Le asignamos a cada posicion del vector el numero 
            
        }
        
        for (int i = vector.length-1; i > -1; i--) {
            System.out.println("["+vector[i]+"]");
        }
        
        System.out.println(" ");
    }
}
