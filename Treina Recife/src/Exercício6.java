import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double pi = 3.14;
        double area = pi * raio * raio;

        System.out.printf("A área do círculo com raio %.1f é %.2f", raio, area);

        scanner.close();

    }
}
