package ifs;

import javax.swing.*;

public class IfExemple {

final public static void main(String[] args) {

    final var condicao = JOptionPane.showInputDialog("Digite a condicão: ");

    if (condicao.equals("true")) {
      JOptionPane.showMessageDialog(null,"A condicao é verdadeira");
    } else {
      JOptionPane.showMessageDialog(null,"A condicao é falsa");
    }
/*
    if (condicao == true)
      System.out.println("Uma unica linha...");

    final var ternario = false ? "e verdadeira" : " falsa";

    System.out.println(ternario);*/
  }
}
