
package EXTRA;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main.
@author andreajalil
 */
public class ejercicio15 {

    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO");
        int num1=leer.nextInt();
        System.out.println("INGRESE UN NÚMERO");
        int num2=leer.nextInt();
        System.out.println("""
                           Elija la operación que desea realizar 
                           1- suma 
                           2- resta
                           3- multiplicación
                           4- división""");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El valor de la suma es "+suma(num1, num2));
                break;
            case 2:
                System.out.println("El valor de la resta es "+resta(num1, num2));
                break;
            case 3:
                System.out.println("El valor de la multiplicación es "+multip(num1, num2));
                break;
            case 4:
                System.out.println("El valor de la división es "+div(num1, num2));
                break;
            default:
                throw new AssertionError();
        }

    }
    public static int suma (int num1, int num2){
        return num1 + num2;
    }
    public static int resta(int num1, int num2){
        return num1 - num2;
    }
     public static int multip(int num1, int num2){
        return num1 *num2;
    }
    public static double div(int num1, int num2){
        return num1 /num2;
    }
}
