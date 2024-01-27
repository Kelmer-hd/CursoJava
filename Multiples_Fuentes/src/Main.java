import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        MarcoAccion mimarco = new MarcoAccion();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setTitle("Prueba Acciones");
        setVisible(true);
        setBounds(600,350,600, 300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}

class PanelAccion extends JPanel{
    public PanelAccion(){
        /*
        JButton botonAmarillo = new JButton("Amarrillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");

        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);*/

        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("/images"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("/images"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("/images"), Color.RED);

        //JButton botonAmarillo = new JButton(accionAmarillo);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
    }

    private class AccionColor extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c =(Color) getValue("color_de_fondo");
            setBackground(c);
        }

        public AccionColor(String nombre, Icon icono, Color color_boton){
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color" + nombre);
            putValue("color_de_fondo", color_boton);
        }
    }
}

