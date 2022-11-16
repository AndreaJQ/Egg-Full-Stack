package Entidades;


public class CuentaBancaria {
    private int numCuenta;
    private String titular;
    private long DNICliente;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, String titular, long DNICliente, int saldoActual) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    

    
    
    
    
}
