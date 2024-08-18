import java.util.Scanner;
public class Q37Fatorial{
    public static void main(String[] args) {
       //variaveis
       int num;
       int fatorial = 1;
       //Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número para calcular fatorial:");
        num = input.nextInt();
     
        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}