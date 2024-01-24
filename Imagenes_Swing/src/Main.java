import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MarcoImagen mimarco = new MarcoImagen();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("Marco con Imagenes");
        setBounds(750, 300, 300, 200);
        LaminaConImagen milamina = new LaminaConImagen();
        add(milamina);
    }
}

class LaminaConImagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miimagen = new File("src/images.jpeg");
        try {
            imagen = ImageIO.read(miimagen);
        } catch (IOException e) {
            System.out.println("La imagen no se encuetra");
            //throw new RuntimeException(e);
        }
        g.drawImage(imagen, 5,5,null);
    }

    private Image imagen;

}