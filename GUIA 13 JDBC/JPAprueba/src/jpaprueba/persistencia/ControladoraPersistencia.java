
package jpaprueba.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpaprueba.entidad.Alumno;
import jpaprueba.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author andreajalil
 */
public class ControladoraPersistencia {
     AlumnoJpaController AJPA = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
    AJPA.create(alu);
    }

    public void eliminarAlumno(int id) {
         try {
             AJPA.destroy(id);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
        }



    public void editarAlumno(Alumno alu) {
        try {
            AJPA.edit(alu);
        }catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return AJPA.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> lsitaAl= AJPA.findAlumnoEntities();
                ArrayList<Alumno> listaAlumnos= new ArrayList<Alumno>(lsitaAl);
        return listaAlumnos;
    }
}
