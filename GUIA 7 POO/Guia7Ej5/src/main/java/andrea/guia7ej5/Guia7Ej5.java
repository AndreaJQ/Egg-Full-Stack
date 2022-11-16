
package andrea.guia7ej5;


import Servicio.CuentaServicio;
import java.util.Scanner;

public class Guia7Ej5 {

    public static void main(String[] args) {
        int op;
        CuentaServicio cuentaServ=new CuentaServicio();
        
    
        Scanner leer= new Scanner(System.in);
      
        do {
            System.out.println("Qué desea realizar");
            System.out.println("MENU:");
            System.out.println("1.Crear Cuenta \n2.Ingresar Saldo \n3.Retirar \n4.Extraccion Rapida \n5.Consultar saldo \n6.Consultar datos \n7.Salir");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    cuentaServ.CrearCuenta();
                    break;
                case 2:
                    cuentaServ.ingreso();
                    break;
                case 3:
                    cuentaServ.retirar();
                    break;
                case 4:
                    cuentaServ.extraccionRapida();
                    break;
                case 5:
                    cuentaServ.consultarSaldo();
                    break;
                case 6:
                    cuentaServ.consultarDatos();
                    break;
                case 7:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("El numero ingresado es incorrecto");
            }
        } while (op!=7);

    }
}
