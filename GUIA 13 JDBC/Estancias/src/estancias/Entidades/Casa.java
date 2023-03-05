package estancias.Entidades;

import java.time.LocalDate;


/**
 *
 * @author andreajalil
 */
public class Casa {

    private Integer id_casa;
    private String calle;
    private Integer numero;
    private Integer codigo_postal;
    private String ciudad;
    private String pais;
    private LocalDate fecha_desde;
    private LocalDate fecha_hasta;
    private Integer tiempo_minimo;
    private Integer tiempo_maximo;
    private Double precio_habitacion;
    private String tipo_vivienda;


public Casa() {
    
}

    public Casa(Integer id_casa, String calle, Integer numero, Integer codigo_postal, 
            String ciudad, String pais, LocalDate fecha_desde, LocalDate fecha_hasta, Integer tiempo_minimo,
            Integer tiempo_maximo, Double precio_habitacion, String tipo_vivienda) {
        this.id_casa = id_casa;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public Integer getId_casa() {
        return id_casa;
    }

    public void setId_casa(Integer id_casa) {
        this.id_casa = id_casa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(Integer codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(LocalDate fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public LocalDate getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(LocalDate fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public Integer getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(Integer tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public Integer getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(Integer tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public Double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(Double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-10s%-10s%-10s%-15s%-15s%-15s%-10s%-10s%-10s%-10s", id_casa, calle , numero , codigo_postal, ciudad, 
                pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda);
    }




}