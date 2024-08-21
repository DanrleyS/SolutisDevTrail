
import java.util.Scanner;
public class Q2Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor do seu salário atual: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite valor do salário minimo atual: ");
        double salarioMinimo = scanner.nextDouble();
        double quantidade = salario / salarioMinimo;
        System.out.printf("a quantidade de salarios minimos que equivale seu salário é: %2f", quantidade);

        scanner.close();
    }
}
