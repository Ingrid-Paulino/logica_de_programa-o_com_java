import java.util.Scanner;

public class printName {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.print("Digite seu sobrenome: ");
    String sobrenome = scanner.nextLine();

    System.out.println("Meu nome é: " + nome + " " + sobrenome);

    scanner.close();
  }
}
