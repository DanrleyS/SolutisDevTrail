import java.util.Scanner;

public class Q61DesenhoPiramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("quantidade de linhas: ");
        int linhas = scanner.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
