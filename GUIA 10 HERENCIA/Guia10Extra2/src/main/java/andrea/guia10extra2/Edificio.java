/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. 
La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:*/
package andrea.guia10extra2;

public abstract class Edificio { //clase abstract porque tiene metodos abstract
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public abstract double calcularSuperficie();
    
    public abstract double calcularVolumen();
    
    
}
