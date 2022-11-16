
package EXTRA;

import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 * @author andreajalil
 */
public class ejercicio16 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas");
        int canPers = leer.nextInt();//será el tamaño del vector
        String vecInfo[]=new String[canPers];
        String vecNom[]=new String [canPers];
        int vecEdad[]=new int[canPers];
        
        for (int i = 0; i < canPers; i++) {
            System.out.println("Ingrese el nombre del "+(i+1)+"º alumno");
            vecNom[i]=leer.next();
            System.out.println("Ingrese la edad del " + (i+1)+" alumno");
            vecEdad[i]=leer.nextInt();
            if (vecEdad[i]>=18) {//validar si es mayor o menor
                vecInfo[i]= vecNom[i]+" | " + vecEdad[i]+"| es mayor de edad";//vector info concatena vecNom, vecEdad y dice si es mayor o menor
            }
            else
                vecInfo[i]= vecNom[i]+" | " + vecEdad[i]+"| es menor de edad";
        }
        
        String salir;//cadena para validar si sigue o no imprimiendo
        for (int i = 0; i < canPers; i++) {
                System.out.println(" ");
                System.out.println("Desea imprimir la información de alumno?");
                salir=leer.next();
                if (salir.equalsIgnoreCase("no")) {
                    System.out.println("Usted eligió no imprimir.");
                    break; //si se imprime "no" se sale...
                }else       //sino imprime vector con info.
                    System.out.println("| "+ vecInfo[i]+"|"); //
            }

    }
    
}
