package U1_intro_bucles_condicionales.ejercicios.resolucion.entregable_u1_26_27;

/*
La cooperativa **Taxi Veloz** nos ha encargado un programa que calcule el precio de una carrera. Las tarifas son las
siguientes:

| Tarifa   | Bajada de bandera | Precio por km |
|----------|-------------------|---------------|
| Diurna   | 2,50 €            | 1,10 €        |
| Nocturna | 3,50 €            | 1,30 €        |

- Se aplica la tarifa **nocturna** si la carrera empieza entre las 22 y las 6 horas (desde las 22:00 hasta las 6:59,
  es decir, las horas 22, 23, 0, 1, 2, 3, 4, 5 y 6) **o** si es un día festivo. En cualquier otro caso se aplica la
  tarifa diurna.
- El importe del recorrido (bajada de bandera + kilómetros) tiene un **mínimo de 7 €**. Si sale menos, se cobran 7 €.
- Si la carrera empieza o termina en el aeropuerto se añade un **suplemento de 5 €** (que no cuenta para el mínimo).

El programa pedirá los kilómetros recorridos, la hora de inicio (solo la hora, de 0 a 23), si es festivo y si es
una carrera al aeropuerto. Si la hora no está entre 0 y 23 se mostrará un mensaje de error y el programa terminará.

Ejemplo 1:

```
Bienvenido a Taxi Veloz
Kilómetros recorridos: 10
Hora de inicio (0-23): 12
¿Es festivo? (1=sí, 2=no): 2
¿Carrera al aeropuerto? (1=sí, 2=no): 2

Tarifa aplicada: diurna
Bajada de bandera: 2,50 €
Recorrido (10,0 km): 11,00 €
Suplemento aeropuerto: 0,00 €
Total a pagar: 13,50 €
```

Ejemplo 2:

```
Bienvenido a Taxi Veloz
Kilómetros recorridos: 3
Hora de inicio (0-23): 23
¿Es festivo? (1=sí, 2=no): 2
¿Carrera al aeropuerto? (1=sí, 2=no): 1

Tarifa aplicada: nocturna
Bajada de bandera: 3,50 €
Recorrido (3,0 km): 3,90 €
minimo
Suplemento aeropuerto: 5,00 €
Total a pagar: 12,40 €
```

Ejemplo 3:

```
Bienvenido a Taxi Veloz
Kilómetros recorridos: 2
Hora de inicio (0-23): 10
¿Es festivo? (1=sí, 2=no): 2
¿Carrera al aeropuerto? (1=sí, 2=no): 2

Tarifa aplicada: diurna
Bajada de bandera: 2,50 €
Recorrido (2,0 km): 2,20 €
Se aplica la tarifa mínima de 7,00 €
Suplemento aeropuerto: 0,00 €
Total a pagar: 7,00 €
```

Ejemplo 4:

```
Bienvenido a Taxi Veloz
Kilómetros recorridos: 5
Hora de inicio (0-23): 25
Error: la hora introducida no es correcta.
```

 */

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Taxi Veloz");
        System.out.println("Kilómetros recorridos: ");
        double km = sc.nextDouble();
        System.out.println("Hora de inicio (0-23): ");
        int hora = sc.nextInt();
        System.out.println("¿Es festivo? (1=sí, 2=no): ");
        int festivo = sc.nextInt();
        System.out.println("¿Carrera al aeropuerto? (1=sí, 2=no): ");
        int carrera = sc.nextInt();
        System.out.println();
        String tarifa = "";

        while (km < 0) {
            if (hora >= 0 && hora <= 23) {
                tarifa = (hora >= 22 || hora <= 6 || festivo == 1) ? "nocturna" : "diurna";
            } else {
                System.out.println("Error: la hora introducida no es correcta.");
                break;
            }

        }
        double bandera = (tarifa.equals("nocturna")) ? 3.5 : 2.5;
        double recorrido = (tarifa.equals("nocturna")) ? km * 1.3 : km * 1.1;
        double aeropuerto = (carrera == 1) ? 5 : 0;

        System.out.println("Tarifa aplicada: " + tarifa);
        System.out.println("Bajada de bandera: " + bandera + " €");
        System.out.println("Recorrido (" + km + "): " + recorrido + "€");
        if (recorrido < 7) {
            System.out.println("Se aplica la tarifa mínima de 7,00 €");
            recorrido = 7;
        }
        System.out.println("Suplemento aeropuerto: " + aeropuerto + " €");
        double total = recorrido + bandera + aeropuerto;
        System.out.println("Total a pagar: " + total + " €");

    }
}