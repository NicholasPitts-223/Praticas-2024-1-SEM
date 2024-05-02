package pratica4;

import javax.swing.JOptionPane;

public class Principal1 {
    public static void main(String args[]) {
        String entrada;
        int conta;
        do {
            entrada = JOptionPane.showInputDialog("Informe o número da conta corrente (com 3 dígitos): ");
            // Converte a entrada para inteiro e armazena em conta:
            conta = Integer.parseInt(entrada);

            // Verifica se o número da conta tem 3 dígitos
            if (conta < 100 || conta > 999) {
                JOptionPane.showMessageDialog(null, "O número da conta deve ter 3 dígitos. Tente novamente.");
                continue;
            }

            // Calcula o dígito verificador
            int soma = conta + inverteNumero(conta);
            int digitoVerificador = calcularDigitoVerificador(soma);

            JOptionPane.showMessageDialog(null, "O dígito verificador da conta " + conta + " é: " + digitoVerificador);

            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }

    // Método para inverter um número
    public static int inverteNumero(int num) {
        int inverso = 0;
        while (num > 0) {
            inverso = inverso * 10 + num % 10;
            num /= 10;
        }
        return inverso;
    }

    // Método para calcular o dígito verificador
    public static int calcularDigitoVerificador(int soma) {
        int digito = 0;
        int posicao = 0;
        while (soma > 0) {
            digito += (soma % 10) * posicao;
            soma /= 10;
            posicao++;
        }
        return digito % 10;
    }
}