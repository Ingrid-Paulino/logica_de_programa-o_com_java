import java.util.Scanner;

public class tipo_texto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // String nome = "Ingrid Paulino";
    String nome = scanner.nextLine();


    System.out.println("Olá " + nome + "!");

    Character variavelChar = 'A'; // Character Aceita só 1 caracter

    System.out.println(variavelChar);

    scanner.close();
  }
}
