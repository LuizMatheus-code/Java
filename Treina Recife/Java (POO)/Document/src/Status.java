
import java.util.List;

public class Status {
    private int codigo;
    private String nome_do_projeto;

    //coisas
    private List<Tarefas> tarefa;

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_do_projeto() {
        return nome_do_projeto;
    }

    public void setNome_do_projeto(String nome_do_projeto) {
        this.nome_do_projeto = nome_do_projeto;
    }

    public List<Tarefas> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefas> tarefa) {
        this.tarefa = tarefa;
    }
}
