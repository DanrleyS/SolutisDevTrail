import java.util.Scanner;
import java.util.Random;

public class Q41JogoDescobrirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tente descobrir  o número sorteado! (1 a 100)");
        Random random = new Random();
        int numero = random.nextInt(100) + 1;
        int tentativa = 0;
        int quantTentativa = 0;
        while (tentativa != numero) {
            System.out.print("Digite um número: ");
            tentativa = scanner.nextInt();
            quantTentativa++;
            if(tentativa == numero){
                break;
            }
            if(tentativa > numero){
                System.out.println("Sua tentativa foi maior que o número certo!");
            }else{
                System.out.println("Sua tentativa foi menor que o número certo!");
            }
        }

        System.out.println("Parabéns, você acertou! O número era: " + numero);
        System.out.println("Você acertou em " + quantTentativa + " tentativas");
    }
}
