
package EXTRA;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). 
 * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 * @author andreajalil
 */
public class ejercicio07 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i=0;
        int suma=0;
        int mayor=0;
        int menor=100;
        System.out.println("Ingrese la cantidad de numeros para ingresar");
        int n=leer.nextInt();
        
        /*do {
            System.out.println("Ingrese el "+ (i+1) + "º número");
            int nros=leer.nextInt();
            i++;
            suma+=nros;
        } while (i<n);*/
        
        while (i<n) {
            System.out.println("Ingrese el "+ (i+1) + "º número");
            int nros=leer.nextInt();
            i++;
            if (mayor<nros) {
                mayor=nros;
            }
            if (menor>nros) {
                menor=nros;
            }
           
            suma+=nros;
        }
        double promedio=suma/i;
        System.out.println("La cantidad de numeros ingresados es " + i);
        System.out.println("La suma de los numeros ingresados es "+ suma);
        System.out.println("El nro mayor es " + mayor);
        System.out.println("El nro menor es " + menor);
        System.out.println("El promedio es " + promedio);
    }

    
}
