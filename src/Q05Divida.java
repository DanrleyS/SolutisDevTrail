import java.util.Scanner;
public class Q5Divida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inicial do débito: ");
        double debito = scanner.nextDouble();
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite a taxa de Juros mensal em %: ");
        double taxaJuros = scanner.nextDouble();
        double juros = (double) debito*meses*taxaJuros/100;
        double total = debito+juros;
        
        System.out.printf("A divida total é: %.2f ", total);
        scanner.close();
    }   
}
