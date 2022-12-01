/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual 
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua 
(la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package Entidades;

/**
 *
 * @author andreajalil
 */
public class Revolver {
    private int posicionActual; //posicion del tambor que se dispara,  puede que esté el agua o no
    private int posicionAgua; //la posición del tambor donde se encuentra el agua

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

   public void mojar(){
       
   }
    
    
}
