import java.util.Scanner;

public class Q16DataAniversarioCase2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();
        boolean dataValida = verificarData(dia, mes);
        String nomeMes = obterNomeMes(mes);

        if (dataValida) {
            System.out.println("Data Válida.");
            System.out.println("Mês: " + nomeMes);
        } else {
            System.out.println("Data inválida.");
        }
        scanner.close();
    }

    public static boolean verificarData(int dia, int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return dia > 0 && dia <= 31;
            case 4: case 6: case 9: case 11:
                return dia > 0 && dia <= 30;
            case 2:
                return dia > 0 && dia <= 28;
            default:
                return false;
        }
    }
    public static String obterNomeMes(int mes) {
        switch (mes) {
            case 1: return "Janeiro, "+ "primeiro trimestre";
            case 2: return "Fevereiro, "+ "primeiro trimestre";
            case 3: return "Março, "+ "primeiro trimestre";
            case 4: return "Abril, "+ "segundo trimestre";
            case 5: return "Maio, "+ "segundo trimestre";
            case 6: return "Junho, "+ "segundo trimestre";
            case 7: return "Julho, "+ "terceiro trimestre";
            case 8: return "Agosto, "+ "terceiro trimestre";
            case 9: return "Setembro, "+ "terceiro trimestre";
            case 10: return "Outubro, "+ "quarto trimestre";
            case 11: return "Novembro, "+ "quarto trimestre";
            case 12: return "Dezembro, "+ "quarto trimestre";
            default: return "Mês inválido, ";
        }
    }
}
