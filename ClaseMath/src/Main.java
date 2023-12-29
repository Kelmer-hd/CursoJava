public class Main {
    public static void main(String[] args) {
        // Clase Math

        // metodo sqrt
        double raiz = Math.sqrt(25);
        System.out.println("La raiz cuadrada es: "+raiz);

        // metodo round
        double num1 = 5.85f;
        int result = (int) Math.round(num1);
        System.out.println("El redondeo es:" +result);

        // metdod pow
        double base = 5;
        double exponent = 3;
        int ressultado = (int) Math.pow(base, exponent);
        System.out.println("   La potencia es: "+ressultado);

    }
}