/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, 
pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() 
y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.*/
package Service;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author andreajalil
 */
public class ServiceJugador {
    ArrayList<Jugador> jugadores = new ArrayList<>();
    Jugador j = new Jugador();
    ServiceRevolver sr= new ServiceRevolver();
    
        public ArrayList<Jugador> ingresarJugadores(int nj) {
        if (nj > 6) {
            nj = 6;
        }
        for (int i = 0; i < nj; i++) {
            Jugador J1 = new Jugador();
            System.out.println("Ingresando Jugador #" + (i + 1));
            J1.setIDjugador(i + 1);
            J1.setMojado(true);
            jugadores.add(J1);
        }
        return jugadores;
    }
    
    public boolean disparo (Revolver r){
        Boolean verif= sr.mojar(r);
        if (verif) {
          j.setMojado(true);
            verif=false;
            return j.isMojado();
        }else{
          j.setMojado(false);
            sr.siguienteChorro(r);
            return j.isMojado();
        }
    }
    
    
}
