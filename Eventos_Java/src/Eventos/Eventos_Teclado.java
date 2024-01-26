package Eventos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Eventos_Teclado {
    public static void main(String[] args) {
        MarcoConTeclas mimarco = new MarcoConTeclas();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclas extends JFrame{
    public MarcoConTeclas(){
        setVisible(true);
        setBounds(700, 300, 600, 450);
        EventoDeTeclaso tecla = new EventoDeTeclaso();
        addKeyListener(tecla);
    }
}

class EventoDeTeclaso implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        //int codigo = e.getKeyCode(); // llamamos a  la tecla
        //System.out.println(codigo);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }
}
