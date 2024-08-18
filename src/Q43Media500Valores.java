import java.util.Scanner;

public class Q43Media500Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 500;
        double soma = 0;

        System.out.println("Digite 500 valores:");

        for (int i = 1; i <= total; i++) {
            System.out.print("Valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / total;

        System.out.println("média: " + media);
    }
}


