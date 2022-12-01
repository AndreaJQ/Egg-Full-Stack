
package andrea.guia9ej2;


import Entidades.Revolver;
import Service.ServiceJuego;
import Service.ServiceJugador;
import Service.ServiceRevolver;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Guia9Ej2 {

    public static void main(String[] args) {
      
        
        
        ServiceJuego juego = new ServiceJuego();
        ServiceJugador jugador = new ServiceJugador();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Revolver r = new Revolver();
        ServiceRevolver revolver = new ServiceRevolver();
        r = revolver.llenarRevolver(r);
        juego.llenarJuego(jugador.ingresarJugadores(0), r);
        
         
    }
}
