public class Q59Tabuada{
    public static void main(String[] args) {
        //Exibindo a tabuada de 1 a 10
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("\nTabuada de " + i);

            for(int j = 1; j <= 10; j++)
            {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}