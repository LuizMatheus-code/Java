package decisao;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço do produto 1");
        float produto1 = entrada.nextFloat();

        if (produto1 <= 0) {
            System.out.println("O valor do produto 1 não pode ser nulo ou negativo");
        } else{
            
            System.out.println("Digite o preço do produto 2");
            float produto2 = entrada.nextFloat();

            if (produto2 <= 0) {
                System.out.println("O valor do produto 2 não pode ser nulo ou negativo");
            }else {
                
                System.out.println("Digite o preço do produto 3");
                float produto3 = entrada.nextFloat();

                if (produto3 <= 0) {
                    System.out.println("O valor do produto 3 não pode ser nulo ou negativo");
                }else {

                    if (produto1 < produto2 && produto1 < produto3) {
                        System.out.println("O produto 1 é mais barato, custando: " + produto1);
                    } 
                    
                    else if (produto2 < produto1 && produto2 < produto3) {
                        System.out.println("o produto  2 é o mais barato, custando: " + produto2);
                    } 
                    
                    else if (produto3 < produto1 && produto3 < produto2) {
                        System.out.println("O produto 3 é o mais barato, custando: " + produto3);
                    } 
                    
                    else {
                        System.out.println("Todos os produtos têm o mesmo preço");
                    }
                }  
            }
        }
    }
}
