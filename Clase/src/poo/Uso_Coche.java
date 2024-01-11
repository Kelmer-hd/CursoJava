package poo;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche Renault = new Coche(); // Instanciar una clase. Ejemplarizar la clase

        System.out.println(Renault.dime_datos_generales());

        Coche micoche = new Coche();

        micoche.estableceColor(JOptionPane.showInputDialog("Introduzca color: "));
        System.out.println(micoche.dime_color());

        micoche.configura_acientos("si");
        System.out.println(micoche.dime_asientos());

        micoche.configura_Climatizador(JOptionPane.showInputDialog("Introduzca color: "));
        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche());

        System.out.println("El precio final de coche es: "+micoche.precio_coche());
    }
}

