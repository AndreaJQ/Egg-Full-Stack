
package Service;

import Entidad.Cancion;
import java.util.Scanner;

public class CancionServicio {
  Cancion song=new Cancion();
  Scanner leer=new Scanner(System.in).useDelimiter("\n");
  
  public void crearCancion(){
      System.out.println("INGRESE EL NOMBRE DE LA CANCIÓN");
      song.setTitulo(leer.next());
      System.out.println("INGRESE EL NOMBRE DEL AUTOR");
      song.setAutor(leer.next());
  }
  public void mostrarCancion(){
      System.out.println("LA CANCIÓN ES: " + "'"+song.getTitulo().toUpperCase()+"'");
      System.out.println("EL AUTOR ES: "+ "'"+song.getAutor().toUpperCase()+"'");
      
  }
}
