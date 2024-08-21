import java.util.Scanner;

public class Q50N_ezimo {
    public static long calFibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n - 1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a posicao: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Valores negativos sao invalidos.");
        } else {
            long fibonacci = calFibo(n);
            System.out.println("O " + n + " termo da sequencia de Fibonacci eh: " + fibonacci);
        }
    }
}

