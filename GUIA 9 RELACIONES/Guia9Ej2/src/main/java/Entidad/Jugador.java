/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, 
pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
*/
package Entidad;

/**
 *
 * @author andreajalil
 */
public class Jugador {
    
   private int IDjugador;
    private String nombre;
    private boolean mojado;

  
    public Jugador(){
        
    }

    public Jugador(int IDjugador, String nombre, boolean mojado) {
        this.IDjugador = IDjugador;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
 
    public int getIDjugador() {
        return IDjugador;
    }

    public void setIDjugador(int IDjugador) {
        this.IDjugador = IDjugador;
    }

    public String getNombre() {
        this.nombre="Jugador - "+this.IDjugador;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "IDjugador=" + IDjugador + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

   
    
    
}
