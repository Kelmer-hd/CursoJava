public class Main {
    public static void main(String[] args) {
        // Clase String

        String nombre = "Kelmer";
        System.out.println("Mi nombre es "+nombre);

        System.out.println("Mi nombre tiene "+nombre.length()+ " letras.");

        System.out.println("La primera letra de mi nombre es "+nombre.charAt(0));

        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("La ultima letra de mi nombre es "+ nombre.charAt(ultima_letra - 1));

        // More examples
        String frese = "Hoy es un gran dia para aprender a programar en Java";
        String frase_resument = frese.substring(0,29) + " irnos a la playa y olvidarnos de todo...";
        System.out.println("" +frase_resument);

        // More examples
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "david";
        System.out.println(alumno1.equalsIgnoreCase(alumno2));


    }
}