package U1_intro_bucles_condicionales.ejercicios.resolucion;

public class ej_6_piramide_hueca {
    public static void main(String[] args) {
        String c = "*";
        int altura = 9;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura * 2 - 1; j++) {
                if (i + j == altura + 1 || i == altura || j - i == altura - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}