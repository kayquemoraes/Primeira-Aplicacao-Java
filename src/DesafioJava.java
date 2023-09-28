import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Saldo inicial
        double saldo = 0;

        // Pegando nome
        System.out.printf("Digite seu nome: ");
        String nome = leitura.nextLine();

        // Tipo de conta
        System.out.printf("Digite o tipo de conta (Corrente / Poupança): ");
        String conta = leitura.nextLine();

        System.out.println(String.format("""
                *********************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %.2f
                *********************************************
                """, nome, conta, saldo));

        boolean var = true;
        while (var) {
            System.out.printf("""
                    
                    Operações
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:     
                    """);
            String opcao = leitura.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println(String.format("\nSaldo atual: R$ %.2f", saldo));
                    break;
                case "2":
                    System.out.printf("Digite o valor a receber: ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println(String.format("\nValor de R$ %.2f recebido com sucesso.", valorRecebido));
                    break;
                case "3":
                    System.out.printf("Digite o valor a transferir: ");
                    double valorTransferido = leitura.nextDouble();
                    if ((saldo - valorTransferido) >= 0) {
                        saldo -= valorTransferido;
                        System.out.println(String.format("\nValor de R$ %.2f transferido com sucesso.", valorTransferido));
                    } else {
                        System.out.println("\nSaldo insuficiente para transferência.");
                    }
                    break;
                case "4":
                    System.out.println("\nObrigado por usar nosso aplicativo!");
                    var = false;
                    break;
                default:
                    System.out.println("\nDigite uma opção válida.");
                    break;
            }
        }
    }
}
