package EjdeAprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 * @author andreajalil
 */
public class ejercicio01 {
    public static void main (String []args){
        int num;
        int num1;
        int suma;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el primer numero a sumar");
        num=leer.nextInt();
        System.out.println("Ingrese el segundo numero a sumar");
        num1=leer.nextInt();
        suma=num+num1;
        System.out.println("El valor de la suma es: " +suma );
        
    }
}
