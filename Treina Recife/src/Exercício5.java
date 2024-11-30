import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em metros");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.printf("Convertendo %.2f metros para centimetros, resulta em %.2f", metros, centimetros);

        scanner.close();
    }
}
