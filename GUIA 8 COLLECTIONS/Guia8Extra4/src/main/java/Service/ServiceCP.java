/**
 * Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página:
https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos*/

package Service;

import Entidad.Ciudad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServiceCP {
    private Scanner sc;
    private HashMap<Integer,String> cpHashMap;
    public Ciudad c=new Ciudad();
    
    
    public ServiceCP(){
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.cpHashMap = new HashMap();
        cpHashMap.put(1001, "CABA");
        cpHashMap.put(4000, "San Miguel de Tucumán");
        cpHashMap.put(2015, "Rosario");
        cpHashMap.put(4407, "El Encon");
        
    }
    public void menu(){
        System.out.println("Bienvenido al sistema de Correo Argentino :)");
        int op=0;
        do {
            System.out.println("------------:::MENU:::------------");
            System.out.println("Qué desea realizar:\n"
                    + "1- Ingresar una ciudad y código postal.\n"
                    + "2- Eliminar un ciudades cargadas.\n"
                    + "3- Mostras Información.\n"
                    + "4- Buscar un código postal.\n"
                    + "5- Salir");
            op=sc.nextInt();
            switch (op) {
                case 1 -> agregarCP();
                case 2 -> eliminarCP();
                case 3 -> mostrarInfo();
                case 4 -> mostrarCiudaddeCP();
                case 5 -> System.out.println("Saliendo...  ... ...\n"
                            + "Gracias por usar nuestro sistema.");
                default -> System.out.println("error... no indicó una opción correcta!");
            }
        } while (op!=5);
    }
    
    public void agregarCP(){
        String rta;
        System.out.println("------------:::INGRESO DE INFORMACIÓN:::------------");
        do {
            System.out.println("Ingrese la ciudad.");
            c.setCiudad(sc.next().toUpperCase());//seteo nombre
            System.out.println("Ingrese el Código Postal.");
            c.setCp(sc.nextInt());
            ingresoCP(c.getCp(), c.getCiudad());//medoto para agregar los productos
            System.out.println("-----------------------");
            System.out.println("¿Desea seguir agregando ciudades?");
            rta=sc.next();
        } while (rta.equalsIgnoreCase("s"));
        System.out.println("................");
    }
    
    public void ingresoCP(Integer CP,String city){
        cpHashMap.put(c.getCp(),c.getCiudad());
           
    }
    
    public void mostrarInfo(){
        System.out.println("INFORMACION DE CIUDADES Y CODIGOS POSTALES");
        for (Map.Entry<Integer, String> entry : cpHashMap.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key +" - "+ val);
        }
        System.out.println("................");
        mostrarOrdenCP();
        mostrarOrdenCity();
    }
    
    public void mostrarOrdenCP(){
        System.out.println("ORDENADAS POR CÓDIGO POSTAL");
        cpHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry->System.out.println(entry.getKey()+" - "+entry.getValue()));
        System.out.println("................");
    }
    public void mostrarOrdenCity(){
        System.out.println("ORDENADAS POR CIUDAD");
        cpHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry->System.out.println(entry.getValue()+" - "+entry.getKey()));
        System.out.println("................");
        
    }
    
    public void mostrarCiudaddeCP(){
        System.out.println("------------:::BUSCANDO CIUDAD:::------------");
        System.out.println("Ingrese el codigo postal.");
        Integer buscar=sc.nextInt();
        boolean flag;
//        Iterator<HashMap.Entry<Integer,String>> it= cpHashMap.entrySet().iterator();
//        while (it.hasNext()) {
//            if (it.next().getKey().equals(buscar)) {
//              flag=true;
//                System.out.println("La ciudad es:");
//                System.out.println(it.toString());
//            }
//        }
       
        for (Map.Entry<Integer, String> entry : cpHashMap.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            if (key.equals(buscar)) {
                System.out.println(val);
            }
        }
        System.out.println("................");
    
    }
    
    public void eliminarCP(){
        System.out.println("------------:::ELIMINAR CIUDAD:::------------");
        System.out.println("Ingrese el CP de la ciudad que desea eliminar.");
        Integer borrarCP=sc.nextInt();
        cpHashMap.remove(borrarCP);
        //c.setCiudad(sc.next());
//        if (cpHashMap.containsValue(borrarCP)) {
//            cpHashMap.remove(borrarCP);
//        }
       
       
        System.out.println("................");
    }
}
