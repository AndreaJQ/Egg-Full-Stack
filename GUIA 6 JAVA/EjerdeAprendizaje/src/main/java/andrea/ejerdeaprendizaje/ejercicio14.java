package andrea.ejerdeaprendizaje;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena,
 * este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * @author andreajalil
 */
public class ejercicio14 {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros ' ' ");
        double euros=leer.nextDouble();
        
        System.out.println("La converión a libras es: " + libras(euros) + " &" );
        System.out.println("La converión a dolares es: " + dollars(euros) + " $" ); 
        System.out.println("La converión a yenes es: " + yens(euros) + " yenes" );
    }
   public static double libras (double euros){
       return euros*0.86;
   } 
    
    public static double dollars (double euros){
        return euros*1.28;
    }
    
    public static double yens (double euros){
        return euros*12;
    }
}
