/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases.
Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después,
vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/

package andrea.guia9ej1;

import Entidad.Perro;
import Entidad.Persona;
import Service.ServiceAdopcion;

public class Guia9Ej1 {

    public static void main(String[] args) {
 
        ServiceAdopcion sa = new ServiceAdopcion();
        
        Perro mascot1 = new Perro("Nicky", 9);
        Perro mascot2 = new Perro("Lola", 4);
        Perro mascot3 = new Perro("Lobo", 7);
        Persona p1 = new Persona("Andrea", "Jalil", 32413053, 36,mascot1);
        Persona p2 = new Persona("Marta", "Leon", 13474888 , 65,mascot2);
        Persona p3 = new Persona("Enrique", "Mondino", 13571375, 65, mascot3);
        
        sa.llenaPerro(mascot1);
        sa.llenaPerro(mascot2);
        sa.llenaPerro(mascot3);
   
        System.out.println("---");
        System.out.println("Información de la Persona");
        System.out.println("Nombre: "+p1.getNombre()+"\n"
                + "Apellido: "+p1.getApellido()+"\n"
                + "DNI: "+p1.getDNI()+"\n"
                + "edad: "+p1.getEdad()+"\n"
                + "Datos de mascota: "+"\n"
                + "nombre: " + p1.getMascota().getNombre()+"\n"
                + "edad: "+p1.getMascota().getEdad()+"\n"
                        + "raza: "+p1.getMascota().getRaza()+"\n"
                                + "tamaño: " +p1.getMascota().getTamaño());
        System.out.println("---");
                
        System.out.println("Nombre: "+p2.getNombre()+"\n"
                + "Apellido: "+p2.getApellido()+"\n"
                + "DNI: "+p2.getDNI()+"\n"
                + "edad: "+p2.getEdad()+"\n"
                + "Datos de mascota: "+"\n"
                + "nombre: " + p2.getMascota().getNombre()+"\n"
                + "edad: "+p2.getMascota().getEdad()+"\n"
                        + "raza: "+p2.getMascota().getRaza()+"\n"
                                + "tamaño: " +p2.getMascota().getTamaño());
        System.out.println("---");
        
        System.out.println("Nombre: "+p3.getNombre()+"\n"
                + "Apellido: "+p3.getApellido()+"\n"
                + "DNI: "+p3.getDNI()+"\n"
                + "edad: "+p3.getEdad()+"\n"
                + "Datos de mascota: "+"\n"
                + "nombre: " + p3.getMascota().getNombre()+"\n"
                + "edad: "+p3.getMascota().getEdad()+"\n"
                        + "raza: "+p3.getMascota().getRaza()+"\n"
                                + "tamaño: " +p3.getMascota().getTamaño());
           }
}
