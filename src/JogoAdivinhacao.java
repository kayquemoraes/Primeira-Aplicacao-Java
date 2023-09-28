import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        System.out.println(numeroGerado);

        int chances = 5;
        System.out.printf(String.format("Você tem %d chances, digite um número de 1 a 100: ", chances));
        int numero = leitura.nextInt();
        while (numero != numeroGerado && chances > 1) {
            chances--;
            System.out.printf(String.format("Você tem %d chances, digite um número de 1 a 100: ", chances));
            numero = leitura.nextInt();

            }
        if (chances > 1) {
            System.out.println("Parabéns! Você adivinhou o número.");
        } else {
            System.out.println("Chances esgotadas!");
        }

    }
}
