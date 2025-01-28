public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){ //Método construtor
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private int setVolume(int volume){
        this.volume = volume;
        return this.volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private boolean setLigado(boolean ligado){
        this.ligado = ligado;
        return this.ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private boolean setTocando(boolean tocando){
        this.tocando = tocando;
        return this.tocando;
    }


    //Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
       this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()) {
            System.out.println("---- Menu ----");
            System.out.println("Está ligado: " + getLigado());
            System.out.println("Está tocando: " + getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10){
                System.out.println("|");
            } 
        } else {
            System.out.println("O controle não está ligado");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && volume > 0) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Erro");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("O controle não está ligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("O controle não está ligado");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("O controle não está ligado");
        }
    }

    @Override
    public void pause() {
        if ( this.getLigado() && this.getTocando() ) {
            this.setTocando(false);
        } else {
            System.out.println("O controle não está ligado");
        }
    }

}
