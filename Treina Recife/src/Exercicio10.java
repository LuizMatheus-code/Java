package Imperativos;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.printf("Se o raio é %.2f, o volume é: %.2f", raio, volume);
    
        scanner.close();
    
    }
}
