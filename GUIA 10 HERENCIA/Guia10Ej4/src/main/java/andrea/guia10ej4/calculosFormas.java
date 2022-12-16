/*
Se plantea desarrollar un programa que nos permita calcular el área 
y el perímetro de formas geométricas, en este caso un círculo y un rectángulo.
Ya que este cálculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, 
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y el valor de PI como constante.*/
package andrea.guia10ej4;

/**
 *
 * @author andreajalil
 */
public interface calculosFormas {
    final double pi = Math.PI;
    public void calculaArea();
    public void calculaPerimetro();
}
