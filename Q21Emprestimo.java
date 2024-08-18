import java.util.Scanner;

public class Q21Emprestimo {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Variáveis
        String cargo;
        double salario;
        double percentual = 0.0;
        double valorEmprestimo;

        
        System.out.println("Informe o cargo do funcionário (Diretoria, Gerência, Operacional):");
        cargo = input.nextLine().toLowerCase();
        cargo = cargo.replaceAll("[\\p{M}]", ""); 


        while (!cargo.equals("diretoria") && !cargo.equals("gerencia") && !cargo.equals("operacional"))
        {
            System.out.println("Informe um cargo válido: ");
            cargo = input.nextLine().toLowerCase().replaceAll("[\\p{M}]", "");
        }

        System.out.println("Informe o salário do funcionário:");
        salario = input.nextDouble();

        //Usando o switch para definir a porcentagem do emprestimo
        switch (cargo) {
            case "diretoria":
                percentual = 0.30;
                break;
            case "gerencia":
                percentual = 0.25;
                break;
            case "operacional":
                percentual = 0.20;
                break;
        }
        

        //calculando o valor do emprestimo
        valorEmprestimo = salario * percentual;

        System.out.printf("\nO valor do empréstimo possível para o cargo de "+ cargo + " é R$" + valorEmprestimo);
        input.nextLine(); // Consumir a nova linha pendente

     
        input.close();
    }
}
