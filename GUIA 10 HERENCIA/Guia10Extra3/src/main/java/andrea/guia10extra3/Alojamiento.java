package andrea.guia10extra3;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Alojamiento {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
   public void crearAlojamiento(){
     
        System.out.println("Ingrese el Nombre del Alojamiento");
        this.nombre = leer.next().toUpperCase();
        System.out.println("Ingrese la Direccion");
        this.direccion = leer.next().toUpperCase();
        System.out.println("Ingrese la Localidad");
        this.localidad = leer.next().toUpperCase();
        System.out.println("Como se llama el Gerente");
        this.gerente = leer.next().toUpperCase(); 
   } 

    @Override
    public String toString() {
        return "\nAlojamiento: '" + nombre + "'\nDireccion: " + direccion + "\nLocalidad: " + localidad + "\nGerente: " + gerente;
    }
}
