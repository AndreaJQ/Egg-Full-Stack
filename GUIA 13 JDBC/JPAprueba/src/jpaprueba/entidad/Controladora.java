/*
ESCRIBIREMOS TODOS LOS METODOS 

LA CONECTAMOS CON LA CONTROLADORA DE PERSISTENCIA
 */
package jpaprueba.entidad;

import java.util.ArrayList;
import jpaprueba.persistencia.ControladoraPersistencia;

/**
 *
 * @author andreajalil
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
}
