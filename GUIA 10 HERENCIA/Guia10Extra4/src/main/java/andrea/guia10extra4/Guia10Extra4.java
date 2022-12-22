/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. 
A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación.
A continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. 
Incluya un programa de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. */

package andrea.guia10extra4;

import Enum.DeptoEnum;
import Enum.EstadoCivilEnum;
import Enum.SeccionEnum;
import Service.ServicePersona;
import java.util.ArrayList;

/**
 *
 * @author andreajalil
 */
public class Guia10Extra4 {

    public static void main(String[] args) {
        ArrayList<Persona> listPersonas=new ArrayList<>();
        
        PersonalServicio P1=new PersonalServicio(SeccionEnum.ALUMNOS, 2012, 15, "Luisa", "Quiroga", 12463931, EstadoCivilEnum.CASADO);
        PersonalServicio P2= new PersonalServicio(SeccionEnum.CONCURSO, 2009, 9, "Luisa", "Jalil", 12000021, EstadoCivilEnum.CONVIVIENTE);
        Estudiante E1=new Estudiante(DeptoEnum.FONETICA, "Andrea", "Jalil", 32414032, EstadoCivilEnum.SOLTERO);
        Estudiante E2=new Estudiante(DeptoEnum.LINGUISTICA, "Enrique", "Josten", 36414032, EstadoCivilEnum.SOLTERO);
        Estudiante E3=new Estudiante(DeptoEnum.LITERATURA, "Julieta", "Durante", 33444055, EstadoCivilEnum.SOLTERO);
        Profesor Pr1=new Profesor(DeptoEnum.LENGUA, 2014, 6, "Marta", "Martin", 12342345, EstadoCivilEnum.CASADO);
        Profesor Pr2=new Profesor(DeptoEnum.FONETICA, 2012, 5, "Luis", "Marquez", 23342345, EstadoCivilEnum.CASADO);
        Profesor Pr3=new Profesor(DeptoEnum.LENGUA, 2014, 6, "Pablo", "Gonzalez", 21342333, EstadoCivilEnum.CONVIVIENTE);
        
        
        listPersonas.add(P1);
        listPersonas.add(P2);
        listPersonas.add(E1);
        listPersonas.add(E2);
        listPersonas.add(E3);
        listPersonas.add(Pr1);
        listPersonas.add(Pr2);
        listPersonas.add(Pr3);
        
        ServicePersona sp= new ServicePersona();
        sp.menu(listPersonas);
       
               
    }
}
