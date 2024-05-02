package pratica10;

//Classe principal
public class Principal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Digite o dividendo (número a ser dividido): ");
         int dividendo = scanner.nextInt();

         System.out.print("Digite o divisor (número pelo qual será dividido): ");
         int divisor = scanner.nextInt();

         int resultado = Divisao.dividir(dividendo, divisor);
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