import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Ingrese un número");
        Double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de "+num2 + " es ");
        System.out.printf("%1.4f",Math.sqrt(num2));
    }
}
