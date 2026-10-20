# Uso de Math.Random

Para obtener números aleatorios dentro de un rango de números enteros, deberemos aplicar la siguiente fórmula:

```
Min + (int)(Math.random() * ((Max - Min) + 1))
```

La función de la biblioteca Java `Math.random()` genera un valor doble en el rango `[0,1)`. Es decir, en este rango, no se incluye el 1.

Para obtener primero un rango específico de valores, se debe multiplicar por la magnitud del rango de valores que se desea cubrir.

```
Math.random() \* ( Max - Min )
```

Esto devuelve un valor en el rango `[0, Max-Min)`, donde `Max-Min` no está incluido.

Por ejemplo, si desea `[5, 10)`, debe cubrir cinco valores enteros, por lo que se debería hacer:

```
Math.random() * 5
```

Esto devolverá un valor en el rango `[0, 5)`, donde 5 no está incluido.

Ahora deberemos cambiar este rango hasta el rango que queremos. Para ello, agregue el valor mínimo.

```
Min + (Math.random() * (Max - Min))
```

Ahora se obtiene un valor en el rango `[Min, Max)`. Siguiendo nuestro ejemplo, `[5, 10)`:

```
5 + (Math.random() * (10 - 5))
```

Pero todavía no incluye a `Max` y se obtiene un valor `double`. Para incluir el valor máximo, se debe agregar 1 a su parámetro de rango (máximo - mínimo) y luego truncar la parte decimal convirtiéndola a un int. Esto se logra a través de:

```
Min + (int)(Math.random() * ((Max - Min) + 1))
```

Y ahí lo tienes. Un valor entero aleatorio en el rango `[Min,Max]`, o según el ejemplo `[5,10]`:

```
5 + (int)(Math.random() * ((10 - 5) + 1))
```
