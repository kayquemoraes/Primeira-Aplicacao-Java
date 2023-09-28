import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int soma = 0;
        int avaliacao = 0;
        int qtd_avaliacoes = 0;

        // Loop usando while
        while (avaliacao != -1) {
            System.out.printf("Avaliação (0 a 10) ou -1 para sair: ");
            avaliacao = leitura.nextInt();
            if (avaliacao != -1) {
                soma += avaliacao;
                qtd_avaliacoes++;
            }
        }

        if (qtd_avaliacoes > 0) {
            double media = (double) soma / qtd_avaliacoes;
            System.out.println(String.format("A média das avaliações é: %.2f", media));
        } else {
            System.out.println("Não há avaliações.");
        }
    }
}
