package alura.src.main.java.br.com.alura.cursos.introducao;

import java.util.Scanner;

public class AplicacaoDesafio {

    public static class Poggers {
        public String name;
        public String accountType;
        public double amount;
    }


    private final static String data = """
                ********************************************
                Dados iniciais do cliente:
                                
                Nome:          %s
                Tipo da Conta: %s
                Saldo Inicial: R$ %.2f
                ********************************************
                """;

    private final static String options = """
                \nOperações Disponíveis
                                
                1 - Consultar Saldos
                2 - Transferir valor
                3 - Receber valor
                4 - Sair do programa
                
                Digite a opção desejada:""";

    private static void start(Scanner reader, Poggers poggers) {

        System.out.println("Bem vindo à TuzinhoTatu bancos soluções fiscais e blabla, crie sua conta para iniciar" +
                "sua jornada legal demais.");

        System.out.println("\nDigite seu nome:");
        poggers.name = reader.nextLine();

        System.out.println("\nDiga o tipo da sua conta:");
        poggers.accountType = reader.nextLine();

        System.out.println("\nPor fim, nos informe quantos money você tem:");
        poggers.amount = reader.nextDouble();

        System.out.println("Parabéns, caso ache que perdeu um pouquinho de dinheiro às vezes, é só imaginação msm kk\n");

        System.out.printf(data, poggers.name, poggers.accountType, poggers.amount);

        System.out.println(options);
    }

    private static void transaction(Scanner reader, String action, Poggers poggers) {
        System.out.printf("Digite a quantidade que deseja %s:", action);
        poggers.amount = action.equals("transferir") ? poggers.amount - reader.nextDouble() : poggers.amount + reader.nextDouble();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Poggers poggers = new Poggers();

        start(reader, poggers);

        int chosenOption = reader.nextInt();

        while (chosenOption < 4) {
            switch (chosenOption) {
                case 1 -> System.out.printf("Seu saldo atual é: %.2f", poggers.amount);
                case 2, 3 -> {
                    transaction(reader, chosenOption == 2 ? "transferir" : "receber", poggers);
                    System.out.printf("Saldo atualizado! Novo saldo: %.2f\n", poggers.amount);
                }
            }
            System.out.println(options);
            chosenOption = reader.nextInt();
        }
        System.out.println("Fechando o programa...");
    }
}
