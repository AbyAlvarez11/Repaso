package prueba;

public class Prueba2 {
    public static void main(String[] args) {

        int i = 0;

        do {
            i = (int) ((600 - 200 + 1) * Math.random() + 200);

            System.out.println("El numero es -> " + i ); // Bucle infinito.
        } while(!(i == 300));//true esto continua

    }
}
