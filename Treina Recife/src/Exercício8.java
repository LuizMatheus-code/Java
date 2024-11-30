import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto essa pessoa ganha por hora?");
        double salarioPorHora = scanner.nextDouble();

        System.out.println("Quantas horas essa pessoa trabalhou por mes?");
        double horasDeTrabalho = scanner.nextDouble();

        double salario = salarioPorHora * horasDeTrabalho;

        System.out.println("O salario no final do mês é: R$" + salario);

        scanner.close();
    }
}
