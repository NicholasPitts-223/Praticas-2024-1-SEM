package Pratica1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1) Área do losango
        System.out.println("Informe a diagonal maior do losango:");
        double diagonalMaior = scanner.nextDouble();
        System.out.println("Informe a diagonal menor do losango:");
        double diagonalMenor = scanner.nextDouble();
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + areaLosango);
        
        // 2) Celsius para Fahrenheit
        System.out.println("Informe a temperatura em Celsius:");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        
        // 3) Salários mínimos
        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Informe o valor do salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");
        
        // 4) Hipotenusa de um triângulo
        System.out.println("Informe o valor do primeiro cateto:");
        double cateto1 = scanner.nextDouble();
        System.out.println("Informe o valor do segundo cateto:");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("A hipotenusa do triângulo é: " + hipotenusa);
        
        // 5) Esfera
        System.out.println("Informe o raio da esfera:");
        double raio = scanner.nextDouble();
        double comprimentoEsfera = 2 * Math.PI * raio;
        double areaEsfera = Math.PI * Math.pow(raio, 2);
        double volumeEsfera = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("O comprimento da esfera é: " + comprimentoEsfera);
        System.out.println("A área da esfera é: " + areaEsfera);
        System.out.println("O volume da esfera é: " + volumeEsfera);
        
        scanner.close();
    }
}