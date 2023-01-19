/*
 3 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

4 Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/

package andrea.guia11ej3conclase;

import Servicio.ServicioDivision;
import java.util.InputMismatchException;

/**
 *
 * @author andreajalil
 */
public class Guia11Ej3conClase {

    public static void main(String[] args) {
        ServicioDivision sd= new ServicioDivision();
        try {
           sd.dividir();
          
        } catch (NumberFormatException e) {
            System.out.println("Excepcion de parseInt");
            System.out.println(e.toString());
           
        } catch (ArithmeticException e) {
            System.out.println("Excepcion division por CERO");
            System.out.println(e.toString());
             
        } catch (InputMismatchException e) {
            System.out.println("Excepcion de Ingreso");
            System.out.println(e.toString());
         
        } finally {

            System.out.println("TERMINO");
            
        }
       
    }
}
