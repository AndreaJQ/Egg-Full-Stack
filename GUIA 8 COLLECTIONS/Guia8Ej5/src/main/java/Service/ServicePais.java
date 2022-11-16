
package Service;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicePais {
   
    private HashSet<Pais> listaPais;
    private Scanner sc;

    public ServicePais(){
        this.listaPais=new HashSet<>();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void ingresoPais(){
        System.out.println("-----::INGRESO DE PAISES::------");
        String rta="";
        
        do {
            System.out.println("Ingrese un pais");
            String p=sc.next();
            listaPais.add(new Pais(p));
                    
            System.out.println(".....................");            
            System.out.println("¿Quiere ingresar otro pais?");
            rta=sc.next();
        } while (rta.equalsIgnoreCase("si"));
    }
    
    public void mostrar(){
        System.out.println("-----::PAISES INGRESADOS::------");
        for (Pais listaPai : listaPais) {
            System.out.println(listaPai.getPais());
        }
        
    }
   //comparator
    public static Comparator<Pais> ordenaPais=(Pais o1, Pais o2) -> o1.getPais().compareTo(o2.getPais());

    public void ordenarAlfab(){
//        System.out.println("-----::PAISES ORDENADOS::------");//PASAR A TREESET
//        TreeSet<Pais> treePais=new TreeSet<>(listaPais);
//        treePais.descendingIterator();
//        for (Pais treePai : treePais) {
//            System.out.println(treePai);
//        }
        System.out.println("-----::PAISES ORDENADOS::------");
        ArrayList<Pais> ArrayPaises=new ArrayList(listaPais);//pasar el hashset a ArrayList para poder usar Collections.sort
        Collections.sort(ArrayPaises,ordenaPais);
        for (Pais ArrayPaise : ArrayPaises) {
            System.out.println(ArrayPaise.getPais());
        }
    }
  
    
    public void buscarPais(){
        
       boolean flag=true;
        System.out.println("Ingrese un pais a eliminar.");
        String paisElim=sc.next();
        Iterator<Pais> it= listaPais.iterator();
        while (it.hasNext()) {
            if (it.next().getPais().equalsIgnoreCase(paisElim)) {
                it.remove();
                flag=false;
            }
        }
        if (flag) {
            System.out.println("No se encontró en pais.");
        }
        System.out.println("---------::RESTANTES::---------");
        ordenarAlfab();
    }
    
     
}
