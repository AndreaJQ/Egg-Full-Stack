package andrea.guia10extra3;

/**
 *
 * @author andreajalil
 */
public class Hotel4estrellas extends Hotel{
    private GymEnum gym;
    private String nameRest;
    private int capRest;

    public Hotel4estrellas() {
    }

    public Hotel4estrellas(GymEnum gym, String nameRest, int capRest, int rooms, int beds, int floors, Double price, String nombre, String direccion, String localidad, String gerente) {
        super(rooms, beds, floors, price, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nameRest = nameRest;
        this.capRest = capRest;
    }

    public GymEnum getGym() {
        return gym;
    }

    public void setGym(GymEnum gym) {
        this.gym = gym;
    }

    public String getNameRest() {
        return nameRest;
    }

    public void setNameRest(String nameRest) {
        this.nameRest = nameRest;
    }

    public int getCapRest() {
        return capRest;
    }

    public void setCapRest(int capRest) {
        this.capRest = capRest;
    }

    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();
     
        System.out.println("Cual es el nombre del Restorant?");
        this.nameRest = leer.next().toUpperCase();
        System.out.println("Cantidad de comensales");
        this.capRest = leer.nextInt();
        System.out.println("Categoria es el Gimnasio: A ó B");
        char letra = leer.next().toUpperCase().charAt(0);
        this.gym = compruebaLetra(letra);   
    }
    
    public GymEnum compruebaLetra(char letra){
       GymEnum g;
        switch(letra){
            case 'A':
                g= GymEnum.A;
                break;
            case 'B':
                g= GymEnum.B;
                break;
            default:
                System.out.println("Ingreso una opcion no validad se asignara tipo B");
                g= GymEnum.B;
        }
        return g; 
    }

    @Override
    public Double PrecioHabitacion() {
        super.PrecioHabitacion(); 
        return super.PrecioHabitacion()+vagregadoxRest()+vagregadoxRest();
    }

 

 public double vagregadoxRest(){
     double agregado1;
     if (this.capRest>50) {
         agregado1=50;
     }else if (this.capRest>30) {
         agregado1=30;
     }else{
         agregado1=10;
     }
     return agregado1;
 }
    
 public double vagregadoGym(){
     double agregado2;
     if (this.gym==GymEnum.A) {
         agregado2=50;
     }else{
         agregado2=30;
     }
     return agregado2;
 }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Restaurant: " + this.nameRest + ", Capacidad " + this.capRest + " comensales, \nGimnasio de tipo " + gym;
    }
    
 
    
}
