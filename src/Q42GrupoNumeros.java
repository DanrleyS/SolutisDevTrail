import java.util.Random;
import java.util.Scanner;

public class Q42GrupoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero1,numero2, numero3;
        for(int i = 1; i <= 40; i++){
            System.out.println("Grupo: " + i);
            numero1 = random.nextInt(60);
            numero2 = random.nextInt(60);
            do {
                numero2 = random.nextInt(60);
            } while (numero2 == numero1);

            do {
                numero3 = random.nextInt(60);
            } while (numero3 == numero1 || numero3 == numero2);

            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            if (numero2 > numero3) {
                int temp = numero2;
                numero2 = numero3;
                numero3 = temp;
            }
            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            System.out.println(" ");
        }
    }
}

