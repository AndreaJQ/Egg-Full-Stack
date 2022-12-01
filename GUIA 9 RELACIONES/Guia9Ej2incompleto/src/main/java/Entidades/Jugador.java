/*

Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, 
pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() 
y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.*/
package Entidades;

/**
 *
 * @author andreajalil
 */
public class Jugador {
    private int jugadores;
    private int IDjugador;
    private String nombre;
    private boolean mojado;

  
    public Jugador(){
        this.jugadores = 6;
        this.nombre = "no llegó a disparar";
        this.mojado = true;
    }

    public Jugador(int jugadores, int IDjugador, String nombre, boolean mojado) {
        this.jugadores = jugadores;
        this.IDjugador = IDjugador;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
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
        return "Jugador{" + "jugadores=" + jugadores + ", IDjugador=" + IDjugador + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
    