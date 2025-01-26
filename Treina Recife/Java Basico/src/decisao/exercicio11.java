package decisao;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do salário");

        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextFloat();

        if (salario <= 280) {

            System.out.println("O salário original é: " + salario);

            System.out.println("O percentual de aumento foi 20%");

            System.out.println("O valor do aumento é: " + (salario * 0.2));

            salario = salario + (salario * 0.2);

            System.out.println("O salário com 20% de aumento é: " + salario);

        } else if (280 < salario && salario <= 700) {

            System.out.println("O salário original é: " + salario);

            System.out.println("O percentual de aumento foi 15%");

            System.out.println("O valor do aumento é: " + (salario * 0.15));

            salario = salario + (salario * 0.15);

            System.out.println("O salário com 15% de aumento é: " + salario);

        } else if (700 < salario && salario <= 1500) {

            System.out.println("O salário original é: " + salario);

            System.out.println("O percentual de aumento foi 10%");

            System.out.println("O valor do aumento é: " + (salario * 0.1));

            salario = salario + (salario * 0.1);

            System.out.println("O salário com 10% de aumento é: " + salario);

        } else {

            System.out.println("O salário original é: " + salario);

            System.out.println("O percentual de aumento foi 5%");

            System.out.println("O valor do aumento é: " + (salario * 0.05));

            salario = salario + (salario * 0.05);

            System.out.println("O salário com 5% de aumento é: " + salario);

        }

    }
}
