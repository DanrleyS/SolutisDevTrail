import java.util.Scanner;

public class Q47PacientesClinica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdpaciente = 0;
        int numero_idade = 0;
        int soma_idade = 0;
        int qtd_mulheres_altura_peso = 0;
        int qtd_idade = 0;
        int mais_velho = 0;
        String nome_maisvelho = "";
        String mulher_baixa = "";
        float mulher_mais_baixa = Float.MAX_VALUE;

        float maiorIMC = 0;
        String nome_maiorIMC = "";

        while(true){
            System.out.println("Nome:");
            String nome = scan.nextLine();

            if (nome.equals("fim")){
                break;
            }

            System.out.println("Sexo:");
            String sexo = scan.nextLine();

            System.out.println("Peso:");
            float peso = scan.nextFloat();

            System.out.println("Idade:");
            int idade = scan.nextInt();

            scan.nextLine();

            if(idade >= 18 && idade <= 25){
                qtd_idade++;
            }

            if(idade > mais_velho){
                mais_velho = idade;
                nome_maisvelho = nome;
            }

            if(sexo.equalsIgnoreCase("M")){
                soma_idade += idade;
                numero_idade++;
            }

            System.out.println("Altura:");
            float altura = scan.nextFloat();

            scan.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                if (altura < mulher_mais_baixa) {
                    mulher_mais_baixa = altura;
                    mulher_baixa = nome;
                }

                if(peso > 70 && altura >= 1.60 && altura <= 1.70){
                    qtd_mulheres_altura_peso++;
                }
            }

            float IMC = peso / (altura * altura);
            if(IMC > maiorIMC){
                maiorIMC = IMC;
                nome_maiorIMC = nome;
            }

            qtdpaciente++;
        }

        System.out.println("Quantidade de pacientes: " + qtdpaciente);

        if (numero_idade > 0) {
            float mediaH = (float)soma_idade / numero_idade;
            System.out.println("Media de idade dos homens: " + mediaH);
        } else {
            System.out.println("Nenhum homem foi registrado.");
        }

        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 "
                + "e peso acima de 70kg: " + qtd_mulheres_altura_peso);

        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + qtd_idade);

        System.out.println("Nome do paciente mais velho: " + nome_maisvelho);

        System.out.println("Nome da mulher mais baixa: " +
                (mulher_baixa.isEmpty() ? "Nenhuma mulher registrada" : mulher_baixa));

        System.out.printf("Nome do paciente com maior IMC: %s (IMC: %.2f)%n", nome_maiorIMC, maiorIMC);


        scan.close();
    }
}

