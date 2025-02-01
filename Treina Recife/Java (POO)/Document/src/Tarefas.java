import java.util.Date;

public class Tarefas {
    private String titulo;
    private String descricao;
    private Date data;
    private Status status;
    private Usuario responsavel;
    private Projeto projeto;
    private boolean definir_lembrete;

    //coisas
    private Usuario usuario;
    private Projeto projeto2;

    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Usuario getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public boolean isDefinir_lembrete() {
        return definir_lembrete;
    }
    public void setDefinir_lembrete(boolean definir_lembrete) {
        this.definir_lembrete = definir_lembrete;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Projeto getProjeto2() {
        return projeto2;
    }
    public void setProjeto2(Projeto projeto2) {
        this.projeto2 = projeto2;
    }

}
