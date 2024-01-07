public class Main {
    public static void main(String[] args) {
        /*
         int [][] matriz = {
                 {10,15,19,21},
                 {5,10,14,12},
                 {4,3,1,8,},
                 {4,21,54,78}
         };

         for(int[] filas: matriz){
             System.out.println();
             for(int z: filas){
                 System.out.println(z + " ");
             }
         } */

        double acumulado;
        double interes = 10;

        double [][] saldo = new double[6][5];

        for(int i = 0; i<6; i++){
            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1; j < 5; j++){
                acumulado = acumulado + (acumulado * interes);
                saldo[i]][j] = acumulado;
            }

            interes = interes + 0.01;

        }

        for (int z = 0; z <6; z++){
            System.out.println();

            for (int h = 0; h < 5; h++){
                System.out.printf("%1.2f", saldo[z]][h]);
                System.out.println(" ");
            }
        }
    }
}