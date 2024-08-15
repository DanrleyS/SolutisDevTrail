import java.util.Scanner;
public class Q11IdadeVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar");
        } else if (idade>= 16 && idade <18 || idade >= 65){
            System.out.println("Pode votar, com voto facultativo");
        } else {
            System.out.println("Voto obrigatório.");
        }
        scanner.close();
    } 
}
