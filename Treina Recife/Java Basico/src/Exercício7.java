import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado do quadrado");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        double DobroDaArea = 2 * area;

        System.out.println("A área do quadrado equivale a " + area);
        System.out.println("O dobro da área é: " + DobroDaArea);

        scanner.close();
    }
}
