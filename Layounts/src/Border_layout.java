import javax.swing.*;
import java.awt.*;

public class Border_layout {
    public static void main(String[] args) {
        // Disposiciones o Layouts
        Marco_Layout1 marco = new Marco_Layout1();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class Marco_Layout1 extends JFrame{
    public Marco_Layout1(){
        setTitle("Prueba Accciones");
        setBounds(600, 350,600, 300);
        Panel_Layout1 lamina = new Panel_Layout1();

        // cambia la posicion del layout
        FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 75, 100);
        // agrega la posicion del layout
        //lamina.setLayout(disposicion);
        add(lamina);
    }
}

class Panel_Layout1 extends JPanel{
    public Panel_Layout1() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarrillo"));
        add(new JButton("Rojo"));

    }
}

class Panel_layout2 extends JPanel {
    public Panel_layout2( ){
        setLayout(new BorderLayout());
        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);
    }
}