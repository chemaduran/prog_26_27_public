package U1_intro_bucles_condicionales.ejercicios;

import java.math.BigDecimal;

public class ieee754_resuelto {
  public static void main(String[] args) {
    BigDecimal num1 = new BigDecimal("10.0");
    BigDecimal num2 = new BigDecimal("9.6");
    BigDecimal resultado = num1.subtract(num2);

    if (resultado.equals(new BigDecimal("0.4"))) {
      System.out.println("Resta bien hecha");
    } else {
      System.out.println("Resta mal hecha");
    }

    System.out.println(resultado);
  }
}
