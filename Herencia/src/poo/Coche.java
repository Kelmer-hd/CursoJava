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
    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene: " + ruedas +
                " . Mide "+ largo /  1000 +
                " metros con un ancho de " + ancho +
                " cm y un peso de la plataforma de " +peso_plataforma + "kg";
    }

    // Setter
    public void estableceColor(String color_coche){
        color = color_coche;
    }

    public String dime_color(){
        return  "El color del coche es: " + color;
    }

    public void configura_acientos(String acientos_cuero){ // Setter
        if (acientos_cuero.equalsIgnoreCase("Si")){
            this.acientos_cuero = true;
        }else{
            this.acientos_cuero = false;
        }
    }

    public String dime_asientos(){
        if (acientos_cuero == true){
            return  "El coche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de serie";
        }
    }

    public  void configura_Climatizador(String climatizador){
        if (climatizador == "Si"){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    public String dime_climatizador(){
        if (climatizador == true){
            return "El coche incorpora climatizador";
        }else{
            return "El coche tiene aire a condicionado";
        }
    }


    // Setter y getter al mismo tiempo es una practica no recomenable
    public String dime_peso_coche(){
        int peso_carroseria = 500;

        peso_total = peso_plataforma + peso_carroseria;

        if (acientos_cuero == true){
            peso_total = peso_total + 50;
        }
        if (climatizador == true){
            peso_total = peso_total + 20;
        }

        return  "El peso del coche es: " + peso_total;
    }

    public  int precio_coche(){
        int precio_final = 1000;

        if (acientos_cuero == true){
            precio_final += 2000;
        }if (climatizador == true){
            precio_final += 1500;
        }

        return precio_final;
    }
}