import java.util.Scanner;

public class Q23CompararDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o dia de nascimento da primeira pessoa");
        int dia1 = scanner.nextInt();
        System.out.println("Digite o mês de nascimento da primeira pessoa");
        int mes1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome da segunda pessoa");
        String nome2 = scanner.nextLine();
        System.out.println("Digite o dia de nascimento da segunda pessoa");
        int dia2 = scanner.nextInt();
        System.out.println("Digite o mês de nascimento da segunda pessoa");
        int mes2 = scanner.nextInt();

        if (mes1 < mes2){
            System.out.println(nome1 + " é mais velho(a)");
        } else if (mes2 < mes1){
            System.out.println(nome2 + " é mais velho(a)");
        } else {
            if (dia1<dia2){
                System.out.println(nome1 + " é mais velho(a)");
            } else if (dia2<dia1){
                System.out.println(nome2 + " é mais velho(a)");
            } else{
                System.out.println(nome1+ " " + nome2 + "possuem a mesma idade");
            }
        }
        
        scanner.close();
    }
}



    