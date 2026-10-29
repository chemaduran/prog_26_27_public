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

public class ej4_resuelto {
	public static void main(String[] args) {

		int n = 19;
		int copia = n;

		// Paso 1. Ir al procedimiento más "pequeño".
		while (n != 1 && n != 4) {
			int suma = 0;
			while (n != 0) {
				int dig = n % 10;
				n = n / 10;
				suma += dig * dig;
			}
			System.out.println(suma);
			n = suma;
		}


		if (n == 1) {
			System.out.println("El número " + copia + " es feliz");
		} else if (n == 4) {
			System.out.println("El número " + copia + " NO es feliz");
		}

		n = copia;
		int contador = 0;

		for (int i = 1; i <= copia; i++) {
			n = i;
			while (n != 1 && n != 4) {
				int suma = 0;
				while (n != 0) {
					int dig = n % 10;
					n = n / 10;
					suma += dig * dig;
				}

				n = suma;
			}

			if (n == 1) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " números felices entre el 1 y el " + copia);
	}
}
