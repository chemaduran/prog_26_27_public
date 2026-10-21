package U1_intro_bucles_condicionales.ejercicios.resolucion.entregable_u1_26_27;

/*
Escribe un programa que pinte por pantalla una casa hecha de asteriscos. La casa está formada por un tejado (un
triángulo hueco cuya última fila está completa) y, justo debajo, el cuerpo de la casa (un rectángulo hueco con la misma
anchura que la base del tejado).

El usuario introduce la altura del tejado `h`, que deberá ser un número mayor o igual que 3. Si la altura no es
correcta, se mostrará un mensaje de error y se volverá a pedir hasta que sea correcta.

- La base del tejado tiene una anchura de `2h - 1` asteriscos.
- El cuerpo de la casa tiene `h` filas por debajo de la base del tejado (la última fila también está completa).

Ejemplo 1:

```
Introduzca la altura del tejado: 2
Error: la altura debe ser mayor o igual que 3.
Introduzca la altura del tejado: 4

   *
  * *
 *   *
*******
*     *
*     *
*     *
*******
```

Ejemplo 2:

```
Introduzca la altura del tejado: 3

  *
 * *
*****
*   *
*   *
*****
```

Ejemplo 3:

```
Introduzca la altura del tejado: 6

     *
    * *
   *   *
  *     *
 *       *
***********
*         *
*         *
*         *
*         *
*         *
***********
```
*/


import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int h;

        // Comprueba las condiciones de altura
        do {
            System.out.println("Introduzca_la_altura del tejado: ");
            h = teclado.nextInt();
            teclado.nextLine();
        } while (h < 3 || h % 2 == 0);

        int base = h * 2 - 1;

        // Pinta el tejado de la casa
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < base; j++) {
                if (i + j == h - 1 || j - i == h - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }

        // Pinta la base de la casa
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || j == base - 1 || i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}