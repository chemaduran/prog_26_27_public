package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes.u1.entregable_26_27;

import java.util.Scanner;

// Juego "Adivina el número": número aleatorio entre 1 y 100, máximo 7 intentos, con pistas
// mayor/menor y caliente/templado/frío. Los números fuera de rango no cuentan como intento.
public class Ej4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int MAX_INTENTOS = 7;
    int secreto = (int) (Math.random() * 100) + 1;

    System.out.println("He pensado un número entre 1 y 100. Tienes " + MAX_INTENTOS + " intentos.");

    int intento = 1;
    boolean acertado = false;

    while (intento <= MAX_INTENTOS && !acertado) {
      System.out.print("Intento " + intento + ": ");
      int n = sc.nextInt();

      if (n < 1 || n > 100) {
        System.out.println("Ese número no está entre 1 y 100. No cuenta como intento.");
      } else if (n == secreto) {
        acertado = true;
      } else {
        if (secreto > n) {
          System.out.print("El número es mayor. ");
        } else {
          System.out.print("El número es menor. ");
        }

        int diferencia = Math.abs(secreto - n);
        if (diferencia <= 5) {
          System.out.println("¡Caliente!");
        } else if (diferencia <= 15) {
          System.out.println("Templado");
        } else {
          System.out.println("Frío");
        }
        intento++;
      }
    }

    if (acertado) {
      System.out.println("¡Enhorabuena! Has acertado en " + intento + " intentos.");
    } else {
      System.out.println("Lo siento, has agotado tus intentos. El número era el " + secreto + ".");
    }
  }
}