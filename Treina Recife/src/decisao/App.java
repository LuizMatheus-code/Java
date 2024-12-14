package decisao;

public class App {
    public static void main(String[] args) {
        float nota;
        nota = 9;
        if (nota < 0) {
            System.out.println("Nota inválida");
        } else if (nota > 10){
            System.out.println("Nota inválida");
        } else if (0 <= nota && nota <= 10) {
            System.out.println("Nota Válida");
        }
    }
}
