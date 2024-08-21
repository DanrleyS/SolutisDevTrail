import java.util.Scanner;
public class Q13MediaAprovacao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        System.out.printf("A Média é: %.2f e o Status é: ", media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if( media <7 && media >= 5){
            System.out.println("Recuperação");
            System.out.println("deseja fazer a prova final? (média de aprovação 5) - s/n?");
            String decisao = scanner.next().toLowerCase();
            
            if (decisao.equals("s")) {
                System.out.println("qual a nota da prova final?");
                double notaFinal = scanner.nextDouble();
                if (notaFinal>= 5 ) {
                    System.out.println("aprovado");
                }else{
                    System.out.println("Reprovado");
                }
            } else if (decisao.equals("n")) {
                System.out.println("Reprovado");
            } else {
                System.out.println("opção inválida");
            }
        } else if (media < 5){
            System.out.println("repovado");
        } else{
            System.out.println("Operação Inválida");
        }
        scanner.close();
    }
}
