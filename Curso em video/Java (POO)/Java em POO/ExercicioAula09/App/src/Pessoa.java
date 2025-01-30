public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        this.idade++;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String setNome(String nome){
        this.nome = nome;
        return this.nome;
    }

    public int setIdade(int idade){
        this.idade = idade;
        return this.idade;
    }

    public String setSexo(String sexo) {
        this.sexo = sexo;
        return this.sexo;
    }
}
