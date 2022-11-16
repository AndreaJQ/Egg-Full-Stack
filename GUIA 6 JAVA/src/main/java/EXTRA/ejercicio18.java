package EXTRA;

import java.util.Scanner;

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
 * de tamaño N, con los valores ingresados por el usuario.
 * @author andreajalil
 */
public class ejercicio18 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n= leer.nextInt();
        int []vector = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el número para la posición "+(i+1));
            vector[i]=leer.nextInt();  
        }
        System.out.println("El vector es:");
        for (int i = 0; i < n; i++) {
            System.out.println("[ "+vector[i]+" ]"); 
        }
        int suma=0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        System.out.println("la suma es " + suma);
    }
    
}
