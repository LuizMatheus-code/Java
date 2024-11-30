import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int numero1 = scanner.nextInt();

        System.out.println("Infomre o segundo número");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " Resulta em " + soma);

        scanner.close();
    }
}
