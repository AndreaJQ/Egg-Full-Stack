
package EXTRA;

import java.util.Scanner;

/*Crear un programa que dibuje una escalera de números,
donde cada línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1 12 123
 * @author andreajalil
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {//saltar escalones
            System.out.println("");
            for (int j = 1; j <= i; j++) {//escribir el valor de j en cada escalón
                System.out.print(j);//j va desde 1 hasta i 
                //pasa primer for con valor i=1 --- despues i=2
            }// va a ir escribiendo los numeros según el tamaño de i.

        }
        
    }
    
}

