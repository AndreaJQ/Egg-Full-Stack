package EXTRA;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
public class ejercicio11 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        int i=0;
        while (num>0) {
            i++;
            num=num/10;
        }
        System.out.println("el numero tiene " + i + " dígitos");
        
        System.out.println("-----------------------------");
        System.out.println("OTRA MANERA");
        System.out.println("-----------------------------");
        System.out.println("Ingrese un numero");
        int numero=leer.nextInt();
        
        System.out.println(contarDigitos(numero)+" DIGITOS");
    }
    public static int contarDigitos(int numero){
        int digitos= (int)(Math.log10(numero)+1);
        return digitos;
    }
}
