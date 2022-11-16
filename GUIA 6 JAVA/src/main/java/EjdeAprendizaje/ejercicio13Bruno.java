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
public class ejercicio13Bruno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String caracter;
       caracter = "* ";
       int longitud;
        System.out.println("Ingrese el largo del cuadrado");
        longitud = leer.nextInt();

        for(int aux1 = 1 ; aux1 <= longitud ; aux1++){               
            for(int aux2 = 1   ; aux2 <= longitud; aux2++){                    
	         if ((aux1 == 1) || (aux1 == longitud) || (aux2 == 1) || (aux2 == longitud))
                 { 
	           System.out.print(caracter);
                   }
                 else 
                 { 
                   System.out.print("  ");
                   }
                 
           }
            System.out.println(" ");
        
        }
   System.out.println(" ");  
    
    }
     }
