package strings;

public class StringBuilder {

final public static void main(String[] args) {
/*
    var nome = "André";

    final var builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append("Luis"));

    final var reverse = builder.reverse();

    System.out.println(reverse);

    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);
*/
    final var nome = "Carla";
    final var construindo = new java.lang.StringBuilder(nome);
    construindo.append("Eduarda");
    construindo.append("Pecanha");
    construindo.append("Faria");

    final var inverso = construindo.reverse();
    final var insere = inverso.insert(0, "!").insert(inverso.length(), "$");
    System.out.println(inverso);

  }

}
