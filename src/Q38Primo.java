import java.util.Scanner;

public class Q38Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é primo");
            return;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                System.out.println(numero + " não é primo");
                return;
            }
        }
        System.out.println(numero + " é primo");

    }
}
