
package Entidad;

import java.util.Comparator;

public class Producto {
 private String nombreProd;
 private Double precio;

    public Producto() {
    }

    public Producto(String nombreProd, Double precio) {
        this.nombreProd = nombreProd;
        this.precio = precio;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProd=" + nombreProd + ", precio=" + precio + '}';
    }

   
 
    
}
