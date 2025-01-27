public class Aula04 {
    public static void main(String[] args) throws Exception {
        ContaBanco minha_conta = new ContaBanco();

        minha_conta.abrirConta();

        minha_conta.setSaldo(1500);

        minha_conta.sacar(500);
    }
}
