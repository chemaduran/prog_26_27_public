package U3_strings_arrays_funciones.teoria.funciones;

import static java.lang.System.exit;

public class Salir {
  public static void main(String[] args) {
    llamo_funcion("hola");
    System.out.println("Esto ya no se ejecuta");
  }

  public static void llamo_funcion(String cadena) {
    if (cadena.equals("hola")) {
      exit(1);
    }
  }
}
