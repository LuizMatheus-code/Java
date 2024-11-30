import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, escreva um número ");

        int numero = scanner.nextInt();

        System.out.println("O número informado foi " + numero);

        scanner.close();

    }
}
