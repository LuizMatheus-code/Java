public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.ligarMudo();
        controle.play();
        controle.menosVolume();
        controle.abrirMenu();
    }
}
