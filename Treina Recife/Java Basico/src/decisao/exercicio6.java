package decisao;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro número");

        Scanner entrada = new Scanner(System.in);

        float primeiro = entrada.nextFloat();
        
        System.out.println("Digite o segundo número");

        float segundo = entrada.nextFloat();

        System.out.println("Digite o terceiro número");

        float terceiro = entrada.nextFloat();

        if (primeiro >= segundo && primeiro >= terceiro) {
            System.out.printf("O maior é %.1f", primeiro);
            
        } else if (segundo >= primeiro && segundo >= terceiro) {
            System.out.printf("O maior é %.1f", segundo);
            
        } else {
            System.out.printf("O maior é %.1f", terceiro);
        }
    }
    
}
