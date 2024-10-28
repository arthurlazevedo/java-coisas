package alura.src.main.java.br.com.alura.cursos.introducao;

import java.util.Random;
import java.util.Scanner;

public class Numeros {

    public static void convertCToF(Scanner reader)  {
        int tempEmC = reader.nextInt();

        double tempEmF = tempEmC * 1.8 + 32;

        System.out.printf("A temperatura %s em Celsius equivale a %s em F", tempEmC, tempEmF);
    }

    public static void randomNum(Scanner reader) {
        int randomNumber = new Random().nextInt(100);
        int chosenNumber = 0;
        int tries = 0;

        while (randomNumber != chosenNumber && tries < 5) {
            System.out.println("Tente adivinhar o número aleatório:");
            chosenNumber = reader.nextInt();

            if (tries != 4) {
                if (chosenNumber < randomNumber) {
                    System.out.println("Pequeno demais amigão");
                } else if (chosenNumber > randomNumber) {
                    System.out.println("Grande demais meu parça");
                }
            }
            tries++;
        }

        if (randomNumber == chosenNumber) {
            System.out.println("Parabéns, você adivinhou! O número realmente era " + randomNumber);
        } else {
            System.out.printf("Burrão hein. Número era %s, pô", randomNumber);
        }
    }

    public static void evenOrOdd(Scanner reader) {
        System.out.println("Digite o número que deseja saber se é par ou ímpar");
        double chosenNumber = reader.nextInt()/2.0;

        if (Math.round(chosenNumber) == chosenNumber) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
    }

    public static void factorial(Scanner reader) {
        System.out.println("Digite o número que deseja saber o fatorial");
        int chosenNumber = reader.nextInt();
        int factorial = 1;

        while (chosenNumber > 20) {
            System.out.println("Calma lá amigão, quer matar o programa é?");
            chosenNumber = reader.nextInt();
        }

        for (int i = chosenNumber; i > 0; i--) {
            factorial *= i;
        }

        System.out.printf("O fatorial do número %s é %s!", chosenNumber, factorial);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("""
                Opções:
                1. Calcular o fatorial de um número
                2. Revelar se um número é par ou ímpar
                3. Tentar adivinhar um número aleatório
                4. Converter a temperatura em C para F""");
        int option = reader.nextInt();

        switch (option) {
            case 1 -> factorial(reader);
            case 2 -> evenOrOdd(reader);
            case 3 -> randomNum(reader);
            case 4 -> convertCToF(reader);
            default -> System.out.println("Fechando o programa...");
        }
    }
}
