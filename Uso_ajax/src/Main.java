public class Main {

    enum Talla{
        private  Tabla(String abreviatura){
            this.abreviatura = abreviatura;
        }

        private String abreviatura;
        MINI, MEDIANO, GRANDE, MUY_GRANDE
    };
    public static void main(String[] args) {
        Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
    }
}