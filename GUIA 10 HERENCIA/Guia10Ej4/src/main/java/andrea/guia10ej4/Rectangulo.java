/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10ej4;

/**
 *
 * @author andreajalil
 */
public class Rectangulo implements calculosFormas{
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void calculaArea() {
        System.out.println("El área del rectángulo es: " + this.base*this.altura);
    }

    @Override
    public void calculaPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + (this.base+this.altura)*2);
    }
    
}
