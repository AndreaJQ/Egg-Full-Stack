/*
Se registra la información de cada vehículo asegurado. 
Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).*/
package Entidades;

/**
 *
 * @author andreajalil
 */
public class GestionVehiculos {
    private String marca, modelo, chasis ,color;
    private Integer nroMotor;
    private TipoVehiculo Tipo;

    public GestionVehiculos() {
    }

    public GestionVehiculos(String marca, String modelo, String chasis, String color, Integer nroMotor, TipoVehiculo Tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.chasis = chasis;
        this.color = color;
        this.nroMotor = nroMotor;
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(Integer nroMotor) {
        this.nroMotor = nroMotor;
    }

    public TipoVehiculo getTipo() {
        return Tipo;
    }

    public void setTipo(TipoVehiculo Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
