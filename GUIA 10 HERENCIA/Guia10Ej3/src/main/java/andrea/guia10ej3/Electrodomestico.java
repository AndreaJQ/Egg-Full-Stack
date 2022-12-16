/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10ej3;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio;
    protected String color;
    protected char letraConsumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letraConsumo, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.letraConsumo = comprobarConsumoEnergetico(letraConsumo);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetraConsumo() {
        return letraConsumo;
    }

    public void setLetraConsumo(char letraConsumo) {
        this.letraConsumo = letraConsumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letraConsumo=" + letraConsumo + ", peso=" + peso + '}';
    }
    
    private char comprobarConsumoEnergetico(char letra){
          switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                letra = 'F';
        }
        return letra;
    }
    
    private String comprobarColor(String color){
        switch (color) {
            case "BLANCO":
                color = "Blanco";
                break;
            case "NEGRO":
                color = "Negro";
                break;
            case "GRIS":
                color = "Gris";
                break;
            case "AZUL":
                color = "Azul";
                break;
            case "ROJO":
                color = "Rojo";
                break;
            default:
                color = "Blanco";
        }
        return color;
        
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Color");
        String vColor = leer.next().toUpperCase();
        this.color = comprobarColor(vColor);
        System.out.println("Ingrese el Consumo (A,B,C,D o F)");
        char letra = leer.next().toUpperCase().charAt(0);
        this.letraConsumo = comprobarConsumoEnergetico(letra);
        System.out.println("Cuanto Pesa?");
        this.peso = (int) leer.nextDouble();
        precioFinal();

    }
    
    public void precioFinal() {
               
        switch (this.letraConsumo) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
               this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
            default:
                this.precio = 0;
        }

        if (this.peso > 80) {
            this.precio += 1000;
        } else if (this.peso >= 50) {
            this.precio += 800;
        } else if (this.peso >= 20) {
            this.precio += 500;
        } else {
            this.precio += 100;
        }
                
    }
}
