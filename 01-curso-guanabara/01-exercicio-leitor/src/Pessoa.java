public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos Get e Set
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Métodos (comportamentos)
    public void fazerAniver() {
        setIdade(getIdade() + 1);
        System.out.println("Feliz aniversário, " + getNome() + "! Parabéns pelos seus " + getIdade() + " anos.");
    }
}
