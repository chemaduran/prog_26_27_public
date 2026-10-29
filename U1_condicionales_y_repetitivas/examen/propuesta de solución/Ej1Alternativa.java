package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes_ia.u1.examen_26_27;

import java.util.Scanner;

// Pinta la palabra NO con asteriscos. Anchura de cada letra = altura, separadas por 3 espacios.
// La altura debe ser impar y >= 5; si no, se vuelve a pedir.
// Alternativa: dos bucles anidados (filas y columnas de todo el dibujo) y un único if-else.
public class Ej1Alternativa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h;
    boolean alturaCorrecta;
    do {
      System.out.print("Introduzca la altura: ");
      h = sc.nextInt();
      alturaCorrecta = h >= 5 && h % 2 != 0;
      if (!alturaCorrecta) {
        System.out.println("Altura incorrecta. Debe ser impar y mayor o igual que 5.");
      }
    } while (!alturaCorrecta);

    System.out.println();

    // Columnas del dibujo completo:
    //   0 .. h-1         -> letra N
    //   h .. h+2         -> separación (3 espacios)
    //   h+3 .. 2h+2      -> letra O (columna relativa k = j - (h + 3))
    int ancho = 2 * h + 3;

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < ancho; j++) {
        int k = j - (h + 3);

        // Para no poner el chorizo gigante de condiciones, se crean dos booleanos que indican si hay que pintar un asterisco en la letra N o en la letra O.

        boolean letraN = j < h && (j == 0 || j == h - 1 || j == i);
        boolean letraO = k >= 0
            && ((i == 0 || i == h - 1) && k > 0 && k < h - 1      // fila superior/inferior sin esquinas
                || i > 0 && i < h - 1 && (k == 0 || k == h - 1)); // filas intermedias: laterales

        if (letraN || letraO) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
