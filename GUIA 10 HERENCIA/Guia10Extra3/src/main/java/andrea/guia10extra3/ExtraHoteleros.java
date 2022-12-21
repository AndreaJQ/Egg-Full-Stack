package andrea.guia10extra3;

/**
 *
 * @author andreajalil
 */
public class ExtraHoteleros extends Alojamiento{
    private boolean privado;
    private double metros2;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean privado, double metros2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros2 = metros2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetros2() {
        return metros2;
    }

    public void setMetros2(double metros2) {
        this.metros2 = metros2;
    }

   
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); 
        System.out.println("Es un establecimiento Privado? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.privado = true;
        } else if (op == 'N') {
            this.privado = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que es privado");
            this.privado = true;
        }

        System.out.println("Cuantas Metros cuadrados tiene?");
        this.metros2 = leer.nextInt();
    }

    @Override
    public String toString() {
        String privado = "Publico";
        if(this.privado){
            privado = "PRIVADO";
        }
        System.out.println(super.toString());
        return "Establecimiento Extra-Hotel de tipo " + privado + "\ncon " + this.metros2 + " mts2";
    }
    
    
    
}
