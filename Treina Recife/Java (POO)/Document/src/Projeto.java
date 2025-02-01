import java.util.Date;
import java.util.List;

public class Projeto {
    private String nome_do_projeto;
    private String descricao;
    private Date data_de_inicio;
    private Date data_de_fim;
    private String status;
    private Usuario gerente;

    //coisas
    private Usuario usuario;
    private List<Tarefas> tarefa;

    
    public String getNome_do_projeto() {
        return nome_do_projeto;
    }
    public void setNome_do_projeto(String nome_do_projeto) {
        this.nome_do_projeto = nome_do_projeto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData_de_inicio() {
        return data_de_inicio;
    }
    public void setData_de_inicio(Date data_de_inicio) {
        this.data_de_inicio = data_de_inicio;
    }
    public Date getData_de_fim() {
        return data_de_fim;
    }
    public void setData_de_fim(Date data_de_fim) {
        this.data_de_fim = data_de_fim;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Usuario getGerente() {
        return gerente;
    }
    public void setGerente(Usuario gerente) {
        this.gerente = gerente;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Tarefas> getTarefa() {
        return tarefa;
    }
    public void setTarefa(List<Tarefas> tarefa) {
        this.tarefa = tarefa;
    }

}
