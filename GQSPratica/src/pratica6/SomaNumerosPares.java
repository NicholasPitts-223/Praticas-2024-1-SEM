package pratica6;

import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Criando um vetor para armazenar os números
        int somaPares = 0; // Variável para armazenar a soma dos números pares

        // Lendo os números do teclado e armazenando no vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Imprimindo o vetor
        System.out.println("Vetor digitado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
            // Verificando se o número é par e adicionando à soma
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }
        System.out.println(); // Imprimindo uma nova linha para melhorar a formatação

        // Imprimindo a soma dos números pares
        System.out.println("Soma dos números pares: " + somaPares);

        scanner.close(); // Fechando o scanner
    }
}