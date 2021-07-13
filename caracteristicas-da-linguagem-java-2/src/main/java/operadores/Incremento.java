package operadores;

public class Incremento {

  public static void main(String[] args) {

    var numero = 1;

    System.out.println(++numero); // ENCREMENTO ANTES
    System.out.println(--numero);
    System.out.println(numero++);  // ENCREMENTO DEPOIS
    System.out.println(numero);

    var variavel = 10;

    System.out.println(variavel);
    System.out.println(variavel--);
    System.out.println(variavel);
  }
}
