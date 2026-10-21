# Ejercicio 1 (Ej1.java)

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

# Ejercicio 2 (Ej2.java)

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

# Ejercicio 3 (Ej3.java)

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

# Ejercicio 4 (Ej4.java)

Realiza el juego de **"Adivina el número"**. El ordenador genera un número aleatorio entre 1 y 100 (ambos incluidos) y
el usuario tiene como máximo **7 intentos** para adivinarlo.

- Tras cada intento fallido, el programa indicará si el número secreto es **mayor** o **menor** y, además, dará una
  pista sobre lo cerca que está el usuario:
    - **¡Caliente!** si la diferencia con el número secreto es menor o igual que 5.
    - **Templado** si la diferencia es menor o igual que 15.
    - **Frío** en cualquier otro caso.
- Si el usuario introduce un número fuera del rango 1-100, se mostrará un aviso y **ese intento no contará**.
- Si acierta, se mostrará en cuántos intentos lo ha conseguido. Si agota los 7 intentos, se mostrará cuál era el número
  secreto.

Ejemplo 1 (número secreto: 63):

```
He pensado un número entre 1 y 100. Tienes 7 intentos.
Intento 1: 50
El número es mayor. Templado
Intento 2: 150
Ese número no está entre 1 y 100. No cuenta como intento.
Intento 2: 75
El número es menor. Templado
Intento 3: 65
El número es menor. ¡Caliente!
Intento 4: 63
¡Enhorabuena! Has acertado en 4 intentos.
```

Ejemplo 2 (número secreto: 8):

```
He pensado un número entre 1 y 100. Tienes 7 intentos.
Intento 1: 90
El número es menor. Frío
Intento 2: 50
El número es menor. Frío
Intento 3: 30
El número es menor. Frío
Intento 4: 20
El número es menor. Templado
Intento 5: 12
El número es menor. ¡Caliente!
Intento 6: 10
El número es menor. ¡Caliente!
Intento 7: 9
El número es menor. ¡Caliente!
Lo siento, has agotado tus intentos. El número era el 8.
```

**NOTA: Recordad que usando la librería Math, se pueden generar números aleatorios.**

# <ins>Instrucciones para la Entrega</ins>

Entregar un archivo comprimido (zip o rar) que contenga cada uno de los ficheros correspondientes a los ejercicios (
Ej1.java, Ej2.java, Ej3.java, Ej4.java)

EL fichero comprimido se llamará Apellido1_Apellido2_U1_ENTREGABLE.zip (o rar)

Evita ñ y acentos en los nombres.

Deberán subirse a GitHub los ficheros descomprimidos (Ej1.java, Ej2.java, Ej3.java, Ej4.java) en la carpeta
correspondiente (U1_ENTREGABLE) que se encontrará dentro de la carpeta U1_intro_bucles_condicionales

**NOTA:** Para cada uno de los ejercicios se bajará un 20% del mismo por cada error sintáctico corregido por el profesor
para que el ejercicio pudiera funcionar correctamente. Se tendrá también en cuenta la eficiencia de los algoritmos.
