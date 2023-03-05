/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.Entidades;

import java.util.Date;

/**
 *
 * @author andreajalil
 */
public class Estancias {
    private Integer id_estancia;
    private Integer id_cliente;
    private Integer id_casa;
    private String nombre_huesped;
    private Date fecha_desde;
    private Date fecha_hasta;

    public Estancias() {
    }

    public Estancias(Integer id_estancia, Integer id_cliente, Integer id_casa, String nombre_huesped, Date fecha_desde, Date fecha_hasta) {
        this.id_estancia = id_estancia;
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public Integer getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(Integer id_estancia) {
        this.id_estancia = id_estancia;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_casa() {
        return id_casa;
    }

    public void setId_casa(Integer id_casa) {
        this.id_casa = id_casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-10s%-30s%-10s%-10s", id_estancia, id_cliente, id_casa, 
                nombre_huesped, fecha_desde, fecha_hasta);
    }   
}
