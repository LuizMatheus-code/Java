public class Aluno extends Pessoa {
    private String materia;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("A matrícula será cancelada.");
    }

    public String getMateria() {
        return materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
