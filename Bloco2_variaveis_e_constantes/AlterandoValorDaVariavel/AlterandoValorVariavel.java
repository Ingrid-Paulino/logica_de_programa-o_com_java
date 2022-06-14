import java.util.Scanner;

public class AlterandoValorVariavel {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do produto: ");
    Double valorProduto = scanner.nextDouble();

    System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = a prazo]: ");
    Integer tipoPagamento = scanner.nextInt();

    boolean pagamentoAvista = tipoPagamento.equals(1);

    Double juros = 0.0;

    if (!pagamentoAvista) {
      juros = 10.0; // alterando o valor da variavel
    }

    Double acrescimento = valorProduto * juros / 100;

    Double valortotal = acrescimento + valorProduto;

    System.out.println("Valor total: " + valortotal);





    scanner.close();
  }
}
