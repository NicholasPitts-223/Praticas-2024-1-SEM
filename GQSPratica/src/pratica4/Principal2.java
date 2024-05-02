package pratica4;

import javax.swing.JOptionPane;

public class Principal2 {
    public static void main(String args[]) {
        validarNota();
        validarSalario();
        validarSexo();
        validarIdade();
        JOptionPane.showMessageDialog(null, "Todos os dados foram informados corretamente!");
    }

    // Método para validar a nota entre 0 e 10
    public static void validarNota() {
        double nota;
        do {
            String entrada = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10): ");
            nota = Double.parseDouble(entrada);
        } while (nota < 0 || nota > 10);
        JOptionPane.showMessageDialog(null, "Nota informada com sucesso!");
    }

    // Método para validar o salário maior que zero
    public static void validarSalario() {
        double salario;
        do {
            String entrada = JOptionPane.showInputDialog("Informe o salário (maior que zero): ");
            salario = Double.parseDouble(entrada);
        } while (salario <= 0);
        JOptionPane.showMessageDialog(null, "Salário informado com sucesso!");
    }

    // Método para validar o sexo 'm' ou 'f'
    public static void validarSexo() {
        String sexo;
        do {
            String entrada = JOptionPane.showInputDialog("Informe o sexo ('m' ou 'f'): ");
            sexo = entrada.toLowerCase();
        } while (!sexo.equals("m") && !sexo.equals("f"));
        JOptionPane.showMessageDialog(null, "Sexo informado com sucesso!");
    }

    // Método para validar a idade entre 0 e 150
    public static void validarIdade() {
        int idade;
        do {
            String entrada = JOptionPane.showInputDialog("Informe a idade (entre 0 e 150): ");
            idade = Integer.parseInt(entrada);
        } while (idade < 0 || idade > 150);
        JOptionPane.showMessageDialog(null, "Idade informada com sucesso!");
    }
}