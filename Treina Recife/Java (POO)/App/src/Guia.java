
import java.util.List;

public class Guia extends Pessoa {
    private List<Excursao> excursoes;

    public List<Excursao> getExcursoes() {
        return excursoes;
    }

    public void setExcursoes(List<Excursao> excursoes) {
        this.excursoes = excursoes;
    }
}
