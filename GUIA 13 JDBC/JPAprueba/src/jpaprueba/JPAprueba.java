/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import jpaprueba.entidad.Alumno;
import jpaprueba.entidad.Controladora;

/**
 *
 * @author andreajalil
 */
public class JPAprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controladora control= new Controladora();
        
        
        //Alumno alu2 = new Alumno(30, "Prueba", "Name", new Date(1986-1900, 07, 28));
        //Alumno alu = new Alumno(90, "Gabriela", "Quiroga", new Date(1988-1900, 8, 13));
        
        //control.crearAlumno(alu);
        //control.crearAlumno(alu2);
        
        //control.eliminarAlumno(15);
        
        //alu.setApellido("JALIL");
        //control.editarAlumno(alu);
        
        Alumno alu = control.traerAlumno(90);
        System.out.println("El alumno es: \n" );
        System.out.printf("%-8s%-10s%-10s%-5s\n", "id", "apellido", "nombre", "fechaNac");
        System.out.println(alu.toString());
        
        
        System.out.println("RESULTADO TODODS");
        ArrayList<Alumno>ListaAlumnos = control.traerListaAlumnos();
        for (Alumno ListaAlumno : ListaAlumnos) {
            System.out.println(ListaAlumno.toString());
        }
        
    }
    
}
