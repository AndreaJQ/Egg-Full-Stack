/*
Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada fracción).
Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir fracciones. 
Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

*/

package andrea.guia7otroextra1;

import Servicio.ServicioF;

/**
 *
 * @author andreajalil
 */
public class Guia7OtroExtra1 {

    public static void main(String[] args) {
        ServicioF sf= new ServicioF();
        
        sf.ingresoNros();
        sf.opciones();
    }
}
