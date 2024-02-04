import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Disposiciones o Layouts
        Marco_Layout marco = new Marco_Layout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class Marco_Layout extends JFrame{
    public Marco_Layout(){
        setTitle("Prueba Accciones");
        setBounds(600, 350,600, 300);
        Panel_Layout lamina = new Panel_Layout();

        // cambia la posicion del layout
        FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
        // agrega la posicion del layout
        lamina.setLayout(disposicion);
        add(lamina);
    }
}

class Panel_Layout extends JPanel{
    public Panel_Layout() {
        add(new JButton("Amarrillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
    }
}