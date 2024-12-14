package Imperativos;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        
        double tamanho_da_area, litros_que_vou_usar;
        int latas_para_usar;
        double preco_das_latas;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o tamanho em metros quadrados da area?");

        tamanho_da_area = entrada.nextDouble();

        litros_que_vou_usar = tamanho_da_area / 3;

        latas_para_usar = (int) Math.ceil(litros_que_vou_usar / 18);

        preco_das_latas = latas_para_usar * 80;

        System.out.printf("Com %.2fm² de area, será necessário %d lata(s) de tinta", tamanho_da_area, latas_para_usar);
        System.out.printf("\nO preço total é: %f", preco_das_latas);
    }
}
