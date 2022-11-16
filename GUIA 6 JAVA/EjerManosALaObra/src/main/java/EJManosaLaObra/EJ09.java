/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJManosaLaObra;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class EJ09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int cont = 0;
        int sum = 0;
        int n1 = 0;
        do{
            System.out.print("Escribir un numero ");
         n1 = leer.nextInt();
        cont = cont+1 ;
        sum = sum + n1;
        if (n1 == 0){
           // System.out.println("La suma total es" + sum);
            System.out.println("usted ingreso el 0, nos vimo ");
            break;
        }
        } while(cont <= 19);
        
        System.out.println("La suma total es " + sum);

    }
}
 