import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Reloj mireloj = new Reloj(3000, true);
        mireloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0);
    }
}

class Reloj{
    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha(){
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(3000, oyente);
        mitemporizador.start();
    }

    private  int intervalo;
    private boolean sonido;

    private class DameLaHora2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            System.out.println("Te pongo la ahora cada 3 sg" +ahora);

            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}

