package strings;

public class Strings {

final public static void main(String[] args) {

    final var nome = "André";
    final var sobreNome = "Gomes";
    final var nomeCompleto = nome +" "+ sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    final var string = " Minha String ";

    System.out.println("Char na posição: " + string.charAt(5)); //string.charAt(x) retorna o char que está no índice X
    System.out.println("Quantidade = " + string.length()); // Tamanho da String
    System.out.println("Sem Trim: [" + string + "]");
    System.out.println("Com Trim: [" + string.trim() + "]"); // Retira Caracteres em branco nas extremidades
    System.out.println("Lower: " + string.toLowerCase()); // Todas minúsculas
    System.out.println("Upper: " + string.toUpperCase()); // Todas maiúsculas
    System.out.println("Contém M? " + string.contains("M")); //Verifica se existe o caractere selecionado
    System.out.println("Contém X? " + string.contains("X"));
    System.out.println("Replace: " + string.replace("n", "$")); // Substitui um valor por outro
    System.out.println("Equals? " + string.equals(" minha string ")); //Verifica se um valor é igual a outro
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG ")); //Ignora maiúsculas e minúsculas
    System.out.println("Substring(1,6)=" + string.substring(1, 6)); //Imprime os valores referentes aos índices no intervalo

  }
}
