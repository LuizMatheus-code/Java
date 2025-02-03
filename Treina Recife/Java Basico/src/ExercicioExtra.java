import java.util.Scanner;

public class golsDeTimes {
    public static void main(String[] args) {
        String[] times = new String[2];
        int[] gols = new int[2];
        int total_de_gols = 0;
        float media;

        Scanner entrada = new Scanner(System.in);

        for (int contador = 0; contador < 2; contador++) {
            System.out.println("Escreva o nome do time " + (contador + 1) + ": ");
            times[contador] = entrada.next();

            System.out.println("Agora, a quantidade de gols " + (contador + 1) + ": ");
            gols[contador] = entrada.nextInt();

            total_de_gols += gols[contador];
        }

        media = (float) total_de_gols / 2;

        System.out.println("A média total de gols foi " + media + "\n");

        for (int i = 0; i < 2; i++) {
            System.out.println("O time " + times[i] + " marcou " + gols[i] + " gol(s).");
            
            if (gols[i] > media) {
                System.out.println("O time " + times[i] + " está acima da média.Foi Ótimo\n");
            } else if (gols[i] < media) {
                System.out.println("O time " + times[i] + " está abaixo da média. Foi Péssimo\n");
            } else {
                System.out.println("O time " + times[i] + " está na média. Foi Bom\n");
            }
        }

    }
}
