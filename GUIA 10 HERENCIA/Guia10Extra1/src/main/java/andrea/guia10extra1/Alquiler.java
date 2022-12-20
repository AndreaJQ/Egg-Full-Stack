
package andrea.guia10extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Alquiler {
     Scanner sc= new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int dniCliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posicionAmarre;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dniCliente, LocalDate fechaInicio, LocalDate fechaFin, int posicionAmarre) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
       
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
   
    public void fechaAlquiler(){
        System.out.println("Indique desde qué fecha quiere alquilar (aaaa-mm-dd)");
        String fechainicioAux=sc.next();
        this.fechaInicio= LocalDate.parse(fechainicioAux);
        
        System.out.println("Indique hasta qué fecha quiere alquilar (aaaa-mm-dd)");
        String fechaFinAux=sc.next();
        this.fechaFin=LocalDate.parse(fechaFinAux);
    }
    
    public int calcularDias(LocalDate fechaInicio, LocalDate fechaFin){
        int dias= (int) ChronoUnit.DAYS.between( this.fechaInicio,this.fechaFin);
        
        return dias;
    }
    
    public void alquilando(){
        System.out.println("¿Desea alquilarlo? (s/n)");
        String resp=sc.next();
        
        switch (resp) {
            case "s":
                
                System.out.println("INGRESO DE INFORMACIÓN DE CLIENTE");
                System.out.println("Ingrese su nombre y apellido: ");
                this.nombre=sc.next();
                System.out.println("Ingrese su DNI");
                this.dniCliente=sc.nextInt();
                fechaAlquiler();
                infoCliente();
                break;
            case "n":
                System.out.println("VOLVIENDO AL MENU...");
                break;
            default:
                System.out.println("error... no indicó una opción correcta!");
        }
        
    }
    public void infoCliente(){
        System.out.println("CARGANDO INFORMACIÓN...");
        System.out.println("...............................");
        System.out.println(":Barco cargado a nombre de: \n"
                + getNombre()+" DNI: " + getDniCliente());
        System.out.println("...............................");
    }
}
