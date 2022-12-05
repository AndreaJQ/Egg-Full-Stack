/*
Se registrará una póliza, donde se guardará los datos tanto de un vehículo, como los datos de un solo cliente.
Los datos incluidos en ella son: número de póliza, fecha de inicio y fin de la póliza, 
cantidad de cuotas, forma de pago, monto total asegurado, incluye granizo, monto máximo granizo,
tipo de cobertura (total, contra terceros, etc.). 
Nota: prestar atención al principio de este enunciado y pensar en las relaciones entre clases.
Recuerden que pueden ser de uno a uno, de uno a muchos, de muchos a uno o de muchos a muchos. */
package Entidades;

import java.util.Date;

/**
 *
 * @author andreajalil
 */
public class GestionPolizas {
    private GestionIntegralClientes client;
    private GestionVehiculos vehiculos;
    private Integer poliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cuotas;
    private FormaPago formaPago;
    private Integer montoTotalAsegurado;
    private Boolean cubreGranizo;
    private Integer montoMaxGranizo;
    private TipoCobertura tipoCobertura;

    public GestionPolizas() {
    }

    public GestionPolizas(GestionIntegralClientes client, GestionVehiculos vehiculos, Integer poliza, Date fechaInicio, Date fechaFin, Integer cuotas, FormaPago formaPago, Integer montoTotalAsegurado, Boolean cubreGranizo, Integer montoMaxGranizo, TipoCobertura tipoCobertura) {
        this.client = client;
        this.vehiculos = vehiculos;
        this.poliza = poliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.cubreGranizo = cubreGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public GestionIntegralClientes getClient() {
        return client;
    }

    public void setClient(GestionIntegralClientes client) {
        this.client = client;
    }

    public GestionVehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(GestionVehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Integer getPoliza() {
        return poliza;
    }

    public void setPoliza(Integer poliza) {
        this.poliza = poliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Integer montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Boolean getCubreGranizo() {
        return cubreGranizo;
    }

    public void setCubreGranizo(Boolean cubreGranizo) {
        this.cubreGranizo = cubreGranizo;
    }

    public Integer getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Integer montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "GestionPolizas{" + "client=" + client + ", vehiculos=" + vehiculos + ", poliza=" + poliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", cubreGranizo=" + cubreGranizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
    
}
