
package andrea.guia10extra3;

/**
 *
 * @author andreajalil
 */
public class Residencia extends ExtraHoteleros{
    private int habitaciones;
    private boolean campoDeport;
    private boolean descuento;

    public Residencia() {
    }

    public Residencia(int habitaciones, boolean campoDeport, boolean descuento, boolean privado, double metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.campoDeport = campoDeport;
        this.descuento = descuento;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isCampoDeport() {
        return campoDeport;
    }

    public void setCampoDeport(boolean campoDeport) {
        this.campoDeport = campoDeport;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); 
        System.out.println("Cantidad de Habitaciones");
        this.habitaciones = leer.nextInt();
        System.out.println("Tiene Campo Deportivo: S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.campoDeport = true;
        } else if (op == 'N') {
            this.campoDeport = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
            this.campoDeport = false;
        }
        System.out.println("Ofrece descuento a los gremios: S/N");
        char op2 = leer.next().toUpperCase().charAt(0);
        if (op2 == 'S') {
            this.descuento = true;
        } else if (op == 'N') {
            this.descuento = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No ofrece descuento");
            this.descuento = false;
        }
    }
    
    @Override
    public String toString() {
        String desc = "NO TIENE";
        String camp = "NO TIENE";
        if(this.descuento){
            desc = "TIENE";
        }
        if (this.campoDeport){
            camp = "TINE";
        }
        System.out.println(super.toString());
          return "Residencia: " + this.habitaciones + " habitaciones,\n" + desc + " descuento a gremios y \n" + camp + " Campo Deportivo";
        
    
    }
    
    
   
}
