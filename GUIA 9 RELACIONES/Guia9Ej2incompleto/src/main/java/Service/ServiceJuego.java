/*
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
package Service;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceJuego {
    
    Juego game = new Juego();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public void llenarjuego(ArrayList<Jugador>jugadores, Revolver r){
        game.setGun(r);
        game.setPlayer(jugadores);
    }
    
    public void ronda(ServiceJugador jugador){
        int cont=0;
        String op = "s";
        while(jugador.disparo(game.getGun(), game.getPlayer().get(cont)) && op.equalsIgnoreCase("s")){
            cont++;
            System.out.println("Pasar al siguiente jugador? (S/N)");
            op = sc.next();
            if (cont >= game.getPlayer().size()) {
                cont = 0;
            }
        }
    }
}
