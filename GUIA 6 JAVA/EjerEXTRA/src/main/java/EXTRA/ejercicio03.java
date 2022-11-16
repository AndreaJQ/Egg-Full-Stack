
package EXTRA;

import java.util.Scanner;

/**
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 Caso contrario mostrar un mensaje.
  Nota: investigar la función equals() de la clase String.
 */
public class ejercicio03 {


    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
     
       String letra;
      String salir;
       
        do {
            System.out.println("INGRESE UNA LETRA");
       letra=leer.next();
        
        if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ){
            System.out.println("LA LETRA ES UNA VOCAL"); 
        }
        else
             System.out.println("LA LETRA NO ES UNA VOCAL");
            System.out.println("DESEA CONTINUAR");
            salir=leer.next();
        } while (salir.equals("si"));
       
    }
  
           
}
