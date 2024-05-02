package pratica5;

import java.util.Scanner;

public class Operacoesmatematicas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Solicitar os números até que o usuário insira 0
        while (true) {
            System.out.print("Digite um número (ou 0 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break; // Sai do loop se o número for zero
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        // Verificar se pelo menos um número foi inserido
        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número informado é: " + maior);
            System.out.println("O menor número informado é: " + menor);
        } else {
            System.out.println("Nenhum número foi informado.");
        }
    }
}