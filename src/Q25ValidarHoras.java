import java.util.Scanner;

public class Q25ValidarHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        if ((horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60)) {
            System.out.println("O horário é válido: " + horas + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("O horário é inválido!");
        }
    }

}