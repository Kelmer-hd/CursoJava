import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MarcoContexto mimarco = new MarcoContexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoContexto extends JFrame{
    public MarcoContexto(){
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Primer Texto");

        Lamina lamina = new Lamina();

        add(lamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo swing", 100, 100);
    }
}