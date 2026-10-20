package U1_intro_bucles_condicionales.ejercicios.resolucion.entregable_u1_26_27;

/*
Escribe un programa que **rote hacia la izquierda** los dígitos de un número entero positivo tantas posiciones como
indique el usuario. Al rotar una posición, el primer dígito (el de más a la izquierda) pasa a ser el último y el resto
se desplaza una posición hacia la izquierda.

- El número se pedirá mientras no sea positivo.
- El número de posiciones a rotar será un entero mayor o igual que 0. Si es mayor que la cantidad de dígitos del número,
  se debe tener en cuenta que rotar tantas posiciones como dígitos tiene el número lo deja igual.
- Si el resultado empieza por uno o varios ceros, se mostrará sin ellos (como cualquier número).

Usa `long` en lugar de `int` para admitir números largos.

Ejemplo 1:

```
Introduzca un número entero positivo: 123456
Introduzca las posiciones a rotar: 2
El número 123456 rotado 2 posiciones es 345612
```

Ejemplo 2:

```
Introduzca un número entero positivo: 123456
Introduzca las posiciones a rotar: 8
El número 123456 rotado 8 posiciones es 345612
```

Ejemplo 3:

```
Introduzca un número entero positivo: -40
Introduzca un número entero positivo: 1050
Introduzca las posiciones a rotar: 1
El número 1050 rotado 1 posiciones es 501
```

Ejemplo 4:

```
Introduzca un número entero positivo: 98765
Introduzca las posiciones a rotar: 5
El número 98765 rotado 5 posiciones es 98765
```

**NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS**

*/

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long n;
        long r;

        do {
            System.out.println("Introduzca un numero entero positivo: ");
            n = teclado.nextLong();
            teclado.nextLine();


        } while (n < 0);
        long originaln = n;

        long i = 0;
        int contador = 0;
        System.out.println("Introduce las posiciones a rotar ");
        int rotaciones = teclado.nextInt();
        teclado.nextLine();
        do {
            contador++;
            r = n % 10;
            n = n / 10;
            i = i * 10 + r;
            System.out.println("resto = " + r);
            System.out.println("n = " + n);
            System.out.println("i = " + i);
            System.out.println();
        } while (n != 0);
        long d;
        for (int k = 0; k < rotaciones; k++) {
            d = i % 10;
            i = i + d * (long) Math.pow(10, contador);
            i = i / 10;
            System.out.println("i = " + i);
        }
        long resultado = 0;
        do {
            contador++;
            r = i % 10;
            i = i / 10;
            resultado = resultado * 10 + r;

        } while (i != 0);
        System.out.println(resultado);
    }
}