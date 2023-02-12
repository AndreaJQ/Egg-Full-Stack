
package tienda.dominio.fabricante;

import java.util.List;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {
    private FabricanteDAO fDAO;
    //BUENAS PRACTICAS
    public FabricanteService(){
        fDAO=new FabricanteDAO();
    }
    
    //CREAR FABRICANTE
    public void crearFabricante(Integer codigo, String nombre) throws Exception{
        
        try {
            // VALIDACIÓN
            if (codigo == null | codigo < 0) {
                throw new Exception("DEBE INGRESAR UN CODIGO");
            }

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("DEBE INGRESAR UN NOMBRE");
            }

            Fabricante fabricante = new Fabricante();

            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            fDAO.guardarFabricante(fabricante);
            
            
            } catch (Exception e) {
            throw e;
       }  
    }
        
    //MODIFICAR FABRICANTE
    public void modificarFabricante(Integer codigo, String nombre) throws Exception {
        try {
            // VALIDACIÓN
            if (codigo == null | codigo < 0) {
                throw new Exception("DEBE INGRESAR UN CODIGO");}

            if (nombre == null | nombre.trim().isEmpty()) {
                 throw new Exception("DEBE INGRESAR UN NOMBRE");}

            
            Fabricante fabricante = fDAO.buscarFabricanteporCodigo(codigo);

            if (fabricante == null) {
                 throw new Exception("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN FABRICANTE");}

            fabricante.setNombre(nombre);

            fDAO.modificarFabricante(fabricante);
            
        } catch (Exception e) {
            // e.printStackTrace();
            throw e;}
    }
    
    //MOSTRAR FABRICANTE
    public void mostrarFabricante() throws Exception {
         try {
            List<Fabricante> fabricantes = fDAO.listarFabricantes();

            if (fabricantes.isEmpty()) {
                throw new Exception("NO EXISTEN FABRICANTES");
            } else {
                System.out.println("--- LISTA DE FABRICANTES ---");
                System.out.printf("%-15s%-15s\n", "CODIGO", "NOMBRE"); // FORMATO DE IMPRESIÓN
                for (Fabricante aux : fabricantes) {
                    System.out.println(aux);}
                System.out.println();
            }
        } catch (Exception e) {
            // e.printStackTrace();
            throw e;}
    }
    
    //ELIMINAR FABRICANTE
    public void eliminarFabricante(Integer codigo) throws Exception{
        try {
            if (codigo == null || codigo<0 ) {
                throw new Exception("DEBE INGRESAR UN CODIGO");}

            Fabricante fabricante = fDAO.buscarFabricanteporCodigo(codigo);

            if (fabricante == null) {
                throw new Exception("EL CODIGO INGRESADO NO PERTENECE A UN FABRICANTE");}

            fDAO.eliminarFabricante(codigo);
        } catch (Exception e) {
            // e.printStackTrace();
            throw e;}
    }
}
