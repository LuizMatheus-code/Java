package Imperativos;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        float peso_em_quilogramas;
        double peso_em_libras;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o peso em Kg");
        peso_em_quilogramas = entrada.nextFloat();

        peso_em_libras = peso_em_quilogramas * 2.20462;

        System.out.printf("Convertendo %.2fKg em libras fica: %.2f", peso_em_quilogramas, peso_em_libras);
    }
}
