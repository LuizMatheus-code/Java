package Imperativos;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        int tempo_total;

        Scanner receber_dados = new Scanner(System.in);

        System.out.println("Informe a sua idade em anos");

        anos = receber_dados.nextInt();

        System.out.println("Informe a sua idade em meses");

        meses = receber_dados.nextInt();

        System.out.println("Informe a sua idade em dias");

        dias = receber_dados.nextInt();

        tempo_total = dias + (meses * 30) + (anos * 360);

        System.out.printf("Você viveu o equivalente a %d dias", tempo_total);

    }
}
