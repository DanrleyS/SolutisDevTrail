import java.util.Scanner;

public class Q60TabelaEvolucao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano inicial: ");
        int anoInicial = scanner.nextInt();
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite o valor inicial da dívida: ");
        double valorDivida = scanner.nextDouble();
        double total = valorDivida;
        System.out.print("Digite a porcentagem da taxa de correção mensal : ");
        double taxaCorrecao = scanner.nextDouble() / 100;

        String nomeMeses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov" ,"Dez"};

        System.out.print("Anos\t");
        for (int i = 0; i <= 11; i++) {
            System.out.print(nomeMeses[i] + "\t");
        }
        System.out.println();

        for(int i = 0; i < anos; i++) {
            System.out.print(anoInicial + "\t");
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.2f\t", total);
                total *= (1 + taxaCorrecao);
            }
            anoInicial++;
            System.out.println();
        }




    }
}
