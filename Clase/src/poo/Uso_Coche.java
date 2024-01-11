package poo;
public class Uso_Coche {
    public static void main(String[] args) {
        Coche Renault = new Coche(); // Instanciar una clase. Ejemplarizar la clase

        System.out.println(Renault.dime_largo());

        Coche micoche = new Coche();

        micoche.estableceColor("Amarillo");
        System.out.println(micoche.dime_color());
    }
}

