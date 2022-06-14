import java.util.Scanner;

public class CalculandoOQuadrado {
  public static void main(String[] args) { // Essa strutura main indica que vamos executar um programa java
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    Integer numero = scanner.nextInt(); 

    Integer resultado = numero * numero;

    System.out.println("Seu numero ao quadrado é : " + resultado); 
    scanner.close();
  }
}
