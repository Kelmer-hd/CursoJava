import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        miMarco micarco1 = new miMarco();
        micarco1.setVisible(true);
        micarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame{
    public miMarco(){
        //setSize(500, 300);
        //setLocation(500, 300);
        setBounds(500, 300, 550, 250);
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Kelmer");

        // Clase Toolkit
    }
}