public class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade de " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
