/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andrea.pruebas.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author andreajalil
 */
public class ProbandoFuentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MarcoConDibujos marcoConDibujos=new MarcoConDibujos();
       marcoConDibujos.setVisible(true);
       marcoConDibujos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class MarcoConDibujos extends JFrame{
public MarcoConDibujos(){
        setTitle("Prueba de Dibujo");
        setSize(400, 400);
        Lamina lamina = new Lamina();
        add(lamina);
        lamina.setForeground(Color.yellow);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
      
        
        Graphics2D g2 = (Graphics2D) g;
       
        Font miFuente = new Font("Tahoma", Font.BOLD, 26);
        
        g2.setFont(miFuente);
        
        //g2.setColor(Color.red);
        g2.drawString("Andrea", 100, 100);
      
        g2.setFont(new Font("Arial", Font.ITALIC, 20));
        //g2.setColor(new Color(128,90,50));
        g2.drawString("Jalil", 150, 150);
        
                
                
    }
}
