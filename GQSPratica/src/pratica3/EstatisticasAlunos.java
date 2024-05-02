package pratica3;

import java.util.Scanner;

public class EstatisticasAlunos  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alunos90 = 0;
        int reprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int quantidadeAlunos = 0;
        
        while (true) {
            System.out.println("Digite a nota final do aluno (ou um valor negativo para encerrar):");
            double nota = scanner.nextDouble();
            
            if (nota < 0) {
                break;
            }
            
            System.out.println("Digite o total de faltas do aluno:");
            int faltas = scanner.nextInt();
            
            if (nota >= 90) {
                alunos90++;
            }
            
            if (nota < 70 || faltas >= 20) {
                reprovados++;
            }
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            
            if (nota < menorNota) {
                menorNota = nota;
            }
            
            somaNotas += nota;
            quantidadeAlunos++;
        }
        
        if (quantidadeAlunos == 0) {
            System.out.println("Nenhum aluno foi registrado.");
        } else {
            System.out.println("Quantidade de alunos com nota final maior ou igual a 90: " + alunos90);
            System.out.println("Quantidade de alunos reprovados por nota ou falta: " + reprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + (somaNotas / quantidadeAlunos));
        }
        
        scanner.close();
    }


}
