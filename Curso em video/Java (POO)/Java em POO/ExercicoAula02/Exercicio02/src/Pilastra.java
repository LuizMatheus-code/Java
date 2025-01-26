public class Pilastra {
    float altura;
    float largura;
    float comprimento;
    String cor;

    void Verificar_cor(){
        System.out.println("Cor da pilastra: " + this.cor);
    }

    void pintar(String nova_cor){
        System.out.println("A pilastra era " + this.cor);
        this.cor = nova_cor;
        System.out.println("Agora, ela ficou " + this.cor);
    }
}
