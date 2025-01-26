package Imperativos;
public class Exercicio22 {
    public static void main(String[] args) {
        float metros_quadrados = 200;
        float litros_tinta = 0;
        float resto_divisao = 0;
        float quantidade_latas = 0;
        float quantidade_latas_36 = 0;

        litros_tinta = metros_quadrados / 6;
        resto_divisao = litros_tinta % 18;

        quantidade_latas = (litros_tinta - resto_divisao) / 18;

        quantidade_latas_36 = resto_divisao / 3.6f;

        System.out.println("18 litros " + quantidade_latas);
        System.out.println("3.6 litros " + Math.ceil(quantidade_latas_36));
    }
}
