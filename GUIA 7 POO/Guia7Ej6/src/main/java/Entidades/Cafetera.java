/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Cafetera {
  private int capacidadMaxima;
  private int cantidadActual;

    public Cafetera() {
        capacidadMaxima=3000;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
 
  /**
   * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
   */
  public void llenarCafetera(){
      this.cantidadActual=this.capacidadMaxima;
      System.out.println("La capacidad actual es: " + cantidadActual+ "ml");
  }
  /**
   * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
   * y simula la acción de servir la taza con la capacidad indicada.
   * Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
   * El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
   */
  public void servirTaza(){
      int taza = 300;
      cantidadActual -= taza;
      System.out.println("La cantidad de cafe es; " + cantidadActual + "ml");
      
  }
  
  /*Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
  public void vaciarCafetera(){
      cantidadActual=0;
      System.out.println("La cafetera está vacia. Tiene " + cantidadActual + "ml");
      
  }
  
  /**
   * Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
   * y se añade a la cafetera la cantidad de café indicada.
   */
  public void agregarCafe(){
      Scanner leer= new Scanner (System.in);
      System.out.println("¿Cuanto cafe desea agregar?");
      int agregar=leer.nextInt();
      cantidadActual+=agregar;
      System.out.println("La cafetera contine " + cantidadActual + "ml de café.");
  }
  
  
  
}
