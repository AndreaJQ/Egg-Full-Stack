package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {
  Ahorcado hm=new Ahorcado();
  Scanner leer=new Scanner (System.in).useDelimiter("\n");
  String word;
  String letter;
  String []letras;
  String []letrasaux;
  
  
  public void crearJuego(){
      
      System.out.println("Ingrese la palabra.");
      String word=leer.next();
      letras=new String[word.length()];
      letrasaux=new String[word.length()];
      for (int i = 0; i < word.length(); i++) {
          letras[i]=word.substring(i, i+1);
          letrasaux[i]= "_";
      }
     hm.setPalabra(letras);
      System.out.println("Ingrese los intentos.");
      hm.setCantJugadas(leer.nextInt());
      hm.setCantEncontradas(0);
      hm.setPalabraAux(letrasaux);
      
  }
  public void longitud(){
      System.out.println("La longitud de la palabra es-> "+ hm.getPalabra().length);
   
  }
  
    public boolean buscarLetra(String letter){
        boolean band=false;
        int cont=0;
        for (int i = 0; i < hm.getPalabra().length; i++) {
            if (hm.getPalabra()[i].equals(letter)) {
                cont++;
                band=true;
            }
        }
        /*if(cont==0){
            System.out.printf("la letra %s no se encuentra en la palabra \n",letter);
        }else{
            System.out.printf("La letra %s se encuentra en la palabra %d veces \n",letter,cont);
        }*/
        return band;
    }
    
    public boolean encontrada(String letter){
        boolean band= false;
         for (int i = 0; i < hm.getPalabra().length; i++) {
            if (hm.getPalabra()[i].equals(letter)) {
                if (hm.getPalabraAux()[i].equals("_")) {
                    hm.getPalabraAux()[i]=letter;
                    hm.setCantEncontradas(hm.getCantEncontradas()+1);
                }
                band=true;
            }
        }
        return buscarLetra(letter);
    }
    
    public void intentos(){
        System.out.printf("Le quedan %d intentos",hm.getCantJugadas());
        
    }
    
    public void mostrarAhorcado(){
        for (int i = 0; i < hm.getPalabraAux().length; i++) {
            System.out.print(hm.getPalabraAux()[i]+ " ");
        }
    }
    
    public void juego(){
        Scanner leer =new Scanner(System.in);
        crearJuego();
        do {
          // mostrarAhorcado();
            System.out.println("");
            System.out.println("--------------------------");
            longitud();
            System.out.println("");
            intentos();
              System.out.println("");
            System.out.println("Ingrese letra a buscar en la palabra: ");
            letter=leer.nextLine();
            if (buscarLetra(letter)) {
                System.out.println("Se encontró la letra.");
            }else{
                System.out.println("No se encontró la letra.");
                hm.setCantJugadas(hm.getCantJugadas()-1);
            }
            encontrada(letter);
            
        } while (hm.getCantJugadas()!=0 && hm.getCantEncontradas()!=hm.getPalabra().length);
        
        
    }
}
