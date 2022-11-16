/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class OperacionServicio {
    Scanner leer=new Scanner(System.in);
    public Operacion creaOperacion(){
        Operacion op=new Operacion();
        System.out.println("Ingrese el primer numero: ");
        op.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        op.setNum2(leer.nextInt());
        return op;
    }
    
    public int sumar(Operacion op){
        return op.getNum1()+op.getNum2();
    }
    
    public int restar(Operacion op){
        return op.getNum1()-op.getNum2();
    }
    
    public int multiplicar(Operacion op){
        if (op.getNum1()==0 || op.getNum2()==0){
            return 0;
        }else return op.getNum1()*op.getNum2();
    }
    
    public int dividir(Operacion op){
        if (op.getNum2()==0) {
            return -1;
        }else return op.getNum1()/op.getNum2();
    }
}
