package U1_intro_bucles_condicionales.ejercicios.resolucion.examen_u1_26_27;

//Escribe un programa que pinte por pantalla la palabra **NO** hecha con asteriscos. Ambas letras tendrán la misma altura
//y la misma anchura (la anchura de cada letra es igual a la altura) y estarán separadas por 3 espacios.
//
//- La **N** está formada por dos columnas verticales y una diagonal que va desde la esquina superior izquierda hasta la
//esquina inferior derecha.
//- La **O** es un rectángulo hueco al que le faltan las cuatro esquinas.
//
//Se solicitará al usuario una altura que deberá ser siempre **impar y mayor o igual que 5**. En caso contrario, se
//mostrará un mensaje de error y se volverá a pedir dicha altura.
//
//Ejemplo 1:
//
//        ```
//Introduzca la altura: 4
//Altura incorrecta. Debe ser impar y mayor o igual que 5.
//Introduzca la altura: 5
//
//        *   *    ***
//        **  *   *   *
//        * * *   *   *
//        *  **   *   *
//        *   *    ***
//        ```
//
//Ejemplo 2:
//
//        ```
//Introduzca la altura: 7
//
//        *     *    *****
//        **    *   *     *
//        * *   *   *     *
//        *  *  *   *     *
//        *   * *   *     *
//        *    **   *     *
//        *     *    *****
//        ```

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.print("Introduzca la altura: ");
        int h = sc.nextInt();

        //Compruebo que la altura introducida sea correcta
        while (h < 5 || (h % 2) == 0) {
            System.out.println("Altura incorrecta. Debe ser impar y mayor o igual que 5.");
            System.out.print("Introduzca la altura: ");
            h = sc.nextInt();
        }
*/
        int h = 7;

        //Recorro la altura fila por fila
        for (int i = 0; i < h; i++) {

            //Dibujo la N (ancho = alto)
            for (int j = 0; j < h; j++) {
                if (j == 0 || j == h - 1 || j - i == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }

            System.out.print("   ");

            //Dibujo la O (ancho = alto)
            for (int j = 0; j < h; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == h - 1) || (i == h - 1 && j == 0) || (i == h - 1 && j == h - 1)) {
                    System.out.print(" ");
                } else if (i == 0 || i == h - 1 || j == 0 || j == h - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}