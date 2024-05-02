package pratica9;

import java.util.Scanner;

public class MenorMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10]; // Criando um vetor para armazenar os números
        double menor, maior;

        // Lendo os números do teclado e armazenando no vetor
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Inicializando as variáveis menor e maior com o primeiro elemento do vetor
        menor = numeros[0];
        maior = numeros[0];

        // Encontrando o menor e o maior número no vetor
        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Imprimindo o vetor
        System.out.println("Vetor digitado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Imprimindo uma nova linha para melhorar a formatação

        // Imprimindo o menor e o maior número
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        scanner.close(); // Fechando o scanner
    }
}