package decisao;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int total_sim = 0;

        System.out.println("Responda com 'Sim' ou 'Não' para as perguntas abaixo: ");

        System.out.println("1. Telefonou para a vítima? ");
        if (entrada.nextLine().equalsIgnoreCase("sim")) {
            total_sim++;
        }

        System.out.println("2. Esteve no local do cirme? ");
        if (entrada.nextLine().equalsIgnoreCase("sim")) {
            total_sim++;
        }

        System.out.println("3. Mora perto da vítima? ");
        if (entrada.nextLine().equalsIgnoreCase("sim")) {
            total_sim++;
        }

        System.out.println("4. Devia dinheiro para a vítima? ");
        if (entrada.nextLine().equalsIgnoreCase("sim")) {
            total_sim++;
        }

        System.out.println("5. Já trabalhou com a vítima? ");
        if (entrada.nextLine().equalsIgnoreCase("sim")) {
            total_sim++;
        }

        if (total_sim == 2) {
            System.out.println("Suspeita");
        } 
        
        else if (total_sim == 3 || total_sim == 4) {
            System.out.println("Cúmplice");
        } 
        
        else if (total_sim == 5) {
            System.out.println("Assasino");
        }
        
        else {
            System.out.println("Inocente");
        }

    }
}
