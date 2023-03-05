/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.Persistencia;

import estancias.Entidades.Familias;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreajalil
 */
public class FamiliasDAO extends DAO{
    //AGREGAR FABRICANTE
    public void guardarFamilia (Familias f) throws Exception{
        try {
            if (f==null) {
                throw new Exception("Información inválida");}
            
            //sentencia sql de inserción 
            //INSERT INTO `estancias_exterior`.`casa` (`id_familia`, `nombre`....etc) 
            //VALUES ('10', 'Apellido');
        
            String sql= "INSERT INTO estancias_exterior.familias (id_familia, nombre, edad_minima,edad_maxima,num_hijos,email,id_casa_familia)"
                    +"VALUES('"+f.getId_familia()
                    +"' , '" + f.getNombre()
                    +"' , '" + f.getEdad_minima()
                    +"' , '" + f.getEdad_maxima()
                    +"' , '" + f.getNum_hijos()
                    +"' , '" + f.getEdad_minima()
                    +"' , '" + f.getEmail()
                    +"' , '" + f.getId_casa_familia()+"' );";
           
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    public List<Familias> mostrarFamiliashijos3(Integer cantHijos, Integer edad ) throws Exception{
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos ="+cantHijos+" AND edad_maxima<"+edad+";";

            consultarBase(sql);

           
            List<Familias> familiasLista = new ArrayList();
            Familias fam = null;
            while (resultado.next()) {
                fam = new Familias();
                fam.setId_familia(resultado.getInt(1));
                fam.setNombre(resultado.getString(2));
                fam.setEdad_minima(resultado.getInt(3));
                fam.setEdad_maxima(resultado.getInt(4));
                fam.setNum_hijos(resultado.getInt(5));
                fam.setEmail(resultado.getString(6));
                fam.setId_casa_familia(resultado.getInt(7));
           
                familiasLista.add(fam);
            }
           
            return familiasLista;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
   
    }
    
    public List<Familias> buscarFamiliasEmail(String email) throws Exception{
        try {
            String sql = "SELECT * FROM familias WHERE email like '%"+email+"%';";

            consultarBase(sql);

           
            List<Familias> familiasLista2 = new ArrayList();
            Familias fam = null;
            while (resultado.next()) {
                fam = new Familias();
                fam.setId_familia(resultado.getInt(1));
                fam.setNombre(resultado.getString(2));
                fam.setEdad_minima(resultado.getInt(3));
                fam.setEdad_maxima(resultado.getInt(4));
                fam.setNum_hijos(resultado.getInt(5));
                fam.setEmail(resultado.getString(6));
                fam.setId_casa_familia(resultado.getInt(7));
           
                familiasLista2.add(fam);
            }
           
            return familiasLista2;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
