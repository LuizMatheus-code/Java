public class Aula07 {
    public static void main(String[] args) throws Exception {
        
        Lutador Pretty_Boy = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        Lutador Putscript = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 1, 1, 1);

        Lutador Snapshadow = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

        Lutador Dead_Code = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

        Lutador Ufocobol = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        Lutador Nerdaard = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        Putscript.apresentar();
    }
}
