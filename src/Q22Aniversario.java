import java.util.Scanner;
public class Q22Aniversario {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // variaveis
        int dia1;
        int mes1;
        int dia2;
        int mes2;

        //nota: pensar em um forma de validacao melhor que while

        System.out.println("Digite o dia da primeira data de aniversário:");
        dia1 = input.nextInt();
        System.out.println("Digite o mês da primeira data de aniversário(em numero):");
        mes1 = input.nextInt();


        System.out.println("Digite o dia da segunda data de aniversário:");
        dia2 = input.nextInt();
        System.out.println("Digite o mês da segunda data de aniversário:");
        mes2 = input.nextInt();


        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversário são iguais.");
        } else {
            System.out.println("As datas de aniversário são diferentes.");
        }

        input.nextLine();
        input.close();
    }
}

