package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes.u1.entregable_26_27;

import java.util.Scanner;

// Rota hacia la izquierda los dígitos de un número entero positivo tantas posiciones como indique
// el usuario. Sin funciones de cadenas.
public class Ej2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long num;
    do {
      System.out.print("Introduzca un número entero positivo: ");
      num = sc.nextLong();
    } while (num <= 0);

    System.out.print("Introduzca las posiciones a rotar: ");
    int posiciones = sc.nextInt();

    // Contamos los dígitos del número
    int longitud = 0;
    long aux = num;
    while (aux > 0) {
      longitud++;
      aux = aux / 10;
    }

    // Rotar tantas posiciones como dígitos deja el número igual
    int k = posiciones % longitud;

    // El número se divide en dos partes: los k primeros dígitos (izquierda) y el resto (derecha).
    // potenciaDerecha = 10^(longitud - k), potenciaIzquierda = 10^k
    long potenciaDerecha = 1;
    for (int i = 0; i < longitud - k; i++) {
      potenciaDerecha = potenciaDerecha * 10;
    }
    long potenciaIzquierda = 1;
    for (int i = 0; i < k; i++) {
      potenciaIzquierda = potenciaIzquierda * 10;
    }

    long izquierda = num / potenciaDerecha;
    long derecha = num % potenciaDerecha;
    long resultado = derecha * potenciaIzquierda + izquierda;

    System.out.println(
        "El número " + num + " rotado " + posiciones + " posiciones es " + resultado);
  }
}