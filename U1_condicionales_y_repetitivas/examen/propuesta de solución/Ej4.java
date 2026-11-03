package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes_ia.u1.examen_26_27;

import java.util.Scanner;

// Números felices: se sustituye el número por la suma de los cuadrados de sus dígitos hasta llegar
// a 1 (feliz) o a 4 (no feliz). Además se cuentan los felices entre 1 y el número introducido.
// Sin funciones de cadenas.
public class Ej4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    do {
      System.out.print("Introduzca un número entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    // 1. Secuencia del número introducido
    System.out.print("Secuencia: " + num);
    int actual = num;
    while (actual != 1 && actual != 4) {
      int suma = 0;
      while (actual > 0) {
        int digito = actual % 10;
        suma = suma + digito * digito;
        actual = actual / 10;
      }
      actual = suma;
      System.out.print(" -> " + actual);
    }
    System.out.println();

    // 2. ¿Es feliz?
    if (actual == 1) {
      System.out.println("El " + num + " es un número feliz.");
    } else {
      System.out.println("El " + num + " NO es un número feliz.");
    }

    // 3. Cuántos números felices hay entre 1 y num
    int contador = 0;
    for (int i = 1; i <= num; i++) {
      int n = i;
      while (n != 1 && n != 4) {
        int suma = 0;
        while (n > 0) {
          int digito = n % 10;
          suma = suma + digito * digito;
          n = n / 10;
        }
        n = suma;
      }
      if (n == 1) {
        contador++;
      }
    }
    System.out.println("Entre 1 y " + num + " hay " + contador + " números felices.");
  }
}
