/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores 
y el revolver para guardarlos en los atributos del juego.
   ver los videos relacionados con este tema, antes de empezar los
 ejercicios, los podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
 9
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo.
Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, 
se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar.
Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;


public class Juego {
    private Revolver gun;
    private ArrayList<Jugador> player;

    public Juego() {
    }

    public Juego(Revolver gun, ArrayList<Jugador> player) {
        this.gun = gun;
        this.player = player;
    }

    public Revolver getGun() {
        return gun;
    }

    public void setGun(Revolver gun) {
        this.gun = gun;
    }

    public ArrayList<Jugador> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Jugador> player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Juego{" + "gun=" + gun + ", player=" + player + '}';
    }
    
    
    
}
