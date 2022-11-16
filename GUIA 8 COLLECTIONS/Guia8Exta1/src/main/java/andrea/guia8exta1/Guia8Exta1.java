/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado 
y los guarde en un ArrayList de tipo Integer. 
La lectura de números termina cuando se introduzca el valor -99.
Este valor no se guarda en el ArrayList. 
A continuación, el programa mostrará por pantalla el número de valores que se han leído, 
su suma y su media (promedio).*/

package andrea.guia8exta1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Guia8Exta1 {

    public static void main(String[] args) {
       ArrayList<Integer>num=new ArrayList<>();
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int numero=0;
        do {            
            System.out.println("Ingrese un número.");
            numero=sc.nextInt();
            if (numero!=-99) {
                num.add(numero);
            }
            
        } while (numero!=-99);
        
        
        System.out.println("--------NUMEROS INGRESADOS------");
        for (Integer nro : num) {
            System.out.println(nro);
        }
        System.out.println("--------LA SUMA DE LOS NUMEROS------");
        int suma=0;
        for (Integer nro : num) {
            suma+=nro;
        }
        System.out.println(suma);
        System.out.println("--------EL PROMEDIO DE LOS NUMEROS ES------");
        System.out.println(suma/num.size());
        
    }
}
