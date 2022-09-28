package EjdeAprendizaje;


import java.util.Scanner;



/**
 *Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números
 * al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author andreajalil
 */
public class ejercicio10 {


    public static void main(String[] args) {
        int limite;
        int suma=0;
        int cont=0;
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un valor límite positivo");
        limite =leer.nextInt();
        while (suma<limite)
        {System.out.println("Ingrese un numero para sumar");
        int num=leer.nextInt();
        suma=suma+num;
        cont=cont+1;
        }
        
        System.out.println("La suma de los " +cont + " números ingresados es: " + suma);
        }
        
        
        
        
        
        
    }
    

