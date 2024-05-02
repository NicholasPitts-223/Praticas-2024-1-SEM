package pratica10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo (número a ser dividido): ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o divisor (número pelo qual será dividido): ");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }

            int resultado = dividendo / divisor;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}