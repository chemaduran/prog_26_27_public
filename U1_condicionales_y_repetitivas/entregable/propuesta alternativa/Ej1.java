package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes.u1.entregable_26_27;

import java.util.Scanner;

// Solución al Ej1: dos bucles anidados (tejado y cuerpo), cada uno con un único if
// que decide si se pinta asterisco o espacio.
public class Ej1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura del tejado: ");
    int h = sc.nextInt();
    while (h < 3) {
      System.out.println("Error: la altura debe ser mayor o igual que 3.");
      System.out.print("Introduzca la altura del tejado: ");
      h = sc.nextInt();
    }

    int anchura = 2 * h - 1;
    System.out.println();

    // Tejado: asterisco en las columnas h-1-i y h-1+i, o en toda la fila si es la última.
    // Cada fila llega hasta la columna h-1+i (en la última coincide con anchura-1).
    for (int i = 0; i < h; i++) {
      for (int j = 0; j <= h - 1 + i; j++) {
        if (i == h - 1 || j == h - 1 - i || j == h - 1 + i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // Cuerpo: h filas, bordes laterales y la última fila completa.
    for (int i = 1; i <= h; i++) {
      for (int j = 0; j < anchura; j++) {
        if (i == h || j == 0 || j == anchura - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
