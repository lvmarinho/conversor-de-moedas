import java.util.Scanner;

public class Principal {
    // Lista de moedas suportadas
    private static final String[] MOEDAS_SUPORTADAS = {"USD", "ARS", "BRL", "COP"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarConversao = true;

        while (continuarConversao) {
            // Exibir menu de opções
            String menu = "****************************************\n" +
                    "Seja Bem vindo ao Conversor de Moedas =)\n\n" +
                    "1) Dólar (USD) => Peso Argentino (ARS)\n" +
                    "2) Peso Argentino (ARS) => Dólar (USD)\n" +
                    "3) Dólar (USD) => Real Brasileiro (BRL)\n" +
                    "4) Real Brasileiro (BRL) => Dólar (USD)\n" +
                    "5) Dólar (USD) => Peso Colombiano (COP)\n" +
                    "6) Peso Colombiano (COP) => Dólar (USD)\n" +
                    "7) Sair\n" +
                    "Escolha uma opção válida:\n" +
                    "****************************************\n\n";
            System.out.print(menu);

            // Obter a escolha do usuário
            int escolha = scanner.nextInt();

            if (escolha == 7) {
                continuarConversao = false;
                System.out.println("Saindo...");
                break;
            }

            String moedaOrigem = null;
            String moedaDestino = null;

            switch (escolha) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    break;
                case 2:
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 5:
                    moedaOrigem = "USD";
                    moedaDestino = "COP";
                    break;
                case 6:
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            // Obter valor a ser convertido
            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            // Realizar a conversão
            try {
                Moeda moeda = ConversorDeMoedas.obterTaxaDeCambio(moedaOrigem, moedaDestino);
                double valorConvertido = valor * moeda.taxa();
                System.out.printf("Taxa de câmbio: %.4f\n", moeda.taxa());
                System.out.printf("%.2f %s é igual a %.2f %s\n", valor, moedaOrigem, valorConvertido, moedaDestino);
            } catch (Exception e) {
                System.out.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
            }

            // Perguntar se o usuário deseja fazer outra conversão
            System.out.print("Deseja fazer outra conversão? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            if (resposta != 's') {
                continuarConversao = false;
            }
        }

        scanner.close();
        System.out.println("Encerrando o programa...");
    }
}
