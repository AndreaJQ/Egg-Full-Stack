/*
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación y su estado civil. */
package andrea.guia10extra4;

import Enum.EstadoCivilEnum;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Persona {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   protected String nombre;
   protected String apellido;
   protected Integer Dni;
   protected EstadoCivilEnum estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer Dni, EstadoCivilEnum estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
        this.estadoCivil = estadoCivil;
    }
   
   /*
    • Cambio del estado civil de una persona.
    */
    public void cambioEstadoCivil(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("");
        System.out.println("ACTUALIZACIÓN DE ESTADO CIVIL");
        switch (this.estadoCivil) {
            case CASADO:
            {  System.out.println("Seleccione 1 para Divorciado/a o 2 para Viudo/a");
                    int op = leer.nextInt();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.SEPARADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.VIUDO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }}
                break;
            case SOLTERO:
            {System.out.println("Seleccione 1 para Casado/a o 2 para Conviviente");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.CASADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.CONVIVIENTE;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    } }              

                break;
            case CONVIVIENTE:
                {  System.out.println("Seleccione 1 para Separado/a o 2 para Casado/a");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.SEPARADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.CASADO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }}
                break;
            case SEPARADO:
                 {System.out.println("Seleccione 1 para Casado/a o 2 para Conviviente");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.CASADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.CONVIVIENTE;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    } }
                break;
            case VIUDO:
                 {System.out.println("Seleccione 1 para Casado/a o 2 para Conviviente");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.CASADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.CONVIVIENTE;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    } }
                break;
            case ANULADO:
                 {System.out.println("Seleccione 1 para Casado/a o 2 para Conviviente");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.CASADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.CONVIVIENTE;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    } }
                break;
            default:
                 {System.out.println("Seleccione 1 para Casado/a o 2 para Conviviente");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            this.estadoCivil = EstadoCivilEnum.CASADO;
                            break;
                        case 2:
                            this.estadoCivil = EstadoCivilEnum.CONVIVIENTE;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    } }
        }
    }
    
    public void mostrarInfo(){
        System.out.println("\nNombre y Apellido: " + this.nombre + " " + this.apellido+"\nDNI: "+ this.Dni +"\nEstado Civil: " +this.estadoCivil);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", estadoCivil=" + estadoCivil + '}';
    }
    
    public void crearPersona(){
        System.out.println("Ingrese Apellido");
        this.apellido=leer.next();
        System.out.println("Ingrese Nombre");
        this.nombre=leer.next();
        System.out.println("Ingrese DNI");
        this.Dni=leer.nextInt();
        System.out.println("Estado Civil");
        System.out.println("1.Soltero\n2.Casado");
        int op =leer.nextInt();
        switch (op) {
            case 1:
                this.estadoCivil=EstadoCivilEnum.SOLTERO;
                break;
            case 2:
                this.estadoCivil=EstadoCivilEnum.CASADO;
                break;
            default:
                System.out.println("Error...\nQueda por defecto SOLTERO");;
                this.estadoCivil=EstadoCivilEnum.SOLTERO;
                break;
        }
    }
}
