/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/

package andrea.guia11ej5;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Guia11Ej5 {
//FORMA 1 TODO DENTRO DEL MÉTODO
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        int aleatorio= (int) (Math.random()*500+1);
//        int nroIngresado=0;
//        int intentos=0;
//        System.out.println("Nro a adivinar -->["+aleatorio+"]");
//        do {            
//            try {
//            System.out.println("Adivina el numero");
//            nroIngresado=leer.nextInt();
//            intentos++;
//        } catch (Exception e) {
//            System.out.println("error");
//            System.out.println(e.toString());
//            break;
//        }
//            if (aleatorio==nroIngresado) {
//            System.out.println("Adivinaste \n"
//                    + "los intentos fueron: "+ intentos);
//        }else if (aleatorio>nroIngresado) {
//            System.out.println("Te faltó, seguí intentando.");
//        }else if (aleatorio<nroIngresado) {
//            System.out.println("Te pasaste, seguí intentanto.");
//        }
//        } while (aleatorio!=nroIngresado);
//        


//FORMA 2 
        try {
            adivinar();
        } catch (Exception e) {
            System.out.println("error");
           System.out.println(e.toString());
        }      
    }
    
    
        public static void adivinar(){
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int aleatorio= (int) (Math.random()*500+1);
        int nroIngresado=0;
        int intentos=0;
        System.out.println("Nro a adivinar -->["+aleatorio+"]");
            do {            
            
            System.out.println("Adivina el numero");
            nroIngresado=leer.nextInt();
            intentos++;
        
            if (aleatorio==nroIngresado) {
            System.out.println("Adivinaste \n"
                    + "los intentos fueron: "+ intentos);
        }else if (aleatorio>nroIngresado) {
            System.out.println("Te faltó, seguí intentando.");
        }else if (aleatorio<nroIngresado) {
            System.out.println("Te pasaste, seguí intentanto.");
        }
        } while (aleatorio!=nroIngresado);
        }
        
      
 

    
}
