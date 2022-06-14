import java.util.Scanner;

public class PassouDeAno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua nota: ");
    Integer notaEstudante = scanner.nextInt();

    Boolean nota = notaEstudante >= 70;

    if (nota) {
      System.out.println("Você passou!");
    } else {
      System.out.println("Você não passou!");
    }

    scanner.close();
  }
}
