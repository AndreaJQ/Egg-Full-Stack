
package EXTRA;

import java.util.Scanner;

/*Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 * @author andreajalil
 */
public class ejercicio10 {

    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   
   int num1=(int) (Math.random() * 10);
   int num2=(int) (Math.random() * 10);
   int multiplicacion= num1*num2;
        //System.out.println(num1);
        //System.out.println(num2);
        //System.out.println(multiplicacion);
   int num;
   
        do {
            System.out.println("ADIVINE EL RESULTADO DE LA MULTIPLICACION");
            num=leer.nextInt();
            if (num==multiplicacion) {
                System.out.println("CORRECTO");
            }else
                System.out.println("INCORRECTO");
            
            
        } while (num!=multiplicacion);
        
    }
    
}
