import java.util.Scanner;
public class Q14NomeDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do mês: ");
        String mes = scanner.nextLine().toLowerCase();

        if(mes.equals("janeiro")){
            System.out.println("Mês 1");
        } else if(mes.equals("fevereiro")){
            System.out.println("Mes 2");
        } else if(mes.equals("março")){
            System.out.println("Mes 3");
        } else if(mes.equals("abril")){
            System.out.println("Mes 4");
        } else if(mes.equals("maio")){
            System.out.println("Mes 5");
        } else if(mes.equals("junho")){
            System.out.println("Mes 6");
        } else if(mes.equals("julho")){
            System.out.println("Mes 7");
        } else if(mes.equals("agosto")){
            System.out.println("Mes 8");
        } else if(mes.equals("setembro")){
            System.out.println("Mes 9");
        } else if(mes.equals("outubro")){
            System.out.println("Mes 10");
        } else if(mes.equals("novembro")){
            System.out.println("Mes 11");
        } else if(mes.equals("dezembro")){
            System.out.println("Mes 12");
        } else{
            System.out.println("Inválido.");
        }
        scanner.close();
    } 
}


    