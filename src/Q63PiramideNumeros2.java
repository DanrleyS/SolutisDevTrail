import java.util.Scanner;

public class Q63PiramideNumeros2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
        scan.close();
    }
}

