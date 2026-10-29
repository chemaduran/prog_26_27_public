package U1_intro_bucles_condicionales.ejercicios.nuevos_examenes_ia.u1.examen_26_27;

import java.util.Scanner;

// Calcula el precio del alquiler de una bicicleta en Pedalea Fácil: precio por horas con tope de
// día completo, recargo de fin de semana, casco y descuento de socio.
public class Ej3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final double PRECIO_CASCO = 2.0;
    final double RECARGO_FINDE = 0.20;
    final double DESCUENTO_SOCIO = 0.15;

    System.out.println("Alquiler de bicicletas Pedalea Fácil");
    System.out.print("Tipo de bicicleta (1=Urbana, 2=Montaña, 3=Eléctrica): ");
    int tipo = sc.nextInt();

    if (tipo < 1 || tipo > 3) {
      System.out.println("Error: tipo de bicicleta incorrecto.");
    } else {
      System.out.print("Número de horas: ");
      int horas = sc.nextInt();

      if (horas < 1 || horas > 24) {
        System.out.println("Error: número de horas incorrecto.");
      } else {
        System.out.print("¿Es fin de semana? (1=sí, 2=no): ");
        int finde = sc.nextInt();
        System.out.print("¿Quiere casco? (1=sí, 2=no): ");
        int casco = sc.nextInt();
        System.out.print("¿Es socio? (1=sí, 2=no): ");
        int socio = sc.nextInt();

        double precioHora;
        double precioDia;
        switch (tipo) {
          case 1:
            precioHora = 3;
            precioDia = 20;
            break;
          case 2:
            precioHora = 5;
            precioDia = 30;
            break;
          default:
            precioHora = 8;
            precioDia = 50;
        }

        double alquiler = horas * precioHora;
        boolean diaCompleto = alquiler > precioDia;
        if (diaCompleto) {
          alquiler = precioDia;
        }

        double recargo = 0;
        if (finde == 1) {
          recargo = alquiler * RECARGO_FINDE;
        }

        double importeCasco = 0;
        if (casco == 1) {
          importeCasco = PRECIO_CASCO;
        }

        double subtotal = alquiler + recargo + importeCasco;

        double descuento = 0;
        if (socio == 1) {
          descuento = subtotal * DESCUENTO_SOCIO;
        }

        double total = subtotal - descuento;

        System.out.println();
        if (diaCompleto) {
          System.out.printf("Alquiler (día completo): %.2f €%n", alquiler);
        } else {
          System.out.printf("Alquiler (%d horas): %.2f €%n", horas, alquiler);
        }
        System.out.printf("Recargo fin de semana: %.2f €%n", recargo);
        System.out.printf("Casco: %.2f €%n", importeCasco);
        System.out.printf("Subtotal: %.2f €%n", subtotal);
        System.out.printf("Descuento socio: %.2f €%n", descuento);
        System.out.printf("Total a pagar: %.2f €%n", total);
      }
    }
  }
}
