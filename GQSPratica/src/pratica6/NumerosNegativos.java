package pratica6;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10]; // Criando um vetor para armazenar os números

        // Lendo os números do teclado e armazenando no vetor
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Imprimindo o vetor
        System.out.println("Vetor digitado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Imprimindo uma nova linha para melhorar a formatação

        // Encontrando e imprimindo as posições dos números negativos
        System.out.print("Posições dos números negativos: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Imprimindo uma nova linha para melhorar a formatação

        scanner.close(); // Fechando o scanner
    }
}