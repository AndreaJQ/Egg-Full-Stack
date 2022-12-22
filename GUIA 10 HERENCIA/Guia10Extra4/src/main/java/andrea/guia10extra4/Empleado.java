/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10extra4;

import Enum.EstadoCivilEnum;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Empleado extends Persona{
    protected Integer year;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(Integer year, Integer despacho, String nombre, String apellido, Integer Dni, EstadoCivilEnum estadoCivil) {
        super(nombre, apellido, Dni, estadoCivil);
        this.year = year;
        this.despacho = despacho;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /*
    • Reasignación de despacho a un empleado.
    */
    public void cambioDespacho(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ACTUALIZACIÓN DE DESPACHO");
        System.out.println("Actualmete pertenece a " + this.despacho +"\n¿Quiere asignar otro despacho? (s/n)");
        char op = leer.next().charAt(0);
        switch (op) {
            case 's':
                System.out.println("Ingrese el nombre del despacho");
                setDespacho(leer.nextInt());
                break;
            case 'n':
                System.out.println("Continúa en el mismo despacho");
                this.despacho=getDespacho();
                break;
            default:
                System.out.println("Ingreso una opción incorrecta. Por defecto queda en mismo despacho");;
                this.despacho=getDespacho();
                break;
        }
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Año de Ingreso a la Institución: "+ this.year + "\nNro de despacho: '"+this.despacho+"'"); 
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); 
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Ingrese año de Ingreso a la Institución");
        this.year=leer.nextInt();
        System.out.println("Ingrese el número de despacho");
        this.despacho=leer.nextInt();
    }
    
    
    
}
