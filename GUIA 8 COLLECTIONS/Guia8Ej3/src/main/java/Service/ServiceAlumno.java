package Service;

import Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceAlumno {
    private ArrayList<Alumnos> sts; // Creo la lista
    private Scanner sc; // Creo el Scanner para utilizar en toda mi clase
      
    String rta="";
    String nombre;
    int marks;
    
    public ServiceAlumno(){
        this.sts = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.sc = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    public void ingresarAlumnos(){
        do {
            ArrayList<Integer> notas=new ArrayList(3);
             System.out.println("Ingrese el nombre del Alumno.");
            nombre=sc.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la "+(i+1)+"º nota");
                marks=sc.nextInt();
                notas.add(marks);
            }
            System.out.println("----------:::Ingresando alumno:::----------");
           
            crearAlumno(nombre,notas);
            
            System.out.println("¿Desea seguir ingresando alumnos?(S/N)");
            rta=sc.next();
        } while (rta.equalsIgnoreCase("s"));
        
    }
    
    public void crearAlumno(String nombre, ArrayList<Integer> notas){
      sts.add(new Alumnos(nombre,notas)); //agregar Alum en ArrayList
        
    }
//    public void mostrarAlumnos(){
//        for (int i = 0; i < sts.size()+1; i++) {
//            System.out.println(sts.get(i));
//        }
//    }
    public void buscarAlumn(){
        do {
             System.out.println("Ingrese el nombre del Alumno que quiere ver la nota.");
             String buscado=sc.next();
             Iterator<Alumnos> it=sts.iterator();
             Integer suma=0;
             while (it.hasNext()) {
                Alumnos next = it.next();
                 if (next.getNombreAl().equalsIgnoreCase(buscado)) {
                     ArrayList<Integer> auxnota= next.getNotas();
                     for (Integer notaFinal : auxnota) {
                         suma+=notaFinal;
                     }
                     System.out.println("La nota promedio de "+next.getNombreAl()+" es "+ (float)suma/3);
                 }
            }
             if (suma==0) {
                 System.out.println("No se encontró el alumno");
            }

            System.out.println("¿Desea seguir buscar otro alumnos?(S/N)");
            rta=sc.next();
        } while (rta.equalsIgnoreCase("s"));
        
    }

}


/*
while (iterator.hasNext()){
             if(AlumnoBuscado.equals(iterator.next())){
                 System.out.println(iterator.next());
               
             }else{
                 System.out.println("No se encontro el alumno/a.");            
        }
                 
        }
*/