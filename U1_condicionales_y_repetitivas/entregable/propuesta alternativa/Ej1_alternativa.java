package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes.u1.entregable_26_27;

import java.util.Scanner;

// Pinta una casa: tejado (triángulo hueco con la base completa) de altura h y debajo un cuerpo
// rectangular hueco de anchura 2h - 1 y h filas. La altura debe ser >= 3; si no, se vuelve a pedir.
public class Ej1_alternativa {
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

    // Tejado: en la fila i hay asterisco en las columnas h-1-i y h-1+i. La última fila es completa.
    for (int i = 0; i < h; i++) {
      if (i == h - 1) {
        for (int j = 0; j < anchura; j++) {
          System.out.print("*");
        }
      } else {
        for (int j = 0; j <= h - 1 + i; j++) {
          if (j == h - 1 - i || j == h - 1 + i) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
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