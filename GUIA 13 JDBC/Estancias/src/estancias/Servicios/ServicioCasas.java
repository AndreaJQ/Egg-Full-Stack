
package estancias.Servicios;

import estancias.Entidades.Casa;
import estancias.Persistencia.CasasDAO;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author andreajalil
 */
public class ServicioCasas {
    //INSTANCIAR EL DAO CORRESPONDIENTE Y EL CONSTRUCTOR.
    //buenas prácticas
    private CasasDAO cDAO;
    private Scanner leer;
    
    
    public ServicioCasas(){
    this.cDAO= new CasasDAO();
    this.leer=new Scanner(System.in).useDelimiter("\n");
}
    
    
    
    //CREAR NUEVO PRODUCTO
   public void crearCasa(Integer id_casa, String calle, Integer numero, Integer codigo_postal, String ciudad,
           String pais, LocalDate fecha_desde, LocalDate fecha_hasta,Integer tiempo_minimo, Integer tiempo_maximo,
           Double precio_habitacion, String tipo_vivienda) throws Exception{//tiene que ser INTEGER
       try {
           if (id_casa == null || id_casa<0) {
               throw new Exception("DEBE INGRESAR UN CODIGO");
           }
           if (calle == null || calle.trim().isEmpty()) {
               throw new Exception("DEBE INGRESAR UN NOMBRE DE CALLE");
           }
           if (numero == null || numero<0) {
               throw new Exception("DEBE INGRESAR EL NUMERO DE CALLE");
           }
           if (codigo_postal == null || codigo_postal<0) {
               throw new Exception("DEBE INGRESAR UN CODIGO POSTAL");
           }
           
            
           
           Casa c = new Casa();
           c.setId_casa(id_casa);
           c.setCalle(calle);
           c.setNumero(numero);
           c.setCodigo_postal(codigo_postal);
           c.setCiudad(ciudad);
           c.setPais(pais);
           c.setFecha_desde(fecha_desde);
           c.setFecha_hasta(fecha_hasta);
           c.setTiempo_minimo(tiempo_minimo);
           c.setTiempo_maximo(tiempo_maximo);
           c.setPrecio_habitacion(precio_habitacion);
           c.setTipo_vivienda(tipo_vivienda);
           
           
       
           cDAO.guardarCasa(c);
       } catch (Exception e) {
            throw e;
       }
      
   }
    
   //b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 CASAS
// y el 31 de agosto de 2020 en Reino Unido.
    
    public void seleccionarFechas(){
        
    }
    
    public void fechasSeleccionadas() throws Exception{
        
           
        try {
            
            List<Casa> casas = cDAO.fechasSeleccionadas();
            System.out.println("\033[36m"+"b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.\n"+"\033[30m");

            if (casas.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {System.out.println("--------------- L I S T A        C A S A S -------------------");
                System.out.printf("%-10s%-20s%-10s%-10s%-10s%-15s%-15s%-15s%-10s%-10s%-10s%-10s\n", "id_casa"," calle" , "numero" , "CP", "ciudad", "pais", "desde", "hasta", "minimo", "maximo", "precio", "tipo");
                casas.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service");

        }
    
    }
    //d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico. CASAS
    
    public void seleccionarFechaDia() throws Exception{
        System.out.println("INGRESE FECHA INICIAL AÑO/MES/DIA");
        String fecha=leer.next();
        //String fechainicioAux=leer.next();
        //LocalDate fecha= LocalDate.parse(fechainicioAux);
        
        System.out.println("INGRESE LA CANTIDAD DE DIAS");
        int dia=leer.nextInt();
        
        casasDisponiblesFechaDias(fecha, dia);
        
    }
    
    
    
    
    
    public void casasDisponiblesFechaDias(String fecha, int dia) throws Exception{       
        try {
            List<Casa> casas = cDAO.casasDisponiblesFechaDias(fecha, dia);
            
            
            System.out.println("\033[36m"+"Casas disponibles para la fecha: "+fecha+" y para la cantidad de días: '"+dia+"'\n"+"\033[30m");

            if (casas.isEmpty()) {
                System.out.println("La lista está vacia");
            } else {System.out.println("--------------- L I S T A        C A S A S -------------------");
                System.out.printf("%-10s%-20s%-10s%-10s%-10s%-15s%-15s%-15s%-10s%-10s%-10s%-10s\n", "id_casa"," calle" , "numero" , "CP", "ciudad", "pais", "desde", "hasta", "minimo", "maximo", "precio", "tipo");
                casas.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error Service");

        }
    
    }
    
}
