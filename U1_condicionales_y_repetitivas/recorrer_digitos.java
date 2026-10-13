package U1_intro_bucles_condicionales.ejercicios.resolucion;

public class recorrer_digitos {
    public static void main(String[] args) {
        long n = 34084091;
        long suma = 0;

        while (n != 0) {
            long dig = n % 10;
            if (dig != 8 && dig != 0) {
                System.out.print(dig);
                suma += dig;
                suma *= 10;
            }
            n = n / 10;
        }
        suma /= 10;
        System.out.println();
        System.out.println(suma);

        n = suma;

        while (n != 0) {
            long dig = n % 10;
            System.out.print(dig);
            n = n / 10;
        }


    }


}