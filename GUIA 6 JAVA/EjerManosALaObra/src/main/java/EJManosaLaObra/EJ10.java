
package EJManosaLaObra;

import java.util.Scanner;

/**
 *Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
 * e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 *********** 2 **
 * @author andreajalil
 */
public class EJ10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2,n3,n4;
        do {
            System.out.println("Ingrese 4 numeros menores de 20");
             n1=leer.nextInt();
            n2=leer.nextInt();
            n3=leer.nextInt();
              n4=leer.nextInt();
        } while (n1>20 || n2>20 || n3>20 || n4>20);
            
        System.out.print(n1);
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
            }
             System.out.println("");
             
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
            }
             System.out.println("");
            
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
            }
             System.out.println("");
            
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
            }
             System.out.println("");
        }


    }
