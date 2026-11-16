package U3_strings_arrays_funciones.ejercicios.resolucion;

import java.util.Arrays;
import java.util.Scanner;

public class PedirDatosBidi {
  public static void main(String[] args) {
    final int NUM_ALUMNOS = 3;
    final int NUM_TRIMESTRES = 2;

    Scanner sc = new Scanner(System.in);

    int[][] matriz = new int[NUM_TRIMESTRES][NUM_ALUMNOS];

    for (int i = 0; i < NUM_TRIMESTRES; i++) {
      System.out.println("Vamos a introducir datos del trimestre " + (i + 1));
      for (int j = 0; j < NUM_ALUMNOS; j++) {
        System.out.println("Introduce la nota del alumno " + (j + 1));
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println(Arrays.deepToString(matriz));
    for (int[] trimestre : matriz) {
      System.out.println(Arrays.toString(trimestre));
    }

    int[] varias_cosas = {1, 2, 3, 4, 5};

    for (int item : varias_cosas) {
      System.out.println(item);
    }
  }
}
