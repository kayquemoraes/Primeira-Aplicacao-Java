import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Tipos primitivos
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println();

        // Média
        double media = (9.8 + 8.0 + 6.3) / 3;
        System.out.println("Média: " + media);
        System.out.println();

        // String
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);
        System.out.println();

        // Usando método format da classe String
        String nomeMenina = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nomeMenina, idade, valor));
        System.out.println();

        // Usando formatted
        String nomeMenino = "João";
        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nomeMenino, aulas);

        System.out.println(mensagem);
        System.out.println();

        // Casting implícito
        int x = 10;
        double y = x;

        // Casting explícito
        double a = 10.5;
        int b = (int) a;

        // Exercício temperatura
        double celsius = 23;
        double farenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("Gruas Celsius: %f\nFarenheit: %f", celsius, farenheit));
        int farenheitInt = (int) farenheit;
        System.out.println(String.format("Farenheit inteiro: %d", farenheitInt));
    }
}