import java.util.Scanner;
public class Q12MediaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        System.out.printf("A Média é: %.2f e o Status é: ", media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if( media <7 && media >= 5){
            System.out.println("Recuperação");
        } else if (media < 5){
            System.out.println("repovado");
        } else{
            System.out.println("Operação Inválida");
        }
        scanner.close();
    }
}
