import java.util.Scanner;

public class Q51Tribonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("O valor de n deve ser maior que 0.");
        } else {
            int[] tribonacci = new int[n];

            if (n >= 1){
                tribonacci[0] = 1;
            }
            if (n >= 2){
                tribonacci[1] = 1;
            }
            if (n >= 3){
                tribonacci[2] = 2;
            }

            for (int i = 3; i < n; i++) {
                tribonacci[i] = tribonacci[i-1] + tribonacci[i-2] + tribonacci[i-3];
            }

            System.out.print("Os " + n + " primeiros termos sao: ");
            for (int i = 0; i < n; i++) {
                System.out.print(tribonacci[i] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

