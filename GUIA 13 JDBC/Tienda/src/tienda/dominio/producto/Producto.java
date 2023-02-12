/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.dominio.producto;

/**
 *
 * @author andreajalil
 */
public class Producto {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer codigo_Fabricante;

    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public Producto(Integer codigo, String nombre, Double precio, Integer codigo_Fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_Fabricante = codigo_Fabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigo_Fabricante() {
        return codigo_Fabricante;
    }

    public void setCodigo_Fabricante(Integer codigo_Fabricante) {
        this.codigo_Fabricante = codigo_Fabricante;
    }

    @Override
    public String toString() {
        return  String.format("%-8s%-35s%-10s%-5s", codigo, nombre, precio, codigo_Fabricante);
    }
    
    public String toStringprecio() {
        return  String.format("%-35s%-10s", codigo, nombre, precio, codigo_Fabricante);
    }
    
    
    
    
}
