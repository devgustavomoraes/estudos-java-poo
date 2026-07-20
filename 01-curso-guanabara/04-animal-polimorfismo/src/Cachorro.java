public class Cachorro extends Lobo {

    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    // Implementação do Polimorfismo de Sobrecarga
    // Estou sobrecarregando um metodo, tenho várias formas de se fazer algmuma coisa utilizando o mesmo nome, utilizando assinaturas diferentes na mesma classe.

    public void reagir (String frase) {
        if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Olá")) {
            System.out.println("Abanar e Latir");
            return;
        }

        System.out.println("Rosnar");
    }

    public void reagir (int hora, int minuto) {
        if (hora < 12) {
            System.out.println("Abanar");
            return;
        }

        if (hora >= 18) {
            System.out.println("Ignorar");
            return;
        }

        System.out.println("Abanar e Latir");
    }

    public void reagir (Boolean dono) {
        if (dono) {
            System.out.println("Abanar");
            return;
        }

        System.out.println("Rosnar e Latir");
    }

    public void reagir (int idade, float peso) {
        if (idade < 5 && peso < 10) {
            System.out.println("Abanar");
            return;
        }

        if (idade < 5 && peso >= 10) {
            System.out.println("Latir");
            return;
        }

        if (idade >= 5 && peso < 10) {
            System.out.println("Rosnar");
            return;
        }

        System.out.println("Ignorar"); // Porque ele vai atender ao requisito 'velho' e 'pesado'
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
}
