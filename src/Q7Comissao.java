
import java.util.Scanner;
public class Q7Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor pago pelo cliente: ");
        double valor = scanner.nextDouble();
        double comissao = valor*0.1;
        System.out.println("A comissão do Garçom é de: "+ comissao);
        scanner.close();
    }
}