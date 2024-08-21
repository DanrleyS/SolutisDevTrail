import java.util.Scanner;

public class Q1IdadeAtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.print("Digite o seu ano de nascimento: ");
        int anoDeNascimento = scanner.nextInt();
        int idade = anoAtual - anoDeNascimento;
        System.out.println("esse ano você faz/fez "+ idade);

        scanner.close();
    }
}
