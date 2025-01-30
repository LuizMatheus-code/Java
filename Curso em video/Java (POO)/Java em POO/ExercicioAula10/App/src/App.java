public class App {
    public static void main(String[] args) throws Exception {
        //Programa principal
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2_aluno = new Aluno();
        Professor pessoa3_professor = new Professor();
        Funcionario pessoa4_funcionario = new Funcionario();

        pessoa1.setNome("Pedro");
        pessoa2_aluno.setNome("Maria");
        pessoa3_professor.setNome("Claudio");
        pessoa4_funcionario.setNome("Fabiana");

        pessoa1.setSexo("M");
        pessoa4_funcionario.setSexo("F");
        pessoa2_aluno.setIdade(18);

        pessoa2_aluno.setCurso("Informatica");
        pessoa3_professor.setSalario(2500.75f);
        pessoa4_funcionario.setSetor("Estoque");

        //pessoa1.receberAum(550.20f);
        //pessoa2_aluno.mudarTrabalho();
        //pessoa4_funcionario.cancelarMatricula();

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2_aluno.toString());
        System.out.println(pessoa3_professor.toString());
        System.out.println(pessoa4_funcionario.toString());

    }
}
