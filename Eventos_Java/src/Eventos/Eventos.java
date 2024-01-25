package Eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos {
    public static void main(String[] args) {
        marcoBotones mimarco = new marcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoBotones extends JFrame{
    public marcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones extends JPanel {
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo Amarrillo = new ColorFondo(Color.yellow);
        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Rojo = new ColorFondo(Color.red);
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarrillo);
        botonRojo.addActionListener(Rojo);
    }

    private class ColorFondo implements ActionListener{

        public ColorFondo(Color c){
            ColorFondo   = c;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(ColorFondo);
        }
        private Color ColorFondo;
    }

}


