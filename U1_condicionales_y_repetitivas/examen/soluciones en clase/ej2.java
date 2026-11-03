package U1_intro_bucles_condicionales.ejercicios.resolucion.examen_u1_26_27;

//Las tarjetas de crédito utilizan el **algoritmo de Luhn** para detectar errores al teclear el número. Escribe un
//programa que pida un número entero positivo (de cualquier longitud que admita el tipo `long`) y que indique si es un
//número válido según este algoritmo:
//
//        1. Se recorren los dígitos **de derecha a izquierda**.
//        2. Los dígitos que ocupan las posiciones pares contando desde la derecha (el 2º, el 4º, el 6º...) se multiplican por 2.
//Si el resultado de multiplicar es mayor que 9, se le resta 9.
//        3. Los dígitos de las posiciones impares (el 1º, el 3º, el 5º...) se dejan como están.
//        4. Se suman todos los valores obtenidos. Si la suma es múltiplo de 10, el número es válido.
//
//El número se pedirá mientras no sea positivo. El programa mostrará la suma obtenida y si el número es válido o no.
//
//        Por ejemplo, para el número `79927398713`:
//
//        ```
//Dígitos (derecha a izquierda): 3  1  7  8  9  3  7  2  9  9  7
//        ¿Se dobla?                     no sí no sí no sí no sí no sí no
//Valor sumado:                  3  2  7  7  9  6  7  4  9  9  7   ->  Suma = 70
//        ```
//
//Ejemplo 1:
//
//        ```
//Introduzca el número de la tarjeta: 79927398713
//Suma de control: 70
//El número 79927398713 es VÁLIDO.
//        ```
//
//Ejemplo 2:
//
//        ```
//Introduzca el número de la tarjeta: 4539578763621486
//Suma de control: 80
//El número 4539578763621486 es VÁLIDO.
//        ```
//
//Ejemplo 3:
//
//        ```
//Introduzca el número de la tarjeta: 0
//Introduzca el número de la tarjeta: 1234567812345678
//Suma de control: 68
//El número 1234567812345678 NO es válido.
//```
//
//        **NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS**

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // condicion para que se pida un número hasta que sea positivo
        long numero;
        do {
            System.out.println("Dame un numero entero para continuar");
            numero = sc.nextLong();
        } while (numero < 0);

        long copia = numero;
        long digito = 0;
        int posicion = 0;
        long suma = 0;

        //recorrer el numero para saber los digitos del numero
        while (copia > 0) {
            digito = copia % 10;
            copia = copia / 10;
            posicion++;

            if (posicion % 2 == 0) {
                digito = digito * 2; // digito *=2

            }
            if (digito > 9) {
                digito = digito - 9; // digito -= 9

            }

            suma = suma + digito;
        }

        System.out.println("Introduzca el número de la tarjeta: " + numero);
        System.out.println("Suma de control: " + suma);
        if (suma % 10 == 0) {
            System.out.println("El número " + numero + " es válido");
        } else {
            System.out.println(" El número " + numero + " NO es válido.");
        }

    }
}