package Eventos;
import javax.swing.*;
import java.awt.event.WindowAdapter;
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
        //M_ventana oyenteVentana = new M_ventana();
        //addWindowListener(oyenteVentana);

        addWindowListener(new M_ventana());
    }
}


class M_ventana extends WindowAdapter {

    @Override
    public void windowIconified(WindowEvent e) {
        // ventana para minimizar
        System.out.println("Ventana Minimizada");
    }

}