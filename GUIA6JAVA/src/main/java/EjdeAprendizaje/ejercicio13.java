
package EjdeAprendizaje;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter“*”.
 * Por ejemplo,si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
****
*  *
*  *
****
 * @author andreajalil
 */
public class ejercicio13 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");   
        int num=leer.nextInt();
        
       for (int i = 0; i < num; i++) {
             System.out.print("*");
        }
         System.out.println();
      
         for (int i = 1; i < num-1; i++) {
             System.out.print("*");
             for (int j = 1; j < num-2; j++) {
             System.out.print(" ");
        }
             System.out.println("*");
        }
        
         
         for (int i = 0; i < num; i++) {
             System.out.print("*");
        }
           System.out.println();
    
   
    
    }
}
