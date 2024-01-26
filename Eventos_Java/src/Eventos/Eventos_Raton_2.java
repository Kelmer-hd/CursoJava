package Eventos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.sql.SQLOutput;


public class Eventos_Raton_2 {
    public static void main(String[] args) {
        MarcoConMause1 mimarco = new MarcoConMause1();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoConMause1 extends JFrame{
    public MarcoConMause1(){
        setVisible(true);
        setBounds(300, 300, 500, 300);
        EventosDeRaton1 eventoRaton = new EventosDeRaton1();
        addMouseMotionListener(eventoRaton);
    }
}


//class EventosDelRaton extends MouseAdapter : cualquiera de los dos funciona
//class EventosDelRaton1 extends MouseAdapter {
//    public void mouseClicked(MouseEvent e){
        // Posicion donde hago click
        //System.out.println("Coordenada X: " + e.getX() + " Cordenada Y: "+e.getY());

        // Cuenta los Click
        //System.out.println(e.getClickCount());


 //   }

    /*
    public void mousePressed(MouseEvent e){
        if (e.getModifiersEx() == 1024){
            System.out.println("Has pulsado el boton derecho");
        }else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Has pulsado la rueda del boton");
        }else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Has pulsado el boton izquierdo");
        }
    }
    */

//}

class EventosDeRaton1 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas Arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");
    }
}