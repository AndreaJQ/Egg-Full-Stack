
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona person=new Persona();
    int anio,mes,dia;
    Date fechaActual=new Date();
    
    
    public void crearPersona(){
        System.out.println("Ingrese el NOMBRE");
        person.setNombre(leer.next());
        System.out.println("Ingrese su fecha de Nacimiento\n" + "Año\n"+ "Mes\n" + "día");
        anio=leer.nextInt();
        mes=leer.nextInt();
        dia=leer.nextInt();
        
        Date fecha= new Date(anio-1900, mes-1, dia);
        person.setFechaNac(fecha);
        
    }
    
    public void calcularEdad(){
        int edad;
        edad= fechaActual.getYear()-person.getFechaNac().getYear();
        System.out.println("La edad es "+ edad);
    }
    
    public boolean esMenor(){
        boolean menor=false;
        int edad= fechaActual.getYear()-person.getFechaNac().getYear();
        if (edad<=18 ) {
            return true;
        }else{
            return false;
        }
        
    }
    
    public void mostrarPersona(){
        System.out.println("El nombre es "+person.getNombre());
        System.out.println("La fecha de nacimiento es "+person.getFechaNac());
        
    }
}
