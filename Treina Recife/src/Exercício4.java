import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a 1º nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a 2º nota");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a 3º nota");
        double nota3 = scanner.nextDouble();

        System.out.println("Informe a 4º nota");
        double nota4 = scanner.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;

        System.out.printf("a soma de %.1f + %.1f + %.1f + %.1f resulta em %.1f \nAo dividir %.1f por 4, a média é: %.2f", nota1, nota2, nota3, nota4, soma, soma, soma/4);

        scanner.close();
    }
}
