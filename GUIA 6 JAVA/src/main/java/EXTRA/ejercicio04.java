
package EXTRA;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
 * se muestre su equivalente en romano.
 * @author andreajalil
 */
public class ejercicio04 {

 
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      String salir;
      int num;
        do {
             do {
            System.out.println("INGRESE UN NUMERO ENTRE 1 Y 10");
            num=leer.nextInt();
            
        } while (num<1 || num>10);
             romano(num);
             System.out.println("DESEA SEGUIR (s/n)");
             salir=leer.next();
        } while (salir.equals("s"));
 

    }
    
    public static void romano(int num){
        
        switch (num){
           case 1:
                System.out.println("En romano es I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;
            case 6:
                System.out.println("En romano es VI");
                break;
            case 7:
                System.out.println("En romano es VII");
                break;
            case 8:
                System.out.println("En romano es VIII");
                break;
            case 9:
                System.out.println("En romano es IX");
                break;
            case 10:
                System.out.println("En romano es X");
            
            
        }
        
    }
    
}
