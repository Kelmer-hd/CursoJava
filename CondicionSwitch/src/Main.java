import java.util.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triandulo \n4: Circulo");

        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
                System.out.println("El area del rectangulo es: " + base * altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
                System.out.println("El area del triangulo es: " + (base * altura) / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Digite el radio"));
                System.out.print("El area del  circulo es ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opción no es correcta");
        }
    }
}