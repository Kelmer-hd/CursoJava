import java.util.Date;
import java.util.GregorianCalendar;
// Sobrecarga de Metodos
public class Main {
    public static void main(String[] args) {
        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Paco Gomez", 8500, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Lopez", 9500, 1995, 06, 02);
        misEmpleados[2] = new Empleado("María Martin", 10500, 2002, 03, 15);
        misEmpleados[3] = new Empleado("Karen");
        for (Empleado e : misEmpleados){
            e.subeSueldo(5);
        }

        for (Empleado e : misEmpleados){
            System.out.println("Nombre " +e.dameNombre() +
                    " Sueldo " +e.dameSueldo() + " Fecha de alta " +
                    e.dameFechaContrato());
        }
    }
}


class Empleado{
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
        altaContrato = calendario.getTime();
    }


    // Esto es la sorecarga de constructores
    public Empleado(String nom){
        this(nom, 3000, 2000, 01,01);
    }

    public String dameNombre(){
        return nombre;
    }

    public double dameSueldo(){
        return sueldo;
    }

    public Date dameFechaContrato(){
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}