public class ContaBanco {
    String numeroConta;
    String tipo;
    String dono;
    float saldo;
    boolean status;

    public void ContaBanco(){ //Método construtor
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(){
        this.saldo = 0;
        this.status = true;
        System.out.println("A conta está aberta.");
    }

    public void fecharConta(){
        if (saldo == 0 && this.status == true) {
            this.status = false;
            System.out.println("A conta foi fechada.");
        } 
        
        else if (this.status != true) {
            System.out.println("A conta ainda nem foi aberta");
        }

        else if (saldo != 0) {
            System.out.println("A conta não pode ser fechada, porque o saldo ainda não é zero.");
        }
    
    }

    public void depositar(float valor){
        if (this.status == true) {
            this.saldo += valor;
            System.out.println("o valor " + valor + " foi depositado na conta \nSaldo: " + this.saldo);     
        } 
        
        else if (this.status != true) {
            System.out.println("A conta ainda não foi aberta");
        }
    }

    public void sacar(float saque){
        
        if (saque <= this.saldo && this.status == true) {
            this.saldo -= saque;
            System.out.println("O valor " + saque + " foi retirado da conta em dinheiro \nSaldo:" + this.saldo);
        } 
        
        else if (this.status != true) {
            System.out.println("A conta ainda nem foi aberta");
        } 
        
        else if (saque >= this.saldo) {
            System.out.println("O valor que você está tentando sacar é muito alto");
            System.out.println("Saldo atual: " + this.saldo);
            System.out.println("Saque: " + saque);
        }

    }

    public void pagarMensal(){
        System.out.println("O usuário pagou a mensalidade");
    }

    public String getDono() {
        return dono;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getStatus(){
        return status;
    }

    public String setDono(String dono){
        this.dono = dono;
        return this.dono;
    }

    public String setNumeroConta(String conta){
        this.numeroConta = conta;
        return this.numeroConta;
    }

    public String setTipo(String tipo){
        this.tipo = tipo;
        return this.tipo;
    }

    public float setSaldo(float saldo){
        this.saldo = saldo;
        return this.saldo;
    }

    public boolean setStatus(boolean status){
        this.status = status;
        return this.status;
    }

}
