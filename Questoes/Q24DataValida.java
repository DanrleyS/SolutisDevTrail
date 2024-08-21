import java.util.Scanner;
public class Q24DataValida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano");
        int ano = scanner.nextInt();
        boolean Valido = ehDataValida(dia, mes, ano);

        if (Valido == true) {
            System.out.println("Data Válida");
        } else{
            System.out.println("Data Inválida");
        }
        scanner.close();
    }
    

    public static boolean ehDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    
        int diasMaximos;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasMaximos = 30;
                break;
            case 2:
                diasMaximos = bissexto ? 29 : 28;
                break;
            default:
                diasMaximos = 31;
                break;
        }

        return dia >= 1 && dia <= diasMaximos;
    }
}
