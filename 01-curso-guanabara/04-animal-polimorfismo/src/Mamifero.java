public class Mamifero extends Animal {
    private String corPelo;

    // Sobreposição dos métodos abstratos da Classe Animal (MÃE).
    // Utilização do 'Polimorfismo' já que adaptamos para o animal de cada classe.

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
