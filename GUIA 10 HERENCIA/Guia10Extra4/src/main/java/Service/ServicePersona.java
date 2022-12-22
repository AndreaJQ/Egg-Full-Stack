
package Service;

import andrea.guia10extra4.Estudiante;
import andrea.guia10extra4.Persona;
import andrea.guia10extra4.PersonalServicio;
import andrea.guia10extra4.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServicePersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void menu (ArrayList<Persona> listPersona){
        int op = 0;
        do {
            System.out.println(" \n ____Qué desea mostrar_____");
            System.out.println("| 1. Todos                   |");
            System.out.println("| 2. Profesores              |");
            System.out.println("| 3. Personal de servicio    |");
            System.out.println("| 4. Estudiantes             |");
            System.out.println("| 5. Cargar Información      |");
            System.out.println("| 6. Salir                   |");
            System.out.println(" ----------------------------");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    mostrarTodo(listPersona);
                    break;
                case 2:
                    profesores(listPersona);
                    break;
                case 3:
                    personaldeServicio(listPersona);
                    break;
                case 4:
                    estudiantes(listPersona);
                    break;
                case 5:
                    cargarInfo(listPersona);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema... \nGracias por usar nuestro servicio.");
                    break;
                default:
                    System.out.println("Ingreso una opcion no valida");
            }

        } while (op != 6);
        
    }
    public void cargarInfo(ArrayList<Persona> listPersona){
        int num;
        do {
            System.out.println("\n INGRESO DE INFORMACIÓN\n1. Ingresar Estudiante\n2.Ingresar Docente\n3.Ingresar Personal de Servicio\n4.Salir");
        num=leer.nextInt();
        switch (num) {
            case 1:
                Estudiante Est1=new Estudiante();
                Est1.crearPersona();
                Est1.mostrarInfo();
                listPersona.add(Est1);
                break;
            case 2:
                Profesor Pro1=new Profesor();
                Pro1.crearPersona();
                listPersona.add(Pro1);
                break;
            case 3:
                PersonalServicio PS1=new PersonalServicio();
                PS1.crearPersona();
                listPersona.add(PS1);
                break;
                
            default:
                System.out.println("Error");
                break;
        } 
        
    }while (num!=4);
}
    
    public void mostrarTodo(ArrayList<Persona> listPersona){
        for (Persona aux : listPersona) {
            
            if (aux instanceof Estudiante) {
                System.out.println("\n----ESTUDIANTES----");
                aux.mostrarInfo();
            }else if (aux instanceof PersonalServicio) {
                System.out.println("\n----PERSONAL DE SERVICIO----");
                aux.mostrarInfo();
            }else if (aux instanceof Profesor) {
                System.out.println("\n----PROFESORES----");
                aux.mostrarInfo();                
            }
        }
    }
    
    public void profesores(ArrayList<Persona> listPersona){
        int num;
        do {
            System.out.println("Qué desea hacer? \n1. Mostrar Información.\n2. Realizar Cambios.\n3. Salir.");
        num = leer.nextInt();
        switch (num) {
            case 1:
                for (Persona aux : listPersona) {
                    if (aux instanceof Profesor) {
                        aux.mostrarInfo();
                    }
                }
                break;
            case 2:
                for (Persona aux : listPersona) {
                    if (aux instanceof Profesor) {
                        System.out.println("CAMBIO DE DEPARTAMENTO");
                        ((Profesor) aux).cambioDepto();
                    }
                }
                break;
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("error...");
                break;
        }
        } while (num!=3);
        
    }
    
    public void personaldeServicio(ArrayList<Persona> listPersona){
        
        int num;
        do {
            System.out.println("Qué desea hacer? \n1. Mostrar Información.\n2. Realizar Cambios.\n3. Salir.");
        num = leer.nextInt();
        switch (num) {
            case 1:
                for (Persona aux : listPersona) {
                    if (aux instanceof PersonalServicio) {
                        aux.mostrarInfo();
                    }
                }
                break;
            case 2:
                for (Persona aux : listPersona) {
                    if (aux instanceof PersonalServicio) {
                        System.out.println("CAMBIO DE SECCIÓN");
                        ((PersonalServicio) aux).cambioSeccion();
                    }
                }
                break;
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("error...");
                break;
        }
        } while (num!=3);
    }
    
    public void estudiantes(ArrayList<Persona> listPersona){
        int num;
        do {
            System.out.println("Qué desea hacer? \n1. Mostrar Información.\n2. Matricular en un nuevo curso.\n3. Salir.");
        num = leer.nextInt();
        switch (num) {
            case 1:
                for (Persona aux : listPersona) {
                    if (aux instanceof Estudiante) {
                        aux.mostrarInfo();
                    }
                }
                break;
            case 2:
                for (Persona aux : listPersona) {
                    if (aux instanceof Estudiante) {
                        System.out.println("MATRICULAR EN CURSO");
                        ((Estudiante) aux).matriculacion();
                    }
                }
                break;
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("error...");
                break;
        }
        } while (num!=3);
    }
    
}
