import java.util.Scanner;

public class Q28OrdemCrescenteD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1 > n2){
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n1 > n3){
            int aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n2>n3){
            int aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.println(n1 + " " + n2 + " " + n3);
    }
}