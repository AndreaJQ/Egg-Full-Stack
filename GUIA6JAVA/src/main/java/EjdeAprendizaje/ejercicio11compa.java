/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjdeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ejercicio11compa {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       String confirm;
      
        int d=0;
        do{
            System.out.println("ingrese una opcion");
            int op=leer.nextInt();
        switch (op){
            case 1 -> {
                int suma = num1+num2;
                System.out.println("la suma es "+suma);
                }
            case 2 -> {
                int resta = num1-num2;
                System.out.println("la resta es "+resta);
                }
            case 3 -> {
                int multi = num1*num2;
                System.out.println("la multiplicacion es "+multi);
                }
            case 4 -> {
                double division = num1/num2;
                System.out.println("la divison es "+division);
                }
            case 5 -> {
                System.out.println("usted realmente quiere salir?");
                confirm = leer.next();
                if (confirm.equalsIgnoreCase("si")){
                    d=1;
                }
                }
        }
        }while(d!=1);
    }
}