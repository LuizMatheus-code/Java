package decisao;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno");

        float nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota do aluno");

        float nota2 = entrada.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.printf("A média entre %.1f e %.1f é %.1f \n", nota1, nota2, media);

        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
            
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com mérito");
        }
    }
}
