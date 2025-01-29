
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void Luta(){ //Método construtor

    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) 
        && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada) {
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("\n### Desafiante ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: 
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("\n" + this.desafiado.getNome() + " Venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("\n" + this.desafiante.getNome() + " Venceu");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }


        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    //metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    
    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada(){
        return aprovada;
    }

    public Lutador setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
        return this.desafiado;
    }

    public Lutador setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
        return this.desafiante;
    }

    public int setRounds(int rounds){
        this.rounds = rounds;
        return this.rounds;
    }

    public boolean setAprovada(boolean aprovada){
        this.aprovada = aprovada;
        return this.aprovada;
    }

}
