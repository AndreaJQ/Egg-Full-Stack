
package EXTRA;

import java.util.Scanner;

/*Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 * @author andreajalil
 */
public class ejercicio08 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int num;
    int cont=0; 
    int contpar=0; 
    int contimpar=0;
        do {
            System.out.println("escriba numeros enteros");
            num= leer.nextInt();
            cont++;
            if (num%2==0) {
                contpar++;
            }else
                contimpar++;
            if (num<0) {
                break;
            }
        } while (num%5!=0);
        System.out.println("TODOS "+cont);
        System.out.println("PARES "+contpar);
        System.out.println("IMPARES "+contimpar);
        
    }
    
}
