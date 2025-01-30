public class App {
    public static void main(String[] args) throws Exception {
        //Pessoa pessoa1 = new Pessoa();

        /*Visitante visita1 = new Visitante();
        visita1.setNome("Juvenal");
        visita1.setIdade(22);
        visita1.setSexo("Masculino");
        System.out.println(visita1.toString());*/
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Claudio");
        aluno1.setMatricula(1111);
        aluno1.setCurso("Informática");
        aluno1.setIdade(16);
        aluno1.setSexo("Masculino");
        aluno1.pagarMensalidade();

        Bolsista bolsa = new Bolsista();
        bolsa.setMatricula(1112);
        bolsa.setNome("Jubileu");
        bolsa.setBolsa(12.5f);
        bolsa.setSexo("Masculino");

        bolsa.pagarMensalidade();
    }
}
