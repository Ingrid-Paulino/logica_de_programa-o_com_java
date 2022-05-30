import java.util.Scanner;

public class CalculaIMC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");

    System.out.print("Digite seu peso: ");
    Double  valorPeso = scanner.nextDouble();

    System.out.print("Digite sua altura: ");
    Double valorAltura = scanner.nextDouble();

    Double resIMC = valorPeso / (valorAltura * valorAltura);

    System.out.print("Seu indice corporal: " + resIMC);

    scanner.close();
  }
}
