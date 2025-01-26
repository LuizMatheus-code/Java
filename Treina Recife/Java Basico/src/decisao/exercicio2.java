package decisao;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o número:");

        int numero = dados.nextInt();
        
        if (numero > 0) {
            
            System.out.printf("O número %d é positivo", numero);            
        } 
        
        else if (numero == 0) {

            System.out.printf("O número %d é neutro", numero);
        } 
        
        else {

            System.out.printf("O número %d é negativo", numero);
        }

    }

}
