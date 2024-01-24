import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MarcoConFuentes mimarco = new MarcoConFuentes();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        /*

        String fuente = JOptionPane.showInputDialog("Introduce Fuente");
        boolean estalaFuente = false;
        String [] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombre : nombresFuentes){
            if (nombresFuentes.equals(fuente)) {
                estalaFuente = true;
            }
        }

        if (estalaFuente){
            System.out.println("Fuente Instalada");
        }else{
            System.out.println("No estea Instalada la fuente");
        }*/
    }

}

class MarcoConFuentes extends JFrame{
    public MarcoConFuentes(){
        setTitle("Prueba con fuentes");
        setSize(400, 400);
        Lamina miLamina = new Lamina();
        add(miLamina);

        miLamina.setForeground(Color.BLUE);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics2D g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font mifuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(mifuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Juan", 100, 100);

        g2.setFont(new Font("Arial", Font.ITALIC, 14));
        g2.setColor(new Color(128,90,50).brighter());
        g2.drawString("Curso de Java", 100, 200);
    }
}