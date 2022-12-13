/*
 • Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos 
y para cada alumno genera tres votos de manera aleatoria. En este método debemos guardar a el alumno que vota,
a los alumnos a los que votó y sumarle uno a la cantidad de votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales fueron sus 3 votos.
 12
• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5 facilitadores suplentes con los 5 segundos alumnos más votados.
A continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes.*/

package Entidades;

import java.util.ArrayList;

public class Voto {
    private Alumnos alumnoQueVota;
    private ArrayList<Alumnos> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumnos alumnoQueVota, ArrayList<Alumnos> alumnosVotados) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumnos getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public void setAlumnoQueVota(Alumnos alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
    }

    public ArrayList<Alumnos> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumnos> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

//    public String vistaSimple(){
//    return "VOTOS:\n"
//            + "Votante: "+alumnoQueVota +"\n"
//            + "Votados: "+ getAlumnosVotados().toString()+"\n";
//    }
    
    @Override
    public String toString() {
        return "Voto \n"
                + "Alumno Que Vota: " + alumnoQueVota + "\n"
                + "Alumnos Votados: " + alumnosVotados + "\n";
    }
    
    
}
