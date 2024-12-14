package Imperativos;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        double altura_em_metros;
        double peso_ideal;

        Scanner pedir_altura = new Scanner(System.in);

        System.out.println("Digite o valor da sua altura em metros");

        altura_em_metros = pedir_altura.nextDouble();

        peso_ideal = (72.7 * altura_em_metros) - 58;

        System.out.printf("O seu peso ideal equivale a ");
    }
}
