package U1_intro_bucles_condicionales.ejercicios.resolucion.examen_u1_26_27;

//La empresa **Pedalea Fácil** alquila bicicletas y nos ha pedido un programa que calcule el precio de un alquiler. Las
//tarifas son:
//
//        | Tipo de bicicleta | Precio por hora | Precio día completo |
//        |-------------------|-----------------|---------------------|
//        | 1 - Urbana        | 3 €             | 20 €                |
//        | 2 - Montaña       | 5 €             | 30 €                |
//        | 3 - Eléctrica     | 8 €             | 50 €                |
//
//        - Si el importe calculado por horas supera el precio del día completo, se cobra el **día completo**.
//        - Los fines de semana el importe del alquiler tiene un **recargo del 20%**.
//        - El alquiler del casco cuesta **2 €** (no se le aplica el recargo de fin de semana).
//        - Los socios del club **Pedalea Fácil** tienen un **15% de descuento** sobre el subtotal (alquiler + recargo + casco).
//
//El programa pedirá el tipo de bicicleta, el número de horas (entre 1 y 24), si es fin de semana, si quiere casco y si es
//socio. Si el tipo de bicicleta o el número de horas no son correctos, se mostrará un mensaje de error y el programa
//terminará.
//
//        Ejemplo 1:
//
//        ```
//Alquiler de bicicletas Pedalea Fácil
//Tipo de bicicleta (1=Urbana, 2=Montaña, 3=Eléctrica): 2
//Número de horas: 3
//        ¿Es fin de semana? (1=sí, 2=no): 2
//        ¿Quiere casco? (1=sí, 2=no): 1
//        ¿Es socio? (1=sí, 2=no): 2
//
//Alquiler (3 horas): 15,00 €
//Recargo fin de semana: 0,00 €
//Casco: 2,00 €
//Subtotal: 17,00 €
//Descuento socio: 0,00 €
//Total a pagar: 17,00 €
//```
//
//Ejemplo 2:
//
//        ```
//Alquiler de bicicletas Pedalea Fácil
//Tipo de bicicleta (1=Urbana, 2=Montaña, 3=Eléctrica): 3
//Número de horas: 10
//        ¿Es fin de semana? (1=sí, 2=no): 1
//        ¿Quiere casco? (1=sí, 2=no): 2
//        ¿Es socio? (1=sí, 2=no): 1
//
//Alquiler (día completo): 50,00 €
//Recargo fin de semana: 10,00 €
//Casco: 0,00 €
//Subtotal: 60,00 €
//Descuento socio: 9,00 €
//Total a pagar: 51,00 €
//```
//
//Ejemplo 3:
//
//        ```
//Alquiler de bicicletas Pedalea Fácil
//Tipo de bicicleta (1=Urbana, 2=Montaña, 3=Eléctrica): 1
//Número de horas: 7
//        ¿Es fin de semana? (1=sí, 2=no): 2
//        ¿Quiere casco? (1=sí, 2=no): 1
//        ¿Es socio? (1=sí, 2=no): 1
//
//Alquiler (día completo): 20,00 €
//Recargo fin de semana: 0,00 €
//Casco: 2,00 €
//Subtotal: 22,00 €
//Descuento socio: 3,30 €
//Total a pagar: 18,70 €
//```
//


//Ejemplo 4:
//
//        ```
//Alquiler de bicicletas Pedalea Fácil
//Tipo de bicicleta (1=Urbana, 2=Montaña, 3=Eléctrica): 4
//Error: tipo de bicicleta incorrecto.
//        ```

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bici, horas, semana, casco, socio, maxdia = 0;
        double alquiler = 0, subtotal = 0, total = 0, recargo = 0, descuento = 0;
        System.out.println("Alquiler de bicicletas Pedalea Fácil");
        System.out.println("Tipo de bicicleta (1=Urbana, 2=Montaña, 3=Eléctrica):");
        bici = teclado.nextInt();
        if (bici != 1 && bici != 2 && bici != 3) {
            System.out.println("Error: tipo de bicicleta incorrecto.");
        } else {
            System.out.println("Número de horas:");
            horas = teclado.nextInt();
            if (horas >= 1 && horas <= 24) {

                System.out.println(" ¿Es fin de semana? (1=sí, 2=no):");
                semana = teclado.nextInt();
                System.out.println(" ¿Quiere casco? (1=sí, 2=no):");
                casco = teclado.nextInt();
                System.out.println(" ¿Es socio? (1=sí, 2=no):");
                socio = teclado.nextInt();

                switch (bici) {
                    case 1:
                        maxdia = 20;
                        alquiler = horas * 3;
                        break;
                    case 2:
                        maxdia = 30;
                        alquiler = horas * 5;
                        break;
                    case 3:
                        maxdia = 50;
                        alquiler = horas * 8;


                }
                if (alquiler > maxdia) {
                    alquiler = maxdia;
                    System.out.println("Alquiler (día completo): " + alquiler + " € ");
                } else {
                    System.out.println("Alquiler (" + horas + " horas):" + alquiler + " €");
                }

            } else {
                System.out.println("Error: tipo de horas incorrecto.");
            }
        }


    }
}