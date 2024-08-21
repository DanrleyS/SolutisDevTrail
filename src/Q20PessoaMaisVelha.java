import java.util.Scanner;
public class Q20PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade dela: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da segunda pessoa");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade dela: ");
        int idade2 = scanner.nextInt();

        if (idade1>idade2){
            System.out.println(nome1 + " é mais velho(a) que "+ nome2);
        } else if (idade1<idade2){
            System.out.println(nome2 + " é mais velho(a) que "+ nome1);
        } else{
            System.out.println(nome1+ " possui a mesma idade que "+nome2);
        }
        scanner.close();
    }
    
}


