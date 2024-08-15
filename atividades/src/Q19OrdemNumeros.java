import java.util.Scanner;

public class Q19OrdemNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        if (num1 < num2) {
            System.out.println("ordem crescente: "+ num1+ ", "+ num2);
        } else if (num1 > num2){
            System.out.println("ordem crescente: "+ num2+ ", "+ num1);
        } else{
            System.out.println("numeros iguais");
        }
        scanner.close();
    }
}
