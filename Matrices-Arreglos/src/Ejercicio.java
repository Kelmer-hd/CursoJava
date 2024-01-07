import javax.swing.*;

public class Ejercicio {
    public static void main(String[] args) {
        String [] paises = new String[4];

        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce pais" + (i + 1));
        }
        for (String pais: paises) {
            System.out.println(pais);
        }


        System.out.println("*****************************");
        int [] matriz_aleatorio = new int[150];

        for (int i = 0; i < matriz_aleatorio.length; i++) {
            matriz_aleatorio[i] = (int) Math.round(Math.random() * 100);

        }

        for (int numero : matriz_aleatorio) {
            System.out.println(numero);
        }
    }
}
