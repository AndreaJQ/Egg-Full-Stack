package EXTRA;

import java.util.Scanner;

/**Escriba un programa que averigüe si dos vectores de N enteros son iguales
 (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 * @author andreajalil
 */
public class ejercicio19 {
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DE LOS VECTORES");
        int N= leer.nextInt();
        int[]vec1= new int[N];
        int[]vec2= new int[N];
        //asignar valores aleatorios
        for (int i = 0; i < N; i++) {
            vec1[i]=(int)(Math.random()*10);
            vec2[i]=(int)(Math.random()*10);
        }
        //escribir ambos vectores
           System.out.println("VECTOR 1");
        for (int i = 0; i < N; i++) {
            System.out.println("[ "+  vec1[i]+ " ]");
        }
        System.out.println("VECTOR 2");
        for (int i = 0; i < N; i++) {
            System.out.println("[ "+  vec2[i]+ " ]");
        }
        //comparar
        int cont=0;
        for (int i = 0; i < N; i++) {
            if (vec1[i]==vec2[i]) {
                cont++;
            }else
                break;
        }
        if (cont==N) {
            System.out.println("la cantidad de numeros iguales es " +cont);
        }else
            System.out.println("Se salió porque algún numero no coincide");
        System.out.println("Coinciden " + cont+ " numero/s");
    }
    
}
