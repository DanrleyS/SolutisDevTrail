import java.util.Scanner;

public class Q45MaiorDaLista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        for(int i = 0; i<100; i++){
            int n = scan.nextInt();
            if(n>maior){
                maior = n;
            }
        }
        System.out.println(maior);
    }
}