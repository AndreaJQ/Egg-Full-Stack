package EXTRA;

import java.util.Scanner;

/*22. Realizar un programa que rellene una matriz de tamaño NxM 
con valores aleatorios y muestre la suma de sus elementos.
 * @author andreajalil
 */
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño N de la matriz");
        int N=leer.nextInt();
        System.out.println("Ingrese el tamaño M de la matriz");
        int M=leer.nextInt();  
        int [][]matriz= new int [N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            } 
        }
         for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[ "+ matriz[i][j]+" ]");
            }
             System.out.println("");
        }       
        int suma=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma+=matriz[i][j];
            } 
        }
        System.out.println("La suma de los valores de la matriz es: " +suma);
    }
    
}
