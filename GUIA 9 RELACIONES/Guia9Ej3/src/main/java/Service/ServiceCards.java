/*
 La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas.
En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, 
si se saca una carta y luego se llama al método, este no mostrara esa primera carta.*/
package Service;

import Entidad.Baraja;
import Entidad.Cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServiceCards {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    Baraja b1 = new Baraja();
    Cartas c1 = new Cartas();
    ArrayList<Cartas> masoUsado= new ArrayList<>();
    int cont= 0;
    int cantidad=0;

    public void barajar() {
     Collections.shuffle(b1.getCartasList());   
    }
    
    public void siguienteCartas(){
        cont++;
        if (b1.getCartasList().size()<1) {
            System.out.println("SE ACABÓ EL MASO.");
       } else{
            Cartas aux= b1.getCartasList().get(0);
            System.out.println("CARTA " + aux.getNum().toString()+" - " +aux.getPalo().toString());
            b1.getCartasList().remove(0);
            masoUsado.add(aux);
            System.out.println("SERVIDAS:  "+cont);
            System.out.println("RESTANTES: "+b1.getCartasList().size());
        }
    }
            
    public void mostrarBaraja(){
        System.out.println("");
        System.out.println("BARAJA DE CARTAS: ");
        for (Cartas aux : b1.getCartasList()) {
            System.out.println(aux.getNum().toString() +" - " + aux.getPalo().toString());}
        System.out.println("CANTIDAD " + b1.getCartasList().size());
    }
    
    public void cartasDisponibles(){
        System.out.println("");
        System.out.println("CARTAS DISPONIBLES");
        System.out.println(b1.getCartasList().size());
    }
    
    public void darCartas(int cantidad){
        System.out.println("");
        System.out.println("¿CUANTAS CARTAS DESEA?");
        cantidad=sc.nextInt();
        if (b1.getCartasList().size()>=cantidad) {
            for (int i = 0; i < cantidad; i++) {
                masoUsado.add(b1.getCartasList().get(0));
            b1.getCartasList().remove(0);}
        } 
    }
    public void mostrarMonton(){
        System.out.println("");
        if (masoUsado.size()==0) {
            System.out.println("NO SE HAN USADO CARTAS");
        }
        System.out.println("CARTAS SERVIDAS");
        for (Cartas cartas : masoUsado) {
            System.out.println(cartas.getNum().toString() +" - "+ cartas.getPalo().toString());
        }
        System.out.println("");
    }
    
    public void mostrarOrdenadaPorPalo(){
        Collections.sort(b1.getCartasList(),porPalo);
        System.out.println("ORDENADAS POR PALO: ");
        for (Cartas aux : b1.getCartasList()) {
            System.out.println(aux.getNum().toString() +" - " + aux.getPalo().toString());}
    }
    
     public void mostrarOrdenadaPorNum(){
        Collections.sort(b1.getCartasList(),porNumero);
        System.out.println("ORDENADAS POR NUMERO: ");
        for (Cartas aux : b1.getCartasList()) {
            System.out.println(aux.getNum().toString() +" - " + aux.getPalo().toString());}
    }
    
    public static Comparator<Cartas> porPalo = new Comparator<Cartas>() {
        @Override
        public int compare(Cartas c1, Cartas c2) {
            return c1.getPalo().compareTo(c2.getPalo());
        }
    };
    
    public static Comparator<Cartas> porNumero = new Comparator<Cartas>() {
        @Override
        public int compare(Cartas c1, Cartas c2) {
            return c1.getNum().compareTo(c2.getNum());
        }
    };
    
    public void menuCartas(){
        int op;
        System.out.println("JUEGO DE CARTAS");
        do {
            System.out.println("------------:::MENU:::------------");
            System.out.print("Qué desea realizar:\n"
                    + "1- Barajar.\n"
                    + "2- Siguiente Carta.\n"
                    + "3- Cartas Disponibles.\n"
                    + "4- Dar Cartas.\n"
                    + "5- Mostrar Cartas Servidas.\n"
                    + "6- Mostrar Baraja.\n"
                    + "7- Mostrar Baraja Ordenada por palos.\n"
                    + "8- Mostrar Baraja Ordenada por números.\n"
                    + "9- Salir.\n"
                    + "-->");
            op=sc.nextInt();
            switch (op) {
                case 1 -> barajar();
                case 2 -> siguienteCartas();
                case 3 -> cartasDisponibles();
                case 4 -> darCartas(cantidad);
                case 5 -> mostrarMonton();
                case 6 -> mostrarBaraja();
                case 7 -> mostrarOrdenadaPorPalo();
                case 8 -> mostrarOrdenadaPorNum();
                case 9 -> System.out.println("Saliendo...  ... ...\n"
                            + "Gracias por usar nuestro sistema.");
                default -> System.out.println("error... no indicó una opción correcta!");
            }
        } while (op!=9);
    }
        
}
