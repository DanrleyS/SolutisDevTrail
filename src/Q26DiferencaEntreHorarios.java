import java.sql.SQLOutput;
import java.util.Scanner;

public class Q26DiferencaEntreHorarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora do primeiro horário: ");
        int horas1 = scanner.nextInt();
        System.out.print("Digite os minutos do primeiro horário: ");
        int minutos1 = scanner.nextInt();
        System.out.print("Digite os segundos do primeiro horário: ");
        int segundos1 = scanner.nextInt();

        System.out.print("Digite a hora do segundo horário: ");
        int horas2 = scanner.nextInt();
        System.out.print("Digite os minutos do segundo horário: ");
        int minutos2 = scanner.nextInt();
        System.out.print("Digite os segundos do segundo horário: ");
        int segundos2 = scanner.nextInt();

        int tempoEmSegundos1 = (horas1 * 3600) + (minutos1 * 60) + segundos1;
        int tempoEmSegundos2 = (horas2 * 3600) + (minutos2 * 60) + segundos2;

        System.out.println("A diferença entre eles em segundo é de " + Math.abs(tempoEmSegundos1 - tempoEmSegundos2) + " segundos");

    }

}