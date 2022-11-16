
package EXTRA;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
* los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un 
* valor real que represente el costo del tratamiento (previo al descuento) 
* y determine el importe en efectivo a pagar por dicho socio.
 * @author andreajalil
 */
public class ejercicio05 {


    public static void main(String[] args) {
    Scanner leer =new Scanner(System.in);
        System.out.println("""
                           INGRESE LA CLASE DE SOCIO
                           TIPO A
                           TIPO B
                           TIPO C""");
        String tipo=leer.next();
        
        System.out.println("INGRESE EL MONTO A PAGAR $ ");
        double pago=leer.nextDouble();
        descuento(tipo, pago);
        
        
    }
    public static void descuento(String tipo, double pago){
        tipo= tipo.toUpperCase();
        switch(tipo){
            case "A":
                System.out.println("EL DESCUENTO ES DEL 50%");
                System.out.println("DEPE PAGAR $ "+pago*0.5);
                break;
            case "B":
                System.out.println("EL DESCUENTO ES DEL 35%");
                System.out.println("DEPE PAGAR $ "+pago*0.65);
                break;
            case "C":
                System.out.println("NO POSEE DESCUENTOS");
                System.out.println("DEPE PAGAR $ "+pago);
                break;
            
        }
                
    }
}
