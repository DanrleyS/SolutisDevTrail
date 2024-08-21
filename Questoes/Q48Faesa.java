import java.util.Scanner;

public class Q48Faesa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float somaNotas = 0f;
        float mediaNotas;
        boolean aprovadoNota = false;
        boolean aprovadoFalta = false;

        System.out.println("Digite a quantidade de aulas:");
        int quantidadeAulas = scan.nextInt();

        System.out.println("Digite a quantidade de faltas:");
        int quantidadeFaltas = scan.nextInt();

        System.out.println("Digite a quantidade de notas:");
        int qtdNotas = scan.nextInt();

        System.out.println("Digite as notas:");
        for(int i = 0; i < qtdNotas; i++) {
            float nota = scan.nextFloat();
            somaNotas += nota;
        }

        mediaNotas = somaNotas / qtdNotas;

        if(mediaNotas >= 7) {
            aprovadoNota = true;
        }

        if(quantidadeFaltas <= (quantidadeAulas * 0.25)) {
            aprovadoFalta = true;
        }

        if(aprovadoNota && aprovadoFalta) {
            System.out.println("Foi aprovado nesta disciplina.");
        } else if (!aprovadoNota && !aprovadoFalta) {
            System.out.println("Foi reprovado nesta disciplina por nota e falta.");
        } else if (!aprovadoNota) {
            System.out.println("Foi reprovado nesta disciplina por nota.");
        } else {
            System.out.println("Foi reprovado nesta disciplina por falta.");
        }
    }
}

