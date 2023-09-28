import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Digite a quantidade de avaliações: ");
        int qtd_avaliacoes = leitura.nextInt();
        int soma = 0;

        // Loop usando for
        for (int i = 0; i < qtd_avaliacoes; i++) {
            System.out.printf(String.format("Avaliação %d: ", i + 1));
            int avaliacao = leitura.nextInt();
            soma += avaliacao;
        }

        double media = (double) soma / qtd_avaliacoes;

        System.out.println(String.format("A média das avaliações é: %.2f", media));
    }
}
