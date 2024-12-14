package decisao;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        char genero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 'F' para Feminino ou 'M' para Masculino");

        genero = entrada.next().toUpperCase().charAt(0);

        if (genero == 'F') {
            System.err.println("F - Feminino");
        } 
        
        else if (genero == 'M') {
            System.out.println("M - Masculino");
        } 
        
        else {
            System.out.println("Não Binário");
        }
    }
}
