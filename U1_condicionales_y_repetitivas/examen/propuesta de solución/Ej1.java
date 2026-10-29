package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes_ia.u1.examen_26_27;

import java.util.Scanner;

// Pinta la palabra NO con asteriscos. Anchura de cada letra = altura, separadas por 3 espacios.
// La altura debe ser impar y >= 5; si no, se vuelve a pedir.
public class Ej1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura: ");
    int h = sc.nextInt();
    while (h < 5 || h % 2 == 0) {
      System.out.println("Altura incorrecta. Debe ser impar y mayor o igual que 5.");
      System.out.print("Introduzca la altura: ");
      h = sc.nextInt();
    }

    System.out.println();

    for (int i = 0; i < h; i++) {
      // Letra N: columnas laterales y diagonal (j == i)
      for (int j = 0; j < h; j++) {
        if (j == 0 || j == h - 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      // Separación
      System.out.print("   ");

      // Letra O: primera y última fila sin esquinas; filas intermedias con los laterales
      for (int j = 0; j < h; j++) {
        boolean asterisco;
        if (i == 0 || i == h - 1) {
          asterisco = j > 0 && j < h - 1;
        } else {
          asterisco = j == 0 || j == h - 1;
        }

        if (asterisco) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
