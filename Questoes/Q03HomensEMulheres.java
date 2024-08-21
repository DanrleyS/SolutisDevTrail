
import java.util.Scanner;
public class Q3HomensEMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de homens: ");
        int homens = scanner.nextInt();
        System.out.print("Digite a quantidade de mulheres: ");
        int mulheres = scanner.nextInt();
        int total = homens+mulheres;
        double percHoemens = (double) homens / total *100;
        double percMulheres = (double) mulheres / total*100;
        System.out.printf("O Percentual de homens é de: %.2f%% , e de mulheres: %.2f%% ", percHoemens , percMulheres);

        scanner.close();
    }
}
