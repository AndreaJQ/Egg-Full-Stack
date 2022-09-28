
package EjdeAprendizaje;

import java.util.Scanner;

/**
 Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 este tipo de dispositivo lee cadenas enviadas por el usuario.
 Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
 el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java Substring(), Length(), equals().

contar cada vez que se vaya dando una vuelta el bucle. ->despues imprimir info.

 * @author andreajalil
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra="";
        String FDE="&&&&&";
        int correcto=0;
        int incorrecto=0;
        Scanner leer=new Scanner (System.in);
        
        
        do {
            System.out.println("Ingrese la palabra");
            palabra=leer.next();
            
            
            if ("o".equalsIgnoreCase(palabra.substring(0, 1))&& "x".equalsIgnoreCase(palabra.substring(4, 5))) {
              correcto++;  
            }
            else   
                incorrecto++;

            
        } while (!palabra.equals(FDE));
        
      
        System.out.println("correctas: " + correcto);
        System.out.println("incorrectas: " + incorrecto);
        
   
    }
    
}
