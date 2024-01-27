import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        MarcoPrincipal mimarco = new MarcoPrincipal();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPrincipal extends JFrame{
    public MarcoPrincipal(){
        setTitle("Prueba varios");
        setBounds(1000,100,300,200);
        LaminaPrincipal lamina= new LaminaPrincipal();
        add(lamina);
    }
}

class LaminaPrincipal extends JPanel{
    public LaminaPrincipal(){
        JButton botonNuevo = new JButton("Nuevo");
        add(botonNuevo);

        botonCerrar = new JButton("Cerrar Todo");
        add(botonCerrar);
        OyenteNuevo mioyente = new OyenteNuevo();
        botonNuevo.addActionListener(mioyente);
    }

    private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(botonCerrar);
            marco.setVisible(true);
        }
    }

    JButton botonCerrar;
}

class MarcoEmergente extends JFrame{
    public MarcoEmergente(JButton botonPrincipal){
        contador++;
        setTitle("Ventana: " + contador);
        setBounds(40 * contador, 40 * contador, 300, 150);

        CierraTodo oyenteCerrar = new CierraTodo();
        botonPrincipal.addActionListener(oyenteCerrar);
    }

    private class CierraTodo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }

    private static int contador = 0;
}