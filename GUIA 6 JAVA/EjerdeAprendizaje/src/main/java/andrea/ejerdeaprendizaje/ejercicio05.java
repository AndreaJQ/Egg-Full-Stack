package andrea.ejerdeaprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 * el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author andreajalil
 */
public class ejercicio05 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System. in);
        System.out.println("ingrese un numero");
        int numero=leer.nextInt();
        double raiz = Math. sqrt (numero);
        System.out.println("el numero doble del ingresado es: " + numero*2);
        System.out.println("el numero triple del ingresado es triple es: " +numero*3);
        System.out.println("la raiz cuadrada del numero ingresado es "+ raiz);
    }
    
}
