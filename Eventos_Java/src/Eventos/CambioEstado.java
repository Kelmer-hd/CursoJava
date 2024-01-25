package Eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.sql.SQLOutput;

public class CambioEstado {
    public static void main(String[] args) {
        MarcoEstado mimarco = new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setBounds(300, 300,500, 300);
        CambiaEstado nuevoEstaso = new CambiaEstado();
        addWindowStateListener(nuevoEstaso);
    }
}

class CambiaEstado implements WindowStateListener{
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana a cambiado de estado");
        //System.out.println(e.getNewState());

        if (e.getNewState() == 6){
            System.out.println("La ventana esta a pantalla Completa");

        } else if (e.getNewState() == JFrame.NORMAL) {
            System.out.println("La ventana esta normal");
        }
    }
}
