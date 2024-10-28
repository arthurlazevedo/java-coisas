package alura.src.main.java.br.com.alura.cursos.introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        System.out.println("""
                Opções:
                
                1. Checar se o número especificado é primo;
                2. Descobrir o próximo primo a partir de um número;
                3. Ver a lista de primos até um certo número;
                4. Encerrar o programa.
                
                Escolha:\s""");

        while (option < 4) {
            option = reader.nextInt();

            switch (option) {
                case 1 -> System.out.println(isPrimeNumber());
                case 2 -> System.out.println(getNextPrime());
                case 3 -> System.out.println(listPrimes());
            }
            System.out.println("\nMesmas opções de antes visse ;)\n");
        }
        System.out.println("Fechando o programa...");
    }

    private static String isPrimeNumber() {
        int numToCheck = getNum("checar");
        return isPrimeNumber(numToCheck) ? "Sim, é um número primo!" : "Não, não é um número primo";
    }

    private static boolean isPrimeNumber(int numToCheck) {
        if (numToCheck < 2) {
            return false;
        }
        if (numToCheck % 2 == 0 && numToCheck > 2) {
            return false;
        }
        for (int i = numToCheck - 1; i > 1; i--) {
            if (numToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getNextPrime() {
        int number = getNum("descobrir qual é o primo sucessor");
        return getNextPrime(number);
    }

    private static int getNextPrime(int number) {
        int prime = number % 2 == 0 ? number + 1 : number + 2;
        while (!isPrimeNumber(prime)) {
            prime += 2;
        }
        return prime;
    }

    private static String listPrimes() {
        int numMax = getNum("descobrir todos os primos que o antecedem");
        String primeList = numMax > 2 ? String.join(", ", listPrimes(numMax)) : "Nenhum :(";
        return "Antecessores primos: " + primeList;
    }

    private static List<String> listPrimes(int numMax) {
        List<String> nums = new ArrayList<>();
        for (int i = 1; i < numMax; i++) {
            if (isPrimeNumber(i)) {
                nums.add(String.valueOf(i));
            }
        }
        return nums;
    }

    private static int getNum(String addon) {
        System.out.printf("Digite o número que deseja %s: ", addon);
        int num = reader.nextInt();
        while (num > 1000) {
            System.out.println("Quer matar o programa é? Digita de novo aí: ");
            num = reader.nextInt();
        }
        return num;
    }
}