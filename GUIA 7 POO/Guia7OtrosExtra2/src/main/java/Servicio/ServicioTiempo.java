package Servicio;

import Entidades.Tiempo;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ServicioTiempo {
    Tiempo t=new Tiempo();
    Scanner sc=new Scanner(System.in);
    Calendar calendario=Calendar.getInstance();
    Timer timer=new Timer();
    
    public void ingresoHora(){
        System.out.println("Ingrese la hora");
        t.setHora(sc.nextInt());
        System.out.println("Ingrese los minutos");
        t.setMin(sc.nextInt());
        System.out.println("Ingrese los segundos");
        t.setSeg(sc.nextInt());
        
    }
    
    public void imprimirHoraCompleta(){

        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
                System.out.println(calendario.getTime());
               //System.out.println(calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE)+":"+calendario.get(Calendar.SECOND));
            }
        };
        
        timer.schedule(tarea, 0,1000);

      
    }
}
