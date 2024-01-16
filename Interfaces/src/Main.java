public class Main {
    public static void main(String[] args) {
        // Interfaces


    }

    class Empleado{

    }
    class Jefatura extends Empleado implements Jefes{
        public String tomar_decisiones(String decision) {
            return "Un miembro de la direccion ha tomado la decision de : "+decision;
        }
    }
}