/*
• Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato, secretaría, ...).*/
package andrea.guia10extra4;

import Enum.EstadoCivilEnum;
import Enum.SeccionEnum;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class PersonalServicio extends Empleado{

    private SeccionEnum seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(SeccionEnum seccion, Integer year, Integer despacho, String nombre, String apellido, Integer Dni, EstadoCivilEnum estadoCivil) {
        super(year, despacho, nombre, apellido, Dni, estadoCivil);
        this.seccion = seccion;
    }


    public SeccionEnum getSeccion() {
        return seccion;
    }

    public void setSeccion(SeccionEnum seccion) {
        this.seccion = seccion;
    }
    
    /*
    • Traslado de sección de un empleado del personal de servicio.
    */
    public void cambioSeccion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Actualmete pertenece a " + this.seccion +"\n¿Quiere asignar otra sección? (s/n)");
        char op = leer.next().charAt(0);
        switch (op) {
            case 's':
                do {
                    System.out.println("ELIJA LA SECCIÓN PARA CAMBIO: \n1.ALUMNOS\n2.BIBLIOTECA\n3.DECANATO\n4.EGRESADOS\n5.ECONOMATO\n6.SECRETARIA ACADEMICA\n7.CONCURSO");
                    num=leer.nextInt();
                switch (num) {
                    case 1:
                        this.seccion=SeccionEnum.ALUMNOS;
                        break;
                    case 2:
                        this.seccion=SeccionEnum.BIBLIOTECA;
                        break;
                    case 3:
                        this.seccion=SeccionEnum.DECANATO;
                        break;
                    case 4:
                        this.seccion=SeccionEnum.EGRESADOS;
                        break;
                    case 5:
                        this.seccion=SeccionEnum.ECONOMATO;
                        break;
                    case 6:
                        this.seccion=SeccionEnum.SECRETARÍA;
                        break;
                    case 7:
                        this.seccion=SeccionEnum.CONCURSO;
                        break;
                    default:
                        System.out.println("Ingresó una opción incorrecta");
                        break;
                }
                } while (num>7);
                break;
            case 'n':
                System.out.println("Continúa en el mismo sección");
                this.seccion=getSeccion();
                break;
            default:
                System.out.println("Ingreso una opción incorrecta. Por defecto queda en misma sección");;
                this.seccion=getSeccion();
                break;
        }
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); 
    }

    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Pertenece a la sección: "+this.seccion);
    }
    
    
}
