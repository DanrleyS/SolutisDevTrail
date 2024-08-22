import java.util.Random;
public class Q34Sorteio{
    public static void main(String[] args) {
        //Exibindo 50 números sorteados entre 1 e 100
        //Random
        Random random = new Random();

        System.out.println("Números sorteados:");

        for (int i = 0; i < 50; i++) {
            int numero = random.nextInt(50) + 1; // Gera um número entre 1 e 50
            System.out.print(numero + " ");

        }
    }
}
