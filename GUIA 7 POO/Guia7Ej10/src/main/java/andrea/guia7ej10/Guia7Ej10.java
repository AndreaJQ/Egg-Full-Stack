/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales,
y el segundo B, un arreglo de 20 números, también reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo 
por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
*/
package andrea.guia7ej10;

import java.util.Arrays;

public class Guia7Ej10 {

    public static void main(String[] args) {
        
        double arrayA[]=new double[50];
        double arrayB[]=new double[20];
   
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i]=Math.floor(Math.random() * 100+1);
        }
       
        Arrays.sort(arrayA);
        
        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];
        }
        
        Arrays.fill(arrayB, 10, 20, 0.5);
        
        System.out.println("-----------------");
        System.out.println("ARRAY A SORTED");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("["+arrayA[i]+"]");
        }
        System.out.println("-------------------------");
         System.out.println("ARRAY B");
       for (int i = 0; i < arrayB.length; i++) {
           System.out.print("["+arrayB[i]+"]");
        }
    }
}
