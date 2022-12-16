/*
 Se plantea desarrollar un programa que nos permita calcular el área 
y el perímetro de formas geométricas, en este caso un círculo y un rectángulo.
Ya que este cálculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, 
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz 
y se calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2. */

package andrea.guia10ej4;

/**
 *
 * @author andreajalil
 */
public class Guia10Ej4 {

    public static void main(String[] args) {
       Rectangulo rec= new Rectangulo(10, 20);
       Circulo circ=new Circulo(10);
       
        System.out.println("RECTÁGULO");
       rec.calculaArea();
       rec.calculaPerimetro();
      
        System.out.println("\nCÍRCULO");
       circ.calculaArea();
       circ.calculaPerimetro();
    }
}
