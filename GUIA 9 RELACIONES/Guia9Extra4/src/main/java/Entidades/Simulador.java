/*
Además, crearemos una clase Simulador 
que va a tener los métodos para manejar los alumnos y sus votaciones. 
Estos métodos serán llamados desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera aleatoria y lo retorne.
Las combinaciones de nombre y apellido deben ser generadas de manera aleatoria. 
Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un rango real de números de documentos.
Y agregar a los alumnos su DNI. Este método debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas,
cree una cantidad de objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos listas a cada objeto Alumno.
No puede haber dos alumnos con el mismo dni, pero si con el mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
*/
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Simulador {
    Voto vote = new Voto();
    Random r = new Random();
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    
    public ArrayList<Alumnos> creandoAlumnos(){
        System.out.println("Cuantos Alumnos quiere que se ingresen:");
        int cant = sc.nextInt();
        String []nombres= new String[cant];
        String []apellido = new String[cant];
        ArrayList<Alumnos> alumnosLista = new ArrayList();
        
        for (int i = 0; i < cant; i++) {
            Alumnos St=new Alumnos();
            St.setNombre("Nombre "+(i+1));
            St.setApellido("Apellido " +(i+1));
            St.setDNI(generaDNI());
           
            alumnosLista.add(St);
        }
        return alumnosLista;
    }
    
    
    private String generaDNI() {
        long dninum = r.nextInt(17000000, 59000000);
        
        String dni = Long.toString(dninum);

        return dni;

    }
    
    public void imprimirLista(ArrayList<Alumnos>lista){
        for (Alumnos Alum: lista) {
            System.out.println(Alum);
        }
    }
    
    
    
  
    
    
    public void votacion(ArrayList<Alumnos>lista){
        
        for (int i = 0; i < lista.size(); i++) {
            vote.setAlumnoQueVota(lista.get(i));
            vote.setAlumnosVotados(tresVotos(lista, lista.get(i)));
            //lista.get(i).sumarVotos();
            System.out.println(lista.get(i).getNombre()+"----------"); 
            }
    }
    
    public ArrayList<Alumnos> tresVotos(ArrayList<Alumnos>lista,Alumnos votante){
        ArrayList<Alumnos> aux = new ArrayList(lista);
        aux.remove(votante);
        Collections.shuffle(aux);
        ArrayList<Alumnos> retorno = new ArrayList();
        for (int i = 0; i < 3; i++) {
            retorno.add(aux.get(i));
//            lista.get(i).sumarVotos();
        }
        for (Iterator<Alumnos> iterator = retorno.iterator(); iterator.hasNext();) {
            Alumnos next = iterator.next();
            System.out.println(next.getNombre());
        }
        return retorno;
    }
    
    
    
//    public ArrayList<Alumnos> votacion2(ArrayList<Alumnos>lista){  
//        for (Alumnos aux : lista) {
//            auxAlumnos.remove(aux); //se quita el alumno que va a votar
//            ArrayList<Alumnos> votados=new ArrayList<>();
//            int v1= ran.nextInt(auxAlumnos.size());
//            int v2= ran.nextInt(auxAlumnos.size());
//            int v3= ran.nextInt(auxAlumnos.size());
//             
//        
//           //  int tam=auxAlumnos.size();
//             
//             votados.add(auxAlumnos.get(v1));
//             votados.add(auxAlumnos.get(v2));
//             votados.add(auxAlumnos.get(v3));
//             
//             auxAlumnos.get(v1).sumarVotos();
//             auxAlumnos.get(v2).sumarVotos();
//             auxAlumnos.get(v3).sumarVotos();
//             
//             vote.setAlumnoQueVota(aux);//asigna alumno que vota
//             
//             vote.setAlumnosVotados(votados);// asigna los alumnos votados
//             auxAlumnos.add(aux);
//             System.out.println(vote.toString()); //mostrar por pantalla el alumno que esta votando
//             
//             for (Alumnos v : votados) {
//                 System.out.println("Vota a: "+ v.toString());
//                
//            }
//        }
//        
//        
//        
//        
//        return lista;
//    }
}
