package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes.u1.entregable_26_27;

import java.util.Scanner;

// Calcula el precio de una carrera de Taxi Veloz según tarifa diurna/nocturna, tarifa mínima
// y suplemento de aeropuerto.
public class Ej3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final double MINIMO = 7.0;
    final double SUPLEMENTO_AEROPUERTO = 5.0;

    System.out.println("Bienvenido a Taxi Veloz");
    System.out.print("Kilómetros recorridos: ");
    double km = sc.nextDouble();
    System.out.print("Hora de inicio (0-23): ");
    int hora = sc.nextInt();

    if (hora < 0 || hora > 23) {
      System.out.println("Error: la hora introducida no es correcta.");
    } else {
      System.out.print("¿Es festivo? (1=sí, 2=no): ");
      int festivo = sc.nextInt();
      System.out.print("¿Carrera al aeropuerto? (1=sí, 2=no): ");
      int aeropuerto = sc.nextInt();

      boolean nocturna = hora >= 22 || hora <= 6 || festivo == 1;

      double bajada;
      double precioKm;
      if (nocturna) {
        bajada = 3.50;
        precioKm = 1.30;
      } else {
        bajada = 2.50;
        precioKm = 1.10;
      }

      double recorrido = km * precioKm;
      double importe = bajada + recorrido;
      boolean aplicaMinimo = importe < MINIMO;
      if (aplicaMinimo) {
        importe = MINIMO;
      }

      double suplemento = 0;
      if (aeropuerto == 1) {
        suplemento = SUPLEMENTO_AEROPUERTO;
      }

      double total = importe + suplemento;

      System.out.println();
      if (nocturna) {
        System.out.println("Tarifa aplicada: nocturna");
      } else {
        System.out.println("Tarifa aplicada: diurna");
      }
      System.out.printf("Bajada de bandera: %.2f €%n", bajada);
      System.out.printf("Recorrido (%.1f km): %.2f €%n", km, recorrido);
      if (aplicaMinimo) {
        System.out.printf("Se aplica la tarifa mínima de %.2f €%n", MINIMO);
      }
      System.out.printf("Suplemento aeropuerto: %.2f €%n", suplemento);
      System.out.printf("Total a pagar: %.2f €%n", total);
    }
  }
}