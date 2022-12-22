/*
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
package andrea.guia10extra4;

import Enum.DeptoEnum;
import Enum.EstadoCivilEnum;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Profesor extends Empleado{
    
     private DeptoEnum depto;

    public Profesor() {
    }

    public Profesor(DeptoEnum depto, Integer year, Integer despacho, String nombre, String apellido, Integer Dni, EstadoCivilEnum estadoCivil) {
        super(year, despacho, nombre, apellido, Dni, estadoCivil);
        this.depto = depto;
    }

    public DeptoEnum getDepto() {
        return depto;
    }

    public void setDepto(DeptoEnum depto) {
        this.depto = depto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
  /*
    • Cambio de departamento de un profesor.
    */
    public void cambioDepto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Docente de Apellido "+ getApellido()+"\nActualmete pertenece al departamento " + this.depto +"\n¿Quiere asignar otro Departamento? (s/n)");
        char op = leer.next().toLowerCase().charAt(0);
        switch (op) {
            case 's':
                do {
                    System.out.println("ELIJA LA SECCIÓN PARA CAMBIO: \n1.FONÉTICA\n2.HISTORIA\n3.LENGUA\n4.LINGÜÌSTICA\n5.LITERATURA\n6.LÓGICA\n7.MATEMÀTICAS");
                    num=leer.nextInt();
                switch (num) {
                    case 1:
                        this.depto=DeptoEnum.FONETICA;
                        break;
                    case 2:
                        this.depto=DeptoEnum.HISTORIA;
                        break;
                    case 3:
                        this.depto=DeptoEnum.LENGUA;
                        break;
                    case 4:
                        this.depto=DeptoEnum.LINGUISTICA;
                        break;
                    case 5:
                        this.depto=DeptoEnum.LITERATURA;
                        break;
                    case 6:
                        this.depto=DeptoEnum.LOGICA;
                        break;
                    case 7:
                        this.depto=DeptoEnum.MATEMATICA;
                        break;
                    default:
                        System.out.println("Ingresó una opción incorrecta");
                        break;
                }
                } while (num>7);
                break;
            case 'n':
                System.out.println("Continúa en el mismo departamento");
                this.depto=getDepto();
                break;
            default:
                System.out.println("Ingreso una opción incorrecta. Por defecto queda en mismo departamento");;
                this.depto=getDepto();
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
        System.out.println("Departamento: " + this.depto);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        int num;
        do {
                    System.out.println("ELIJA LA SECCIÓN PARA CAMBIO: \n1.FONÉTICA\n2.HISTORIA\n3.LENGUA\n4.LINGÜÌSTICA\n5.LITERATURA\n6.LÓGICA\n7.MATEMÀTICAS");
                    num=leer.nextInt();
                switch (num) {
                    case 1:
                        this.depto=DeptoEnum.FONETICA;
                        break;
                    case 2:
                        this.depto=DeptoEnum.HISTORIA;
                        break;
                    case 3:
                        this.depto=DeptoEnum.LENGUA;
                        break;
                    case 4:
                        this.depto=DeptoEnum.LINGUISTICA;
                        break;
                    case 5:
                        this.depto=DeptoEnum.LITERATURA;
                        break;
                    case 6:
                        this.depto=DeptoEnum.LOGICA;
                        break;
                    case 7:
                        this.depto=DeptoEnum.MATEMATICA;
                        break;
                    default:
                        System.out.println("Ingresó una opción incorrecta");
                        break;
                }
                } while (num>7);
    }

  
    
    
     
     
}
