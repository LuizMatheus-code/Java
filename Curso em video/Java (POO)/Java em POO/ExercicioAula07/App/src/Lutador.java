public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){ //Método construtor
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

        if (peso < 52.2) {
            this.categoria = "Inválido. Muito leve.";
        } else if (peso <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido. Muito pesado";
        } 

        
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Deste lado, temos: " + this.nome);
        System.out.println("Representando a terra natal: " + this.nacionalidade);
        System.out.println("Com apenas: " + this.idade + " anos");
        System.out.println("Medindo: " + this.altura + "m");
        System.out.println("Pesando: " + this.peso + "Kg");
        System.out.println("Na categoria: " + this.categoria);
        System.out.println("Já acumulou: " + this.vitorias + " Vitórias");
        System.out.println("Também possui: " + this.derrotas + " Derrotas");
        System.out.println("E, por fim: " + this.empates + " Empates");
    }

    public void status(){
        System.out.printf("Nome: %s \nNacionalidade: %s \nIdade: %d \nAltura: %f \nPeso: %f \nCategoria: %s \nVitórias:%d \nDerrotas: %d \nEmpates: %d ",this.nome, this.nacionalidade, this.idade, this.altura, this.peso, this.categoria, this.vitorias, this.derrotas, this.empates);
    }

    public void ganharLuta(){
        System.out.println("O lutador " + this.nome + " Ganhou a luta");
        this.vitorias += 1;
    }

    public void perderLuta(){
        System.out.println("O lutador " + this.nome + " Perdeu a luta");
        this.derrotas += 1;
    }

    public void empatarLuta(){
        System.out.println("O lutador " + this.nome + "Empatou a luta");
        this.empates += 1;
    }

    //Metodos setters e getters

    public String getNome(){
        return this.nome;
    }

    public String setNome(String nome){
        this.nome = nome;
        return this.nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public String setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
        return this.nacionalidade;
    }

    public int getIdade(){
        return this.idade;
    }

    public int setIdade(int idade){
        this.idade = idade;
        return this.idade;
    }

    public float getAltura(){
        return this.altura;
    }

    public float setAltura(float altura){
        this.altura = altura;
        return this.altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public float setPeso(float peso){
        this.peso = peso;
        return this.peso;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public String setCategoria(String categoria){
        this.categoria = categoria;
        return this.categoria;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public int setVitorias(int vitorias){
        this.vitorias = vitorias;
        return this.vitorias;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public int setDerrotas(int derrotas){
        this.derrotas = derrotas;
        return this.derrotas;
    }

    public int getEmpates(){
        return this.empates;
    }

    public int setEmpates(int empates){
        this.empates = empates;
        return this.empates;
    }

}
