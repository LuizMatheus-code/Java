package decisao;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        float primeiro, segundo, maior;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");

        primeiro = entrada.nextFloat();

        System.out.println("Digite outro numero");

        segundo = entrada.nextFloat();

        if (primeiro > segundo) {
            maior = primeiro;
        } 

        else {
            maior = segundo;
        }

        System.out.printf("Dentre os numeros %.2f e %.2f, o maior é %.2f", primeiro, segundo, maior);

    }
}
