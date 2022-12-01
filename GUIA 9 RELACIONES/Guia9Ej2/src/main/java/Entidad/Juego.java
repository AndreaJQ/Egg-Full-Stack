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
package Entidad;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> players;
    private Revolver gun;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> players, Revolver gun) {
        this.players = players;
        this.gun = gun;
    }

    public ArrayList<Jugador> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Jugador> players) {
        this.players = players;
    }

    public Revolver getGun() {
        return gun;
    }

    public void setGun(Revolver gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return "Juego{" + "players=" + players + ", gun=" + gun + '}';
    }
    
    
}
