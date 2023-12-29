import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main2 {
    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        System.out.println("Hola " + nombre_usuario + ". Tienes "+ (edad + 1)+ " años");


    }
}
