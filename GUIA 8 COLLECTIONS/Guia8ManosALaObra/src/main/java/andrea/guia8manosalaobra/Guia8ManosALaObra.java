/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package andrea.guia8manosalaobra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author andreajalil
 */
public class Guia8ManosALaObra {

    public static void main(String[] args) {
            
    ArrayList<Integer> listado = new ArrayList(); 
    HashSet<String> persona = new HashSet(); 
    HashMap<Integer,String> personas = new HashMap();
          
    listado.add(77);
    listado.add(36);
    listado.add(90);
    listado.add(65);
    listado.add(23);
        System.out.println(listado.size());
    
    persona.add("Marta");
    persona.add("Gabriela");
    persona.add("Julieta");
    persona.add("Andrea");
    persona.add("Enrique");
     
    personas.put(1,"Luisa");
    personas.put(2,"Adolfo");
    personas.put(3, "Luisina");
    personas.put(4, "Estela");
    personas.put(5, "Flavio");
        System.out.println("MOSTRAR CON FOREACH");
        System.out.println("------------ArrayList------------");
         for (Integer mostrar : listado) {
            System.out.println(mostrar);
        }
         System.out.println("------------HashSet------------");
          for (String mostrar : persona) {
            System.out.println(mostrar);
        }
         System.out.println("------------HashMap------------");
        for (Map.Entry<Integer, String> mostrar : personas.entrySet()) {
            Object key = mostrar.getKey();
            Object val = mostrar.getValue();
            System.out.println("key" + key + "value "+ val);
        }
            
       listado.remove(2);
       persona.remove("Enrique");
       personas.remove(2);
       
       System.out.println("------------Once Removed------------");
        System.out.println("------------ArrayList------------");
         for (Integer mostrar : listado) {
            System.out.println(mostrar);
        }
         System.out.println("------------TreeSet------------");
          for (String mostrar : persona) {
            System.out.println(mostrar);
        }
         System.out.println("------------HashMap------------");
        for (Map.Entry<Integer, String> mostrar : personas.entrySet()) {
            Object key = mostrar.getKey();
            Object val = mostrar.getValue();
            System.out.println("key" + key + "value "+ val);
        }
        System.out.println("-----------Iterator - Remove-----------");
         Iterator<Integer> it1=listado.iterator();
        while (it1.hasNext()) {
            Integer next = it1.next();
            if (next==36) {
                it1.remove();
            }
        }
        System.out.println("------------ArrayList------------");
        System.out.println(listado);
        
        Iterator<String> it2=persona.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (next.equals("Gabriela")) {
                it2.remove();
            }
        }
        System.out.println("------------HashSet------------");
        System.out.println(persona);
        
        System.out.println("  ");
        System.out.println("---------ORDENADOS---------");
        Collections.sort(listado);
        System.out.println("------------ArrayList------------");
        System.out.println(listado);
        
        //ArrayList<String>listaPersona=new ArrayList(persona);
        TreeSet <String> listP=new TreeSet(persona);
        //Collections.sort(listP);SE PUEDE PASAR HASHSET A TREESET Y SE ORDENA
        System.out.println("------------HashSet------------");
        System.out.println(listP);
        
        TreeMap<Integer,String> listPersonas=new TreeMap(personas);
        System.out.println("------------TreeMap------------");
        System.out.println(personas);
        
        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println("----------manos a la obra---------");
        HashMap<Integer,String> people = new HashMap(); 
        String n1 = "Albus";
        String n2 = "Severus";
        people.put(1, n1);
        people.put(2,n2);
        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("key "+key + val);
        }

        System.out.println("Metodo iterador remove()");
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        System.out.println(bebidas);
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        System.out.println("-----------");
        System.out.println(bebidas);
    }
}
