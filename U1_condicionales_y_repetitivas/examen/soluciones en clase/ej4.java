package U1_intro_bucles_condicionales.ejercicios.resolucion.examen_u1_26_27;

//Un número es **feliz** si, al sustituirlo repetidamente por la suma de los cuadrados de sus dígitos, se acaba llegando
//al 1. Si en algún momento se llega al 4, el número **no es feliz** (entraría en un ciclo infinito que nunca pasa por
//el 1).
//
//        Por ejemplo, el 19 es feliz: 1² + 9² = 82 → 8² + 2² = 68 → 6² + 8² = 100 → 1² + 0² + 0² = 1
//
//Escribe un programa que pida un número entero positivo (se pedirá mientras no lo sea) y que:
//
//        1. Muestre la secuencia de números que se va obteniendo hasta llegar al 1 o al 4.
//        2. Indique si el número es feliz o no.
//        3. Indique cuántos números felices hay entre 1 y el número introducido (ambos incluidos).
//
//Ejemplo 1:
//
//        ```
//Introduzca un número entero positivo: 19
//Secuencia: 19 -> 82 -> 68 -> 100 -> 1
//El 19 es un número feliz.
//Entre 1 y 19 hay 5 números felices.
//        ```
//
//Ejemplo 2:
//
//        ```
//Introduzca un número entero positivo: 15
//Secuencia: 15 -> 26 -> 40 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4
//El 15 NO es un número feliz.
//        Entre 1 y 15 hay 4 números felices.
//        ```
//
//Ejemplo 3:
//
//        ```
//Introduzca un número entero positivo: -3
//Introduzca un número entero positivo: 7
//Secuencia: 7 -> 49 -> 97 -> 130 -> 10 -> 1
//El 7 es un número feliz.
//Entre 1 y 7 hay 2 números felices.
//        ```
//
//        **NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS**

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        int n = sc.nextInt();
        int sum = 0;
        int aux = n;
        //for (int i = 1 ; i<=n ; i++);
        if (n == 4) {
        } else {
            while (n != 0 && sum != 4 && sum != 1) {
                int dig = n % 10;
                sum += (dig * dig);
                n /= 10;
                System.out.println(sum);
                if (n == 0) {
                    n = sum;
                    sum = 0;
                }
            }
        }
        if (sum == 1) {
            System.out.println("Es feliz");
        } else {
            System.out.println("No es feliz");
        }


    }
}