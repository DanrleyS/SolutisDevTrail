
import java.util.Scanner;

public class Q18DataAniversarioCase4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do dia do aniversário: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o número do mês do aniversário: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("informe o dia atual");
        int diaAtual = scanner.nextInt();
        System.out.println("informe o mês atual");
        int mesAtual = scanner.nextInt();
        System.out.println("informe o ano atual");
        int anoAtual = scanner.nextInt();
        

        boolean dataValida = verificarData(dia, mes);
        String nomeMes = obterNomeMes(mes);
        String nomeSigno = obterSigno(dia, mes);
        int idade = obterIdade(dia, mes, anoNascimento, anoAtual, diaAtual, mesAtual);

        if (dataValida) {
            System.out.println("Data Válida.");
            System.out.println("Mês: " + nomeMes + " Signo: " + nomeSigno);
            System.out.println("E você possui: "+idade+ " anos");
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
    public static String obterSigno(int dia, int mes) {
        switch (mes) {
            case 1: return (dia <= 20) ? "Capricórnio" : "Aquário";
            case 2:return (dia <= 19) ? "Aquário" : "Peixes";
            case 3:return (dia <= 20) ? "Peixes" : "Áries";
            case 4:return (dia <= 20) ? "Áries" : "Touro";
            case 5:return (dia <= 20) ? "Touro" : "Gêmeos";
            case 6:return (dia <= 20) ? "Gêmeos" : "Câncer";
            case 7:return (dia <= 21) ? "Câncer" : "Leão";
            case 8:return (dia <= 22) ? "Leão" : "Virgem";
            case 9:return (dia <= 22) ? "Virgem" : "Libra";
            case 10:return (dia <= 22) ? "Libra" : "Escorpião";
            case 11:return (dia <= 21) ? "Escorpião" : "Sagitário";
            case 12:return (dia <= 21) ? "Sagitário" : "Capricórnio";
            default: return "Mês inválido, ";
        }
    }
    public static int obterIdade( int dia, int mes, int anoNascimento, int anoAtual, int diaAtual, int mesAtual){
        int idadeAprox = anoAtual - anoNascimento;
        int idade = 0;
        if (mesAtual > mes){
            idade = idadeAprox;
        } else if(mesAtual < mes){
            idade = idadeAprox-1;
        } else if (mesAtual == mes){
            if ( diaAtual>= dia) {
                idade = idadeAprox;
            } else{
                idade = idadeAprox-1;
            }
        }
        return idade;
    }
}
