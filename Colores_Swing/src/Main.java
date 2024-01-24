mport javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        MarcoConColor mimarco = new MarcoConColor();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConColor extends JFrame{
    public MarcoConColor(){
        setTitle("Prueba con colores");
        setSize(400, 400);

        LaminasConColor milamina = new LaminasConColor();
        add(milamina);
    }
}

class LaminasConColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);

    }
}