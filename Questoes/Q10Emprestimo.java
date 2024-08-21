
import java.util.Scanner;
public class Q10Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Salario Bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Digite o valor dos descontos: ");
        double descontos = scanner.nextDouble();
        double emprestimo = (salarioBruto - descontos) * 0.3;

        if (emprestimo <= 0){
            System.out.println("Não é possível fazer empréstimo.");
        } else{
            System.out.println("É possivel fazer um empréstimo no valor de: " + emprestimo);
        }
        scanner.close();
    }
}