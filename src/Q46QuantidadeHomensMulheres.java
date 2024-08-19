import java.util.Scanner;

public class Q46QuantidadeHomensMulheres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int homens = 0;
        int mulheres = 0;

        for (int i = 0; i < 200; i++) {
            System.out.println("Nome:");
            String nome = scan.nextLine();

            System.out.println("Idade:");
            while (!scan.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número:");
                scan.next();
            }
            int idade = scan.nextInt();
            scan.nextLine();

            if (idade >= 18) {
                System.out.println("Sexo (M/F):");
                String sexo = scan.nextLine();

                while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    System.out.println("Entrada invalida.");
                    sexo = scan.nextLine();
                }

                if (sexo.equalsIgnoreCase("M")) {
                    homens++;
                } else if (sexo.equalsIgnoreCase("F")) {
                    mulheres++;
                }

                System.out.println(nome + " " + idade + " " + sexo);
            }
        }

        System.out.println("Homens maiores de idade: " + homens);
        System.out.println("Mulheres maiores de idade: " + mulheres);
    }
}

