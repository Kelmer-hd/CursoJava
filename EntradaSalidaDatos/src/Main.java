import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada y Salida de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre por favor: ");
        String nombre_usuario = scanner.nextLine();

        System.out.print("Introduce edad, por favor:");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras "+ (edad + 1) + " años");
    }
}