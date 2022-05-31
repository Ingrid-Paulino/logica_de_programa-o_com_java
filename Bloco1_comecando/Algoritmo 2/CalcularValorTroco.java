import java.util.Scanner;

public class CalcularValorTroco {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Uma das formas de fazer a leitura de um numero que o usuario digitar

    System.out.print("Digite o valor do produto: ");
    Double valorProduto = scanner.nextDouble(); // valorProduto === variavel, guarda o valor.
    
    System.out.print("Digite quantidade passada pelo cliente: ");
    Double valorPassadoPeloCliente = scanner.nextDouble();

    Double resultado = valorPassadoPeloCliente -  valorProduto;


    System.out.println("Troco : " + resultado); // 1º compila: javac nomeArquivo.java 2º rode: java nomeArquivos

    scanner.close(); // Encerra o scanner
  }
}
