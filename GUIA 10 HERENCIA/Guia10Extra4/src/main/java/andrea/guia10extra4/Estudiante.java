/*

• En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
*/
package andrea.guia10extra4;

import Enum.DeptoEnum;
import Enum.EstadoCivilEnum;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Estudiante extends Persona{
    private DeptoEnum curso;

    public Estudiante() {
    }

    public Estudiante(DeptoEnum curso, String nombre, String apellido, Integer Dni, EstadoCivilEnum estadoCivil) {
        super(nombre, apellido, Dni, estadoCivil);
        this.curso = curso;
    }

    public DeptoEnum getCurso() {
        return curso;
    }

    public void setCurso(DeptoEnum curso) {
        this.curso = curso;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


  
    /*
    • Matriculación de un estudiante en un nuevo curso.
    */
    public void matriculacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
         System.out.println("Estudiante de Apellido "+ getApellido()+"\nActualmete está cursando " + this.curso +"\n¿Quiere matricular otro Curso? (s/n)");
        char op = leer.next().toLowerCase().charAt(0);
        switch (op) {
            case 's':
                do {
                    System.out.println("ELIJA EL CURSO PARA MATRICULAR: \n1.FONÉTICA\n2.HISTORIA\n3.LENGUA\n4.LINGÜÌSTICA\n5.LITERATURA\n6.LÓGICA\n7.MATEMÀTICAS");
                    num=leer.nextInt();
                switch (num) {
                    case 1:
                        this.curso=DeptoEnum.FONETICA;
                        break;
                    case 2:
                        this.curso=DeptoEnum.HISTORIA;
                        break;
                    case 3:
                        this.curso=DeptoEnum.LENGUA;
                        break;
                    case 4:
                        this.curso=DeptoEnum.LINGUISTICA;
                        break;
                    case 5:
                        this.curso=DeptoEnum.LITERATURA;
                        break;
                    case 6:
                        this.curso=DeptoEnum.LOGICA;
                        break;
                    case 7:
                        this.curso=DeptoEnum.MATEMATICA;
                        break;
                    default:
                        System.out.println("Ingresó una opción incorrecta");
                        break;
                }
                } while (num>7);
                break;
            case 'n':
                System.out.println("Continúa en el mismo departamento");
                this.curso=getCurso();
                break;
            default:
                System.out.println("Ingreso una opción incorrecta. Por defecto queda en mismo departamento");;
                this.curso=getCurso();
                break;
        }
        
    }
    
    
    /*
    • Imprimir toda la información de cada tipo de individuo.
    */

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Curso: " + getCurso());
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        int num;
        do {
                    System.out.println("ELIJA EL CURSO PARA MATRICULAR: \n1.FONÉTICA\n2.HISTORIA\n3.LENGUA\n4.LINGÜÌSTICA\n5.LITERATURA\n6.LÓGICA\n7.MATEMÀTICAS");
                    num=leer.nextInt();
                switch (num) {
                    case 1:
                        this.curso=DeptoEnum.FONETICA;
                        break;
                    case 2:
                        this.curso=DeptoEnum.HISTORIA;
                        break;
                    case 3:
                        this.curso=DeptoEnum.LENGUA;
                        break;
                    case 4:
                        this.curso=DeptoEnum.LINGUISTICA;
                        break;
                    case 5:
                        this.curso=DeptoEnum.LITERATURA;
                        break;
                    case 6:
                        this.curso=DeptoEnum.LOGICA;
                        break;
                    case 7:
                        this.curso=DeptoEnum.MATEMATICA;
                        break;
                    default:
                        System.out.println("Ingresó una opción incorrecta");
                        break;
                }
                } while (num>7);
    }
    
    
}
