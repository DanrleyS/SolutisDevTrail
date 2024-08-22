import java.util.Random;
import java.util.Scanner;
public class Q35SorteioPersonalizado{
    public static void main(String[] args) {
        //variáveis
        int quantidade;
        int faixaMin;
        int faixaMax;
        //Random
        Random random = new Random();
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos números deseja sortear?");
        quantidade = input.nextInt();

        System.out.println("Informe o valor mínimo da faixa:");
        faixaMin = input.nextInt();

        System.out.println("Informe o valor máximo da faixa:");
        faixaMax = input.nextInt();

        System.out.println("Números sorteados:");

        for (int i = 0; i < quantidade; i++)
        {
            int numero = random.nextInt(faixaMax - faixaMin + 1) + faixaMin;
            System.out.print(numero + " ");

        }

    }
}
