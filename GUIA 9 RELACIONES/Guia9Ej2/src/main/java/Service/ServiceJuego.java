/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores 
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo.
Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, 
se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar.
Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Service;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class ServiceJuego {
    
    Juego game = new Juego();
    ServiceRevolver servRev= new ServiceRevolver();
    
    
    public void llenarJuego(ArrayList<Jugador> playerInsert, Revolver r ){
        //este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
        game.setPlayer(playerInsert);
        game.setGun(r);
    }
    
    public void ronda(Revolver r, Jugador j){
        int cont=0;
        for (Jugador aux : game.getPlayer()) {
            System.out.println("[Posicion Actual: " + r.getPosicionActual()+"]");
            System.out.println("El " + aux.getNombre()+" se apunta y dispara.");
            if (aux.isMojado()==true) {
                System.out.println(" ... Mojado \n");
                break;
            }else{
                System.out.println("...se salvó \n");
                cont++;
            }
        }
        
        
        if (cont==game.getPlayer().size()) {
            ronda(r, j);
        }
    }
}
