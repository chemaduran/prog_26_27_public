package U3_strings_arrays_funciones.teoria.arrays;

import java.util.Scanner;

public class arrays_intro {
	public static void main(String[] args) {
		// Los arrays son objetos que contienen una colección de datos.
		// Los arrays se pueden crear de dos formas:
		// 1. Creando un array con una determinada longitud y un valor por defecto.
		double[] b = new double[5];
		// 2. Creando un array con una colección de datos.
		double[] arr = {10, 23.5, 15, 7, 8.9};

		// Podemos imprimir un elemento de un array con el operador [],
		// accediendo a su índice. OJO, los arrays empiezan en 0.
		System.out.println(arr[0]);

		// Para obtener la longitud de un array, usamos la propiedad length.
		System.out.println(arr.length);

		// También podemos imprimir todos los elementos de un array con
		// un bucle for.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		// También podemos imprimir todos los elementos de un array con
		// un bucle for each.
		for (double elemento : arr) {
			System.out.print(elemento + ", ");
		}
		System.out.println();

		// ¿Qué pasa si imprimimos "directamente" el array?
		System.out.println(arr);

		// ...Y también podemos asignarles valores
		int k = 3;
		double h = 4.6;
		arr[k] = 100;
		arr[0] = h * 5;
		arr[k + 1] = (k + 5) * 2;

		// Podemos asignar un valor directamente en un bucle o según lo
		// que indique el usuario (o cualquier otro proceso)
		Scanner teclado = new Scanner(System.in);

		final int MAXIMO_VALOR = 3;

		int[] datos2 = new int[MAXIMO_VALOR];
		for (int i = 0; i < datos2.length; i++) {
			System.out.print("Deme el dato " + i + ": ");
			datos2[i] = teclado.nextInt();
		}

		for (int i = datos2.length - 1; i >= 0; i--) {
			System.out.println("El dato " + i + " vale " + datos2[i]);
		}


		// OJO CON LAS LLAMADAS A FUNCIONES
		//    int[] array_f = {7, 7, 7, 7, 7};
		//    System.out.println("El array antes de la función: ");
		//    for (int i = 0; i < array_f.length; i++) {
		//      System.out.print(array_f[i] + ", ");
		//    }
		//    System.out.println();

		int[] array_f = {7, 7, 7, 7, 7};

		funcion(array_f);

		System.out.println("El array después de la función: ");
		for (int i = 0; i < array_f.length; i++) {
			System.out.print(array_f[i] + ", ");
		}

		System.out.println();

	} // main

	// Función para pasar un array
	public static void funcion(int[] arr) {
		System.out.println("El array EN de la función");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}