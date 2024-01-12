package poo;
public class Furgoneta extends Coche{
    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); // Llamar al construcotr de la clase padre
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }

    public String dimeDatosFurgonta(){
        return "La capacidad de la carga es "+capacidad_carga + " y la plazas son " +plazas_extra;
    }
}

