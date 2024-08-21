import java.util.Scanner;

public class Q27MaiordeTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c){
            System.out.println("Os 3 numeros sao iguais.");
        }else{
            int maior = a;

            if (b>maior){
                maior = b;
            }

            if (c>maior){
                maior = c;
            }
            System.out.println("O maior numero eh: " + maior);
        }
    }
}