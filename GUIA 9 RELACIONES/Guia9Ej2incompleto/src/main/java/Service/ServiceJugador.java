package Service;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceJugador {
    private List<Jugador> playerList = new ArrayList<>();
    private Integer id = 0;
    Scanner sc = new Scanner(System.in);
    ServiceRevolver sr = new ServiceRevolver();
    
    public ArrayList<Jugador> llenarJugador(){

        Jugador j = new Jugador();

        id++;
        j.setIDjugador(id);
        playerList.add(j);
       
        return (ArrayList<Jugador>) playerList;  //se casteó solo
    }
    /*
    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() 
y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.*/
    
      public boolean disparo(Revolver r, Jugador j) {
        System.out.println("-------------------------------------");
        System.out.println("Apuntando a jugador " + j.getNombre());
        System.out.println("Disparas!");
        if (sr.mojar(r)) {
            System.out.println("! Se mojo el Jugador !");
            j.setMojado(false);
        } else {
            System.out.println("Se salvo el jugador");
            j.setMojado(true);
        }
        System.out.println(j.getNombre());
        System.out.println("-------------------------------------");
        if(j.isMojado() == false){
            System.out.println("Se acaba el juego " +j.getNombre() + " Pierde!");
        }
        sr.siguienteChorro(r);
        return j.isMojado();
    }
   
    
    public void mostrarJugadores(ArrayList<Jugador> jugador){
        for (Jugador jugador1 : jugador) {
            System.out.println(jugador1.toString());
        }
    }
}
