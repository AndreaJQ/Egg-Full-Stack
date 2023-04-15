
package andrea.pruebas;

import javax.swing.*;
import java.awt.*;

public class PRUEBAS {

    public static void main(String[] args) {
        MarcoConTexto marco=new MarcoConTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        setSize(600, 450);
        setLocation(400,200);
        setTitle("PRUEBA");
        Lamina lamina=new Lamina();
        add(lamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estoy probando escribir en panel ;)", 100, 100);
    }
}