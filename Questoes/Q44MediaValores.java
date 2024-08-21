import java.util.Scanner;

public class Q44MediaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores: ");
        int total = scanner.nextInt();
        double soma = 0;

        System.out.println("Digite " + total + " valores:");

        for (int i = 1; i <= total; i++) {
            System.out.print("Valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / total;

        System.out.println("média: " + media);
    }
}


