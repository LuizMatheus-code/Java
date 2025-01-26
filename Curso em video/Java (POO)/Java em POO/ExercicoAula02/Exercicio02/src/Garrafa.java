public class Garrafa {
    float quantidade_de_agua;
    float tamanho_da_garrafa;
    float cor;
    boolean garrafa_tampada;

    void tampar(){
        if (this.garrafa_tampada == true) {
            System.out.println("A garrafa já está tampada");
        } else {
            this.garrafa_tampada = true;
            System.out.println("Agora, a garrafa ficou tampada: " + this.garrafa_tampada);   
        }
    }

    void destampar(){
        if (this.garrafa_tampada == false) {
            System.out.println("A garrafa já está destampada");
        } else {
            this.garrafa_tampada = false;
            System.out.println("Agora, a garrafa ficou destampada");
            System.out.println(garrafa_tampada);   
        }
    }
}
