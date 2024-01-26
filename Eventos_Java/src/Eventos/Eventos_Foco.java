package Eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Eventos_Foco {
    public static void main(String[] args) {
        MarcoDeFocos mimarco = new MarcoDeFocos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDeFocos extends JFrame{
    public MarcoDeFocos(){
        setVisible(true);
        setBounds(300,300, 600,450);
        LaminaFoco milamina = new LaminaFoco();
        add(milamina);

    }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null); // layout invalidado
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        // Posiciones
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);

        /// Agregarme a la lamina
        add(cuadro1);
        add(cuadro2);

        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
    }
    JTextField cuadro1;
    JTextField cuadro2;

    class LanzaFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText();
            boolean comprobacion = false;

            for (int i = 0; i < email.length(); i++){
                if (email.charAt(i) == '@'){
                    comprobacion = true;
                }
            }
            if (comprobacion){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        }
    }
}

