package whiles;

public class While {
  final public static void main(String[] args) {

    var xis = 0;

    //Testa a condição antes
    while (xis < 1) {
      System.out.println("Dentro do while...");
      xis++;
    }

    var ypson = 0;

    //Testa a condição depois
    do {
      System.out.println("Dentro do do/while...");
    } while (ypson++ < 1);
  }

}
