public class App {
    public static void main(String[] args) throws Exception {
        Mamifero mamifero1 = new Mamifero();
        Reptil reptil1 = new Reptil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();

        Canguru pula_pula = new Canguru();
        Tartaruga tarta1 = new Tartaruga();

        mamifero1.setPeso(85.3f);
        mamifero1.setIdade(2);
        mamifero1.setMembros(4);
        mamifero1.locomover();
        mamifero1.alimentar();
        mamifero1.emitirSom();


        System.out.println("\n");

        peixe1.setPeso(0.35f);
        peixe1.setIdade(1);
        peixe1.setMembros(0);
        peixe1.locomover();
        peixe1.alimentar();
        peixe1.emitirSom();
        peixe1.fazerBolha();

        System.out.println("\n");

        ave1.setPeso(0.89f);
        ave1.setIdade(2);
        ave1.setMembros(2);
        ave1.locomover();
        ave1.alimentar();
        ave1.emitirSom();
        ave1.fazerNinho();

        System.out.println("\n");

        pula_pula.setPeso(55.30f);
        pula_pula.setIdade(3);
        pula_pula.setMembros(4);
        pula_pula.locomover();
        pula_pula.alimentar();
        pula_pula.emitirSom();
        pula_pula.usarBolsa();

    }
}
