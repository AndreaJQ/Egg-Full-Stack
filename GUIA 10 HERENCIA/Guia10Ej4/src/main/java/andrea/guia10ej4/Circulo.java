/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10ej4;

/**
 *
 * @author andreajalil
 */
public class Circulo implements calculosFormas{

    private double radio;

    public Circulo() {
    }

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
   @Override
    public void calculaArea() {
        System.out.println("El área del círculo es: " + calculosFormas.pi*(this.radio*this.radio));
    }

    @Override
    public void calculaPerimetro() {
        System.out.println("El perímetro del círculo es: " + calculosFormas.pi*(2*this.radio));
    }
    
}
