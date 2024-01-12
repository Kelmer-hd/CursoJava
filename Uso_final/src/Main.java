public class Main {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Karen");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }
}

class Empleados{
    private final String nombre;
    private String seccion;

    public Empleados(String nom){
        nombre = nom;
        seccion = "Administración";
    }

    public void cambiaSeccion(String seccion){  // Setter
        this.seccion = seccion;
    }

    public String devuelveDatos(){
        return "El nombre es " + nombre + " y la seccion es "+ seccion;
    }
}