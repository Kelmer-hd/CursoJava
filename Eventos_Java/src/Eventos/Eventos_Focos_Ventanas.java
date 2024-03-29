package Eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Eventos_Focos_Ventanas extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {
        Eventos_Focos_Ventanas miv = new Eventos_Focos_Ventanas();
        miv.iniciar();
    }

    public void iniciar(){
        marco1 = new Eventos_Focos_Ventanas();
        marco2 = new Eventos_Focos_Ventanas();

        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(100, 100, 600, 350);
        marco2.setBounds(900, 100, 600, 350);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    Eventos_Focos_Ventanas marco1;
    Eventos_Focos_Ventanas marco2;

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco1){
            marco1.setTitle("Tengo el Foco");
        }else{
            marco2.setTitle("Tengo el Foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {

        if (e.getSource() == marco1){
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }
    }
}
