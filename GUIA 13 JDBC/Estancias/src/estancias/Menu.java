/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias;

import estancias.Servicios.ServicioCasas;
import estancias.Servicios.ServicioFamilias;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *Realizar un menú en java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años. FAMILIAS

b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 CASAS
* y el 31 de agosto de 2020 en Reino Unido.

c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail. FAMILIAS

d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico. CASAS

e) Listar los datos de todos los clientes que en algún momento realizaron ESTANCIAS CLIENTES CASA - INNER JOIN
* una estancia y la descripción de la casa donde la realizaron.

f) Listar todas las estancias que han sido reservadas por un cliente,   ESTANCIAS CLIENTE CASA
* mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó. 
* La que reemplazaría a la anterior
 
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea  CASA WHERE PAIS REINO UNIDO
* incrementar el precio por día en un 5% de todas las casas del Reino Unido. 
* Mostar los precios actualizados.

h) Obtener el número de casas que existen para cada uno de los países diferentes. CASA 

i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’. COMENTARIOS CASA

j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas. ESTANCIAS

 * @author andreajalil
 */
public class Menu {
    
    private final ServicioCasas scasa;
    private Scanner leer;
    //BUENAS PRACTICAS
    public Menu(){
        this.scasa= new ServicioCasas();
        this.leer=new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    }
    
    
    public void guardarCasa() throws Exception{
        //Integer id_casa, String calle, Integer numero, Integer codigo_postal, String ciudad,
         //  String pais, Date fecha_desde, Date fecha_hasta,Integer tiempo_minimo, Integer tiempo_maximo,
           //Double precio_habitacion, String tipo_vivienda
        System.out.println("INGRESE ID CASA");
        Integer id_casa=leer.nextInt();
        System.out.println("INGRESE CALLE");
        String calle=leer.next();
        System.out.println("INGRESE NUMERO");
        Integer numero=leer.nextInt();
        System.out.println("INGRESE CODIGO POSTAL");
        Integer codigo_postal=leer.nextInt();
        System.out.println("INGRESE CIUDAD");
        String ciudad=leer.next();
        System.out.println("INGRESE PAIS");
        String pais=leer.next();
        System.out.println("INGRESE FECHA INICIAL AÑO-MES-DIA");
        String fechainicioAux=leer.next();
        LocalDate fecha_desde= LocalDate.parse(fechainicioAux);
        
        System.out.println("INGRESE FECHA FINAL");
        String fechafinAux=leer.next();
        LocalDate fecha_hasta= LocalDate.parse(fechafinAux);
        
        System.out.println("INGRESE TIEMPO MINIMO");
        Integer tiempo_minimo=leer.nextInt();
        System.out.println("INGRESE TIEMPO MÁXIMO");
        Integer tiempo_maximo=leer.nextInt();
        System.out.println("INGRESE PRECIO POR HABITACION");
        Double precio_hab=leer.nextDouble();
        System.out.println("INGRESE TIPO DE VIVIENDA");
        String tipo=leer.next();
        
        scasa.crearCasa(id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_hab, tipo);
    }
    
    public void mostrarFamilias3hijos() throws Exception{
        ServicioFamilias sf=new ServicioFamilias();
        sf.elegirCantidadHijos();
      
    }
}
