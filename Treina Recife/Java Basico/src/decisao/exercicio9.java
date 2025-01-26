package decisao;

public class exercicio9 {
    public static void main(String[] args) {
        
        int a,b,c;
        a = 10;
        b = 9;
        c = 8;

        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        } 
        
        else if (b < a && b < c) {
            System.out.println("Menor " + b);
        } 
        
        else if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }

        else {
            System.out.println("Todos os valores são iguais");
        }

    }
}
