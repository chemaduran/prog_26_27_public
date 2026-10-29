package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes_ia.u1.examen_26_27;

import java.util.Scanner;

// Valida un número de tarjeta mediante el algoritmo de Luhn. Sin funciones de cadenas.
public class Ej2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long num;
    do {
      System.out.print("Introduzca el número de la tarjeta: ");
      num = sc.nextLong();
    } while (num <= 0);

    long aux = num;
    int suma = 0;
    boolean doblar = false; // el primer dígito por la derecha (posición 1) no se dobla

    while (aux > 0) {
      int digito = (int) (aux % 10);

      if (doblar) {
        digito = digito * 2;
        if (digito > 9) {
          digito = digito - 9;
        }
      }

      suma = suma + digito;
      doblar = !doblar;
      aux = aux / 10;
    }

    System.out.println("Suma de control: " + suma);
    if (suma % 10 == 0) {
      System.out.println("El número " + num + " es VÁLIDO.");
    } else {
      System.out.println("El número " + num + " NO es válido.");
    }
  }
}
