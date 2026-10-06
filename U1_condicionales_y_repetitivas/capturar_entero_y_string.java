package U1_intro_bucles_condicionales.teoria;

import java.util.Scanner;

public class capturar_entero_y_string {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = nc.nextInt();
        nc.nextLine();
        System.out.println("El número es " + numero);
        System.out.println("Ahora introduce una cadena: ");
        String cadena = nc.nextLine();
        System.out.println("La cadena es:" + cadena);
    }
}