package Entidad;
public class CantanteFamoso {
    private String nombre;
    private String discoMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoMasVentas) {
        this.nombre = nombre;
        this.discoMasVentas = discoMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVentas() {
        return discoMasVentas;
    }

    public void setDiscoMasVentas(String discoMasVentas) {
        this.discoMasVentas = discoMasVentas;
    }

    @Override
    public String toString() {
        return "CantantaFamoso{" + "nombre=" + nombre + ", discoMasVentas=" + discoMasVentas + '}';
    }
    
    
}
