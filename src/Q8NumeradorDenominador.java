
import java.util.Scanner;
public class Q8NumeradorDenominador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numeador: ");
        int numerador = scanner.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        if (denominador == 0){
            System.out.println("numerador é 0. Operação inválida");
        } else{
            double resultado = (double) numerador/denominador;
            System.out.printf("numero convertido: %.3f" ,resultado);
        }
        scanner.close();
    } 
}

