import java.util.Scanner;
public class Q36NumerosImpares{
    public static void main(String[] args) {
        //variaveis
        int num1;
        int num2;
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        num1 = input.nextInt();
        System.out.println("Informe o segundo valor:");
        num2 = input.nextInt();

        // Trocando valores para garantir que num1 sempre seja o maior valor
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Números ímpares entre " + num1 + " e " + num2 + ":");

        for (int i = num1; i <= num2; i++)
        {
            if ( i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}