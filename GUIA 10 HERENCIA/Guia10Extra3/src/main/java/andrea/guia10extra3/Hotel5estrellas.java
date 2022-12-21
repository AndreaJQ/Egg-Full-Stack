package andrea.guia10extra3;

/**
 *
 * @author andreajalil
 */
public class Hotel5estrellas extends Hotel4estrellas{
    private int cantSalon;
    private int cantSuites;
    private int cantLimo;

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(int cantSalon, int cantSuites, int cantLimo, GymEnum gym, String nameRest, int capRest, int rooms, int beds, int floors, Double price, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nameRest, capRest, rooms, beds, floors, price, nombre, direccion, localidad, gerente);
        this.cantSalon = cantSalon;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public int getCantSalon() {
        return cantSalon;
    }

    public void setCantSalon(int cantSalon) {
        this.cantSalon = cantSalon;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }

    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); 
        System.out.println("Cantidad Salones de Eventos");
        this.cantSalon = leer.nextInt();
        System.out.println("Cantidad de Suites");
        this.cantSuites = leer.nextInt();
        System.out.println("Cantidad de limosinas");
        this.cantLimo=leer.nextInt();
    }
    
    @Override
    public Double PrecioHabitacion() {
        return super.PrecioHabitacion()+agregadoLimo(); 
    }
    public double agregadoLimo(){
        return 15*this.cantLimo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Cantidad de Salones de Eventos: "+this.cantSalon+"\nCantidad de Suites: "+this.cantSuites + "\nCantidad de limusinas: " + this.cantLimo;
    }
   
    
}
