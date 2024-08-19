import java.util.Arrays;
import java.util.Scanner;

public class Q28OrdemCrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[3];

        vet[0] = scan.nextInt();
        vet[1] = scan.nextInt();
        vet[2] = scan.nextInt();

        Arrays.sort(vet);

        System.out.println("Ordenado: " + vet[0] + " " + vet[1] + " " + vet[2]);
    }
}
