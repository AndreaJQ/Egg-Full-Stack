
package estancias.Persistencia;

import estancias.Entidades.Casa;
import estancias.Entidades.Familias;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author andreajalil
 */
public class CasasDAO extends DAO{
   
    //AGREGAR FABRICANTE
    public void guardarCasa (Casa c) throws Exception{
        try {
            if (c==null) {
                throw new Exception("Información inválida");}
            
            //sentencia sql de inserción 
            //INSERT INTO `estancias_exterior`.`casa` (`id_familia`, `nombre`....etc) 
            //VALUES ('10', 'Apellido');
        
          String sql= "INSERT INTO estancias_exterior.casas (id_casa, calle, numero,codigo_postal,ciudad,pais,fecha_desde,"
                  + "fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda)"
                    +"VALUES('"+c.getId_casa()
                    +"' , '" + c.getCalle()
                    +"' , '" + c.getNumero()
                    +"' , '" + c.getCodigo_postal()
                    +"' , '" + c.getCiudad()
                    +"' , '" + c.getPais()
                    +"' , '" + c.getFecha_desde()
                    +"' , '" + c.getFecha_hasta()
                    +"' , '" + c.getTiempo_minimo()
                    +"' , '" + c.getTiempo_maximo()
                    +"' , '" + c.getPrecio_habitacion()
                    +"' , '" + c.getTipo_vivienda()+"' );";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    public List<Casa>fechasSeleccionadas() throws Exception{
        try {
            String sql = " SELECT *"
                    + " FROM estancias_exterior.casas"
                    + " WHERE casas.fecha_desde = date '2020/08/1'"
                    + " AND casas.fecha_hasta = date '2020/08/31'"
                    + " AND casas.pais = 'reino unido'";
            consultarBase(sql);

           
            List<Casa> casaLista= new ArrayList();
            Casa c = null;
            while (resultado.next()) {
           c = new Casa();
           c.setId_casa(resultado.getInt(1));
           c.setCalle(resultado.getString(2));
           c.setNumero(resultado.getInt(3));
           c.setCodigo_postal(resultado.getInt(4));
           c.setCiudad(resultado.getString(5));
           c.setPais(resultado.getString(6));
           c.setFecha_hasta(resultado.getObject(8, LocalDate.class));//EN TABLA ES SQL.DATE EN JAVA LOCALDATE
           c.setFecha_desde(resultado.getObject(7, LocalDate.class));
           c.setTiempo_minimo(resultado.getInt(9));
           c.setTiempo_maximo(resultado.getInt(10));
           c.setPrecio_habitacion(resultado.getDouble(11));
           c.setTipo_vivienda(resultado.getString(12));
           
                casaLista.add(c);
            }
           
            return casaLista;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    
    }
    

    //d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico. CASAS
    public List<Casa> casasDisponiblesFechaDias(String fecha,int dias) throws Exception{
        try {
            
           
            //Date d=new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            /*String sql = " SELECT *"
                    + " FROM estancias_exterior.casas"
                    + " WHERE DATEDIFF(\"dd/MM/yyyy\",casas.fecha_desde,"+fecha+")>0'"
                    + " AND casas.tiempo_minimo<='"+dias+"'"
                    + "AND casas.tiempo_maximo>='"+dias+"';";*/
            
            String sql = " SELECT *"
                    + " FROM estancias_exterior.casas"
                    + " WHERE casas.fecha_desde = date'"+fecha+"'"
                    + " AND casas.tiempo_minimo<='"+dias+"'"
                    + "AND casas.tiempo_maximo>='"+dias+"';";
            consultarBase(sql);

           
            
            
            List<Casa> casaLista2= new ArrayList();
            Casa c = null;
            while (resultado.next()) {
           c = new Casa();
           c.setId_casa(resultado.getInt(1));
           c.setCalle(resultado.getString(2));
           c.setNumero(resultado.getInt(3));
           c.setCodigo_postal(resultado.getInt(4));
           c.setCiudad(resultado.getString(5));
           c.setPais(resultado.getString(6));
           c.setFecha_hasta(resultado.getObject(8, LocalDate.class));//EN TABLA ES SQL.DATE EN JAVA LOCALDATE
           c.setFecha_desde(resultado.getObject(7, LocalDate.class));
           c.setTiempo_minimo(resultado.getInt(9));
           c.setTiempo_maximo(resultado.getInt(10));
           c.setPrecio_habitacion(resultado.getDouble(11));
           c.setTipo_vivienda(resultado.getString(12));
           casaLista2.add(c);
            }
           
            return casaLista2;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
