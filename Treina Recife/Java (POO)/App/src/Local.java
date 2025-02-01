
import java.util.List;

public class Local {
    private String nome;
    private float valor;
    private String horario_de_visitacao;
    private String atracoes;
    private List<Excursao> excursoes;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getHorario_de_visitacao() {
        return horario_de_visitacao;
    }
    public void setHorario_de_visitacao(String horario_de_visitacao) {
        this.horario_de_visitacao = horario_de_visitacao;
    }
    public String getAtracoes() {
        return atracoes;
    }
    public void setAtracoes(String atracoes) {
        this.atracoes = atracoes;
    }
    public List<Excursao> getExcursoes() {
        return excursoes;
    }
    public void setExcursoes(List<Excursao> excursoes) {
        this.excursoes = excursoes;
    }
}
