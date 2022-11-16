/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andrea.ejerdeaprendizaje;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ejercicio14variante {


   
      public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros ' ' ");
        double euros=leer.nextDouble();
          System.out.println("ELIJA LA MONEDA\n"
          +"LIBRAS\n"+
          "DOLARES\n"+
          "YENES");
        String moneda=leer.next();
        
        
        conversion(euros,moneda);
        
    }
    public static void conversion (double euros, String moneda){
        moneda=moneda.toUpperCase();
        switch(moneda){
            case"LIBRAS":
                System.out.println(euros*0.86);
                break;
            case"DOLARES":
                System.out.println(euros*1.28);
                break;
            case"YENES":
                System.out.println(euros*12);
                break;
                
        }
        
    }
}
