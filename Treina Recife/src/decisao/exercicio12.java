package decisao;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da hora");

        double valor_hora = entrada.nextFloat();

        System.out.println("Digite a quantidade de horas trabalhadas");

        int horas_trabalhadas = entrada.nextInt();

        double salario_bruto = valor_hora * horas_trabalhadas;

        double inss = salario_bruto * 0.1;

        double fgts = salario_bruto * 0.11;

        double total_descontos = inss + fgts;

        if (salario_bruto > 900 && salario_bruto <= 1500) {
            double imposto_de_renda = salario_bruto * 0.05;

            total_descontos = total_descontos + imposto_de_renda;

            System.out.printf("(-) Imposto de Renda: %.2f \n", imposto_de_renda);
        }

        else if (salario_bruto > 1500 && salario_bruto <= 2500) {
            double imposto_de_renda = salario_bruto * 0.1;

            total_descontos = total_descontos + imposto_de_renda;

            System.out.printf("(-) Imposto de Renda: %.2f \n", imposto_de_renda);
        }

        else if (salario_bruto > 2500) {
            double imposto_de_renda = salario_bruto * 0.2;

            total_descontos = total_descontos + imposto_de_renda;

            System.out.printf("(-) Imposto de Renda: %.2f \n", imposto_de_renda);
        }

        double salario_liquido = salario_bruto - total_descontos;

        System.out.printf("Salario bruto: %.2f \n", salario_bruto);

        System.out.printf("(-) INSS: %.2f \n", inss);

        System.out.printf("(-) FGTS: %.2f \n", fgts);

        System.out.printf("Total de descontos: %.2f \n", total_descontos);

        System.out.printf("Salario Líquido: %.2f \n", salario_liquido);

    }
}
