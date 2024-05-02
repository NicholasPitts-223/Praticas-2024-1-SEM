package pratica5;

import java.util.Scanner;

public class Operacoesmatematica1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Solicitar os dois números inteiros positivos
			System.out.print("Digite o primeiro número inteiro positivo: ");
			int numero1 = scanner.nextInt();

			System.out.print("Digite o segundo número inteiro positivo: ");
			int numero2 = scanner.nextInt();

			int somaImpares = 0;

			// Garantir que o número menor seja o primeiro e o maior seja o segundo
			if (numero1 > numero2) {
			    int temp = numero1;
			    numero1 = numero2;
			    numero2 = temp;
			}

			// Calcular a soma dos números ímpares entre os limites
			for (int i = numero1; i <= numero2; i++) {
			    if (i % 2 != 0) {
			        somaImpares += i;
			    }
			}

			// Imprimir a soma dos números ímpares
			System.out.println("A soma dos números ímpares entre " + numero1 + " e " + numero2 + " é: " + somaImpares);
		}
    }
}