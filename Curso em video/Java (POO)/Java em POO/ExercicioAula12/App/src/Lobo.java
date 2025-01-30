public class Lobo extends Animal {

    public void reagir(String frase){
        if (frase.equals("Toma comida") || frase.equals("Ola")) {
            System.out.println("Abanar");
        } else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int min, int hora){
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar também");
        }
    }

    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Rosnar");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    //Métodos herdados de animal
    @Override
    public void locomover() {
        
    }

    @Override
    public void alimentar() {
   
    }

    @Override
    public void emitirSom() {
   
    }
    
}  
