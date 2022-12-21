package andrea.guia10extra3;

/**
 *
 * @author andreajalil
 */
public class Hotel extends Alojamiento{
    
    protected int rooms;
    protected int beds;
    protected int floors;
    protected Double price;

    public Hotel() {
    }

    public Hotel(int rooms, int beds, int floors, Double price, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.rooms = rooms;
        this.beds = beds;
        this.floors = floors;
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();
        System.out.print("HOTEL ");
        System.out.println("Ingrese la cantidad de Camas");
        this.beds = leer.nextInt();
        System.out.println("Cuantas Habitaciones tiene?");
        this.rooms = leer.nextInt();
        System.out.println("Cuantos Pisos?");
        this.floors = leer.nextInt();
    }

    @Override
    public String toString() {
        return "\nHotel '"+this.nombre + "'\nCantidad de habitaciones: " + rooms + "\nCantidad de camas: " + beds + "\nCantidad de pisos: " + floors + "\nPrecio: $" + price ;
    }
    
     public Double PrecioHabitacion(){
        return (double) 50*(this.beds*1);
    }
    
}
