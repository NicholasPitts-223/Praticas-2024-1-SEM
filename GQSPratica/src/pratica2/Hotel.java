package pratica2;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tipo de apartamento (S para simples, D para duplo):");
        char tipoApartamento = scanner.next().charAt(0);
        System.out.println("Digite a quantidade de dias em que o hóspede esteve hospedado:");
        int quantidadeDias = scanner.nextInt();
        
        double totalAPagar = calcularTotalAPagar(tipoApartamento, quantidadeDias);
        
        if (totalAPagar == 0) {
            System.out.println("Não foi possível calcular o total a pagar. Verifique os dados inseridos.");
        } else {
            System.out.println("O total a ser pago é: R$" + totalAPagar);
        }
        
        scanner.close();
    }
    
    public static double calcularTotalAPagar(char tipoApartamento, int quantidadeDias) {
        double totalAPagar = 0;
        
        if (tipoApartamento == 'S' || tipoApartamento == 's') {
            if (quantidadeDias < 10) {
                totalAPagar = quantidadeDias * 100.00;
            } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
                totalAPagar = quantidadeDias * 90.00;
            } else if (quantidadeDias > 15) {
                totalAPagar = quantidadeDias * 80.00;
            }
        } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
            if (quantidadeDias < 10) {
                totalAPagar = quantidadeDias * 140.00;
            } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
                totalAPagar = quantidadeDias * 120.00;
            } else if (quantidadeDias > 15) {
                totalAPagar = quantidadeDias * 100.00;
            }
        }
        
        return totalAPagar;
    }
}