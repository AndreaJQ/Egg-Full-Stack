package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaServicio {
     CuentaBancaria cuenta = new CuentaBancaria();
    public CuentaBancaria CrearCuenta(){
        Scanner leer= new Scanner(System.in);
       
        System.out.println("Ingrese el Nro de Cuenta");
        cuenta.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese el Titular de Cuenta");
        cuenta.setTitular(leer.next());
        System.out.println("Ingrese el DNI del Titular");
        cuenta.setDNICliente(leer.nextLong());
        System.out.println("Ingrese el Saldo");
        cuenta.setSaldoActual(leer.nextInt());
        
        return cuenta;
    }
    
    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero 
    a ingresar y se la sumara a saldo actual.*/  
    public int ingreso(){
        Scanner leer= new Scanner(System.in);
        int ingresoDinero;
        System.out.println("Cuanto dinero quiere ingresar");
        ingresoDinero= leer.nextInt();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingresoDinero);
        return cuenta.getSaldoActual();
    }
    
/*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
    Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.*/ 
    
    public int retirar (){
        Scanner leer= new Scanner(System.in);
        System.out.println("Cuanto dinero quiere retirar");
        int retiro= leer.nextInt();
        cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
        return cuenta.getSaldoActual()-retiro;
    }
    
/*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.*/
    public int extraccionRapida(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Cuanto dinero quiere retirar");
        int extRapida= leer.nextInt();
        if (extRapida< cuenta.getSaldoActual()*0.2) {
            System.out.println("Se puede realizar la extracción");
            cuenta.setSaldoActual(cuenta.getSaldoActual()-extRapida);
            return cuenta.getSaldoActual()-extRapida;
        }else{
            System.out.println("No se puede realizar la extracción, supera el 20%");
            
            return cuenta.getSaldoActual();
        }
        
        
    }
    
    
/*g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    public void consultarSaldo(){
        System.out.println("Su Saldo es: " + cuenta.getSaldoActual());
        
    }

/*h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    public void consultarDatos(){
        System.out.println("Titular " + cuenta.getTitular());
        System.out.println("Nro de Cuenta " + cuenta.getNumCuenta());
        System.out.println("DNI del Titular " + cuenta.getDNICliente());
        System.out.println("Saldo " + cuenta.getSaldoActual());
    }
    
    
}
