package Imperativos;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        float fahrenheit;
        float celsius;

        Scanner entrada_de_dados = new Scanner(System.in);

        System.out.println("Informe o valor em fahrenheit");

        fahrenheit = entrada_de_dados.nextFloat();

        celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.printf("Com Fahrenheit em %.2f Fº, a temperatura em Celsius fica: %.2f Cº", fahrenheit, celsius);

        entrada_de_dados.close();

    }
}
