package Eventos;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana {
    public static void main(String[] args) {
        MarcoVentana mimarco = new MarcoVentana();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(300,300,500,350);
        MarcoVentana mimarco2 = new MarcoVentana();
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco2.setTitle("Ventana 2");
        mimarco2.setBounds(900,300,500,350);

    }
}
class MarcoVentana extends JFrame{
    public MarcoVentana(){
        //setTitle("Respondiendo");
        //setBounds(300, 300, 500, 350);
        setVisible(true);

        // Poner nuestra ventena a escucha
        M_ventana oyenteVentana = new M_ventana();
        addWindowListener(oyenteVentana);
    }
}


class M_ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando Ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // ventana para minimizar
        System.out.println("Ventana Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("ventana Desacticada");
    }
}