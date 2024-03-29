import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = mipantalla.getScreenSize();

        int alturaPantalla = tamanioPantalla.height;
        int anchoPantalla = tamanioPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Marco Centrado");

        Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
        setIconImage(miIcono);
    }
}