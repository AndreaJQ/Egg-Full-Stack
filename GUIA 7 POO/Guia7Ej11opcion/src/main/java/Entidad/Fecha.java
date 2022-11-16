
package Entidad;


import java.util.Date;


public class Fecha {
   
    private Date fecha;
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(Date fecha, int dia, int mes, int anio) {
        this.fecha = fecha;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha=new Date(anio-1900, mes-1, dia);
    }

   
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    
    
}
