package pratica3;

import java.util.Scanner;

public class Pesquisaprefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalSalarios = 0;
        int totalFilhos = 0;
        int totalPessoas = 0;
        
        System.out.println("Digite o salário da pessoa (digite um valor negativo para sair): ");
        int salario = scanner.nextInt();
        
        while (salario >= 0) {
            totalSalarios += salario;
            
            System.out.println("Digite o número de filhos da pessoa: ");
            int numFilhos = scanner.nextInt();
            totalFilhos += numFilhos;
            
            totalPessoas++;
            
            System.out.println("Digite o salário da próxima pessoa (digite um valor negativo para sair): ");
            salario = scanner.nextInt();
        }
        
        if (totalPessoas > 0) {
            double mediaSalario = (double) totalSalarios / totalPessoas;
            double mediaFilhos = (double) totalFilhos / totalPessoas;
            
            System.out.println("Média Salarial da População: " + mediaSalario);
            System.out.println("Média do Número de Filhos: " + mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
        
        scanner.close();
    }
}
