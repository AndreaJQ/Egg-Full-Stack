
package Service;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServiceCine {
    private Scanner sc;
    private Cine cine;
    
    public ServiceCine(){
    this.sc=new Scanner(System.in).useDelimiter("\n");
    this.cine=new Cine();
}
    public Pelicula crearPelicula(){
        Pelicula film=new Pelicula();
        /*System.out.println("Ingrese el nombre de la Pelicula: ");
        film.setTitulo(sc.next());
        System.out.print("Ingrese el director de: " + film.getTitulo() + " ");
        film.setDirector(sc.next());
        System.out.print("Ingrese la duracion de: " + film.getTitulo() + " ");
        film.setDuracionMin(sc.nextInt());
        System.out.print("Ingrese la edad minima de: " + film.getTitulo() + " ");
        film.setEdadMinima(sc.nextInt());*/
        film.setTitulo("Titanic");
        film.setDuracionMin(130);
        film.setEdadMinima(16);
        film.setDirector("Spilberg");
        
        return film;
    }
    
    /*public ArrayList<Espectador> crearEspectadores(){
        String[] nombres = {"Ana", "Andrea", "Julieta", "Enrique", "Marta", "Adolfo", "Luisa", "Alicia", "Carlos"};
        int[] edades = {22, 36, 38, 65, 26, 19, 13, 12, 40};
        double[] dineros = {500, 10, 180, 100, 400, 9.99, 4, 200, 20};
        ArrayList<Espectador> espectadores = new ArrayList();
        System.out.println("----::Creando Espectadores::----");
        for (int i = 0; i < nombres.length; i++) {
            Espectador espec1 = new Espectador();
//            System.out.println("Ingrese el nombre del espectador: ");
            espec1.setNombre(nombres[i]);
//            System.out.println(" Ingrese la edad de: " + espec1.getNombre());
            espec1.setEdad(edades[i]);
//            System.out.println("Ingrese el dinero disponible de: " + espec1.getNombre());
            espec1.setDineroDisponible(dineros[i]);
            espectadores.add(espec1);
//            System.out.println("---::Espectador ingresado correctamente::---");
//            System.out.println("Desea seguir ingresando espectadores? (S/N): ");
//            String op = sc.next();
        } 
        System.out.println("----:::FINALIZANDO:::----");
        return espectadores;    
    }*/
    
    public ArrayList<Espectador> creandoEspect(){
        System.out.println("Cuantos espectadores quiere que se ingresen:");
        int esp = sc.nextInt();
        String []nombres= new String[esp];
        int[]edades= new int[esp];
        double []dinero= new double[esp];
        ArrayList<Espectador> espectadores = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < esp; i++) {
            Espectador espectator=new Espectador();
            espectator.setNombre("Espectador "+ i);
            espectator.setEdad((int)(Math.random()*(75-13+1)+13));
            espectator.setDineroDisponible((double)(Math.random()*(75-25+1)+25));
            espectadores.add(espectator);
        }
        return espectadores;
    }
    
    public void crearSala(){
        cine.setMovie(crearPelicula());
        cine.setEspect(creandoEspect());
        cine.setPrecioEntrada(40);
        cine.setS1(new Sala());
    }
    
    public void asignarButaca(ArrayList<Espectador>espect){
           Random rand = new Random();
        String letr = "";
        for (int i = 0; i < espect.size(); i++) {
            if (espect.get(i).getDineroDisponible()>= cine.getPrecioEntrada()&& espect.get(i).getEdad() >= cine.getMovie().getEdadMinima()) {
                int fila = rand.nextInt(8), colum = rand.nextInt(6);
                switch (colum) {
                    case 0 ->
                        letr = "A";
                    case 1 ->
                        letr = "B";
                    case 2 ->
                        letr = "C";
                    case 3 ->
                        letr = "D";
                    case 4 ->
                        letr = "E";
                    case 5 ->
                        letr = "F";
                }
                if (!cine.getS1().getButacas()[fila][colum].contentEquals(fila + letr + "X")) {
                    cine.getS1().getButacas()[fila][colum] = fila + letr + "X";
                    System.out.println("Asiento ingresado el espectador correctamente");
                } else {
                    System.out.println("Asiento ocupado buscando otro...");
                    i = i - 1;
                }
            } else if (espect.get(i).getDineroDisponible()< cine.getPrecioEntrada()) {
                System.out.println("Al espectador: " + espect.get(i).getNombre() + " No tiene suficiente dinero pera entrar");
            } else if (espect.get(i).getEdad() < cine.getMovie().getEdadMinima()) {
                System.out.println("El espectador: " + espect.get(i).getNombre() + " No tiene la edad suficiente para entrar");
            }
        }
        
    }
    
    
    public void menu() {
        crearSala();
        System.out.println("Mostrando butacas de sala 1: ");
        System.out.println("Película a mostrar: " + cine.getMovie().getTitulo());
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("\033[32m|\033[0m" + cine.getS1().getButacas()[i][j]);
            }
            System.out.println("\033[32m|\033[0m");
        }
        System.out.println("-----------------------------------");
        System.out.println("Asigando butaca a especatador...");
        asignarButaca(cine.getEspect());
        System.out.println("-----------------------------------");
        System.out.println("Mostrando butacas en sala: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("\033[32m|\033[0m" + cine.getS1().getButacas()[i][j]);
            }
            System.out.println("\033[32m|\033[0m");
        }
        System.out.println(cine.getEspect());
    }

  }
