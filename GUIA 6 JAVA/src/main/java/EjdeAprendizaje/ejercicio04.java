package EjdeAprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Dada una cantidad de grados centígrados se debe mostrar
 * su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).

 * @author andreajalil
 */
public class ejercicio04 {

   
    public static void main(String[] args) {
        double temp;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados a convertir");
        temp=leer.nextDouble();
        System.out.println("La temperatura en farenheit es: " + (32+(temp*1.8)));
    }
    
}
