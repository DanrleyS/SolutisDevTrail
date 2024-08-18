import java.util.Scanner;

public class Q40Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mediaIdade = 0, maiorIdade = -1, menorIdade = 10000000, quantDeMaior = 0;
        System.out.print("Digite a quantidade de pessoas do grupo: ");
        int quantPessoas = scanner.nextInt();
        for(int i = 0; i < quantPessoas; i++) {
            System.out.print("Digite uma idade: " );
            int idadePessoa = scanner.nextInt();
            if (idadePessoa >= 18) {
                quantDeMaior++;
            }
            if (idadePessoa > maiorIdade) {
                maiorIdade = idadePessoa;
            }
            if (idadePessoa < menorIdade) {
                menorIdade = idadePessoa;
            }
            mediaIdade += idadePessoa;
        }


        mediaIdade = mediaIdade/quantPessoas;
        System.out.println("A média das idades é: " + mediaIdade);
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("A quantidade de pessoas maior de idade é: " + quantDeMaior);
    }
}
