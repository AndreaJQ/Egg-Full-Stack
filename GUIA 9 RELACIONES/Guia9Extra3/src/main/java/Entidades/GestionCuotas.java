/*
Se registrarán y podrán consultar las cuotas generadas en cada póliza. 
Esas cuotas van a contener la siguiente información: 
número de cuota, monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia, etc.).*/
package Entidades;

import java.util.Date;

/**
 *
 * @author andreajalil
 */
public class GestionCuotas {
    private GestionPolizas poliza;
    private Integer nroCuota;
    private Integer montoTotal;
    private boolean pagada;
    private Date FechaVencimiento;
    private FormaPago formaPagoCuotas;

    public GestionCuotas() {
    }

    public GestionCuotas(Integer nroCuota, Integer montoTotal, boolean pagada, Date FechaVencimiento, FormaPago formaPagoCuotas) {
        this.nroCuota = nroCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.FechaVencimiento = FechaVencimiento;
        this.formaPagoCuotas = formaPagoCuotas;
    }

    public Integer getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Integer nroCuota) {
        this.nroCuota = nroCuota;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public FormaPago getFormaPagoCuotas() {
        return formaPagoCuotas;
    }

    public void setFormaPagoCuotas(FormaPago formaPagoCuotas) {
        this.formaPagoCuotas = formaPagoCuotas;
    }

    @Override
    public String toString() {
        return "GestionCuotas{" + "nroCuota=" + nroCuota + ", montoTotal=" + montoTotal + ", pagada=" + pagada + ", FechaVencimiento=" + FechaVencimiento + ", formaPagoCuotas=" + formaPagoCuotas + '}';
    }
    
    
}
