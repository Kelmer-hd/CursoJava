public class Main {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Karen");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("Antonio");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
    }
}

class Empleados{
    private final String nombre;
    private String seccion;
    private int id;
    private static int Idsiguiente = 1;

    public Empleados(String nom){
        nombre = nom;
        seccion = "Administración";
        id = Idsiguiente;
        Idsiguiente++;
    }

    public void cambiaSeccion(String seccion){  // Setter
        this.seccion = seccion;
    }

    public String devuelveDatos(){
        return "El nombre es " + nombre + " y la seccion es "+ seccion + " y el id es " +id;
    }
}