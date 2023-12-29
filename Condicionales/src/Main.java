import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Estructuras de control
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}