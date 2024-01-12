public class Main {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Karen");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("María");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos() +
                "\n" +trabajador2.devuelveDatos() + "\n"
                +trabajador3.devuelveDatos() +"\n" +
                trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());

    }
}

class Empleados{
    private final String nombre;
    private String seccion;
    private int id;
    private static int Idsiguiente = 1;

    public static String dameIdSiguiente(){
        return "El id siguiente es: " + Idsiguiente;
    }

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