import javax.swing.*;

public class Fallos {
    public static void main(String[] args) {
        int[] mi_matriz = new int[5];
        mi_matriz[0] = 5;
        mi_matriz[1] = 28;
        mi_matriz[2] = 15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 71;

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Position " + i + ": " + mi_matriz[i]);
        }

        // Peticion de datos Personales
        String nombre = JOptionPane.showInputDialog("Introdue tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Hola, " + nombre + " Tienes "+edad + " Años" + " El programa termino su ejecución.");

    }
}