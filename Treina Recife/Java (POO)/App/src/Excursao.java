
import java.util.Date;
import java.util.List;

public class Excursao {
    private float valor;
    private Date data;
    private String nome;
    
    //A galera
    private Motorista motorista;
    private Responsavel responsavel;
    private Transporte transporte;
    private List<Participante> lista_Participantes;
    private List<Guia> lista_guias;
    private List<Local> lista_locais;

    //getters e setters
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public Responsavel getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    public Transporte getTransporte() {
        return transporte;
    }
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    public List<Participante> getLista_Participantes() {
        return lista_Participantes;
    }
    public void setLista_Participantes(List<Participante> lista_Participantes) {
        this.lista_Participantes = lista_Participantes;
    }
    public List<Guia> getLista_guias() {
        return lista_guias;
    }
    public void setLista_guias(List<Guia> lista_guias) {
        this.lista_guias = lista_guias;
    }
    public List<Local> getLista_locais() {
        return lista_locais;
    }
    public void setLista_locais(List<Local> lista_locais) {
        this.lista_locais = lista_locais;
    }

}
