import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
        /*
        Empleado empleado1 = new Empleado("Kelmer", 1200, 1999, 12, 17);
        Empleado empleado2 = new Empleado("Jose", 1100, 2000, 10, 27);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);

        System.out.println(empleado1.dameNombre());
        System.out.println(empleado1.dameSueldo());
        System.out.println(empleado1.dameFechaContrato());*/

        Empleado[] misEmpleados = new Empleado[3];
        misEmpleados[0] = new Empleado("Paco gomex", 8500, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Kelmer", 9500, 1995, 06, 02);
        misEmpleados[0] = new Empleado("Maria", 10500, 1990, 12, 17);

        for (int i = 0; i < misEmpleados.length; i++){
            misEmpleados[i].subeSueldo(5);
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Nombre "+misEmpleados[i].dameNombre() + " Sueldo: " +misEmpleados[i].dameSueldo() + " Fecha alta: "+ misEmpleados[i].dameFechaContrato());
        }
    }
}

class  Empleado{

    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
        altaContrato = calendario.getTime();
    }

    public String dameNombre(){ // Getter
        return nombre;
    }

    public double dameSueldo(){ // Getter
        return sueldo;
    }

    public  Date dameFechaContrato(){ // Getter
        return  altaContrato;
    }

    public void subeSueldo(double porcentaje){  // Setter
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
    private  String nombre;
    private  double sueldo;
    private Date altaContrato;

}