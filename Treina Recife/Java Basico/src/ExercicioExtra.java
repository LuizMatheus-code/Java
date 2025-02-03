import java.util.Scanner;

public class golsDeTimes {
    public static void main(String[] args) {
        String[] times = new String[4];
        int[] gols = new int[4];
        int total_de_gols = 0;
        float media;

        Scanner entrada = new Scanner(System.in);

        for (int contador = 0; contador < 4; contador++) {
            System.out.println("Escreva o nome do time " + (contador + 1) + ": ");
            times[contador] = entrada.next();

            System.out.println("Agora, a quantidade de gols " + (contador + 1) + ": ");
            gols[contador] = entrada.nextInt();

            total_de_gols += gols[contador];
        }

        media = (float) total_de_gols / 4;

        for (int i = 0; i < 4; i++) {
            System.out.println("O time " + times[i] + " marcou " + gols[i] + " gol(s).");
        }

        System.out.println("\nA média total de gols foi " + media);

    }
}
