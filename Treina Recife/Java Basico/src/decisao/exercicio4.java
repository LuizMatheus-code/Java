package decisao;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        char letra;

        System.out.println("Digite a letra");

        Scanner entrada = new Scanner(System.in);

        letra = entrada.next().toUpperCase().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.printf("A letra %c é vogal", letra);    
        } 
        
        else {
            System.out.printf("A letra %c é uma consoante", letra);
        }
        
    }
}
