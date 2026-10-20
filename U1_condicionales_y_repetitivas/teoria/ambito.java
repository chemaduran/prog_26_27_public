package U1_intro_bucles_condicionales.teoria;

public class ambito {
  public static void main(String[] args) {
      //
      int ambito_global_al_main = 1;

      if (true) {
          System.out.println("puedo imprimir: " + ambito_global_al_main);
          int ambito_local_a_este_if = 3;
          System.out.println("puedo imprimir: " + ambito_local_a_este_if);
      } else if (false) {
          int ambito_local_a_este_if = 4;
          System.out.println(ambito_local_a_este_if);
      }

      // ambito_local_a_este_if no es accesible desde aquí, no me puedo referir a él
  }
}
