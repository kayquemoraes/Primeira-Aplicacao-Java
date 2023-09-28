import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // Usando classe Scanner e instânciando
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.printf("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.printf("Digite sua avaliação para o filme (0 a 10): ");
        double avaliacao = leitura.nextDouble();

        System.out.println(String.format("Filme: %s", filme));
        System.out.println(String.format("Ano de lançamento: %d", anoDeLancamento));
        System.out.println(String.format("Avaliação: %.2f", avaliacao));


    }
}
