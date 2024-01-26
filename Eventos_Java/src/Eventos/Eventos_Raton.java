package Eventos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Eventos_Raton {
    public static void main(String[] args) {
        MarcoConMause mimarco = new MarcoConMause();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConMause extends JFrame{
    public MarcoConMause(){
        setVisible(true);
        setBounds(300, 300, 500, 300);
        EventosDelRaton eventoRaton = new EventosDelRaton();
        addMouseListener(eventoRaton);
    }
}


//class EventosDelRaton extends MouseAdapter : cualquiera de los dos funciona
class EventosDelRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de precionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
}