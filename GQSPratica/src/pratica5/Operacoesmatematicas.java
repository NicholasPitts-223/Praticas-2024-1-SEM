package pratica5;
import java.util.Scanner;

public class Operacoesmatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número para calcular o fatorial
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        // Calcular o fatorial
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }

        // Imprimir o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}