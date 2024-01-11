package poo;
public class Coche {

    // Modificadores de acceso

    // Encapsulamiento
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean acientos_cuero, climatizador;

    // Metodo Constructor sirve para inicializar las propiedades
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    // Métodos Setters and getters
    public String dime_largo(){
        return "El largo del coche es: " + largo;
    }

    // Setter
    public void estableceColor(String color_coche){
        color = color_coche;
    }

    public String dime_color(){
        return  "El color del coche es: " + color;
    }
}
