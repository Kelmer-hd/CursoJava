import javax.swing.*;
import java.awt.*;

public class Grid_layout {
    public static void main(String[] args) {
        Marco_calculadora mimarco = new Marco_calculadora();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class Marco_calculadora extends JFrame{
    public Marco_calculadora(){
        setTitle("Calculadora");
        //setBounds(600, 300, 450, 300);
        LaminaCalculadora milamina = new LaminaCalculadora();
        add(milamina);

        pack();

    }
}

class LaminaCalculadora extends JPanel{
    public LaminaCalculadora(){
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);// desafilitat el boton
        add(pantalla, BorderLayout.NORTH);

        JPanel miLamina2 = new JPanel();

        miLamina2.setLayout(new GridLayout(4,4));

        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");
        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("-");
        ponerBoton("0");
        ponerBoton("-");
        ponerBoton("=");
        ponerBoton("+");

        add(miLamina2, BorderLayout.CENTER);

    }

    private void ponerBoton(String rotulo){
        JButton boton = new JButton(rotulo);
        miLamina2.add(boton);
    }

    private JPanel miLamina2;
}



