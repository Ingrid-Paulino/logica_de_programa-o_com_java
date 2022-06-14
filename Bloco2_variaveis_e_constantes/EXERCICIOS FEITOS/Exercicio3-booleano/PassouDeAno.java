import java.util.Scanner;

public class PassouDeAno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua nota: ");
    Integer notaEstudante = scanner.nextInt();

    Boolean nota = notaEstudante >= 70;

    if (nota) {
      System.out.print("Você passou!");
    } else {
      System.out.print("Você não passou!");
    }

    scanner.close();
  }
}
