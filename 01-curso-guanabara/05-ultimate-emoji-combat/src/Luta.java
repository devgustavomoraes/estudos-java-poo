import java.util.Random; // Import para gerar um valor aleatório

public class Luta {
    private int vencedor; // Passa a ter memória, o resultado fica gravado nesse Objeto. Se criacemos localmente no metodo lutar() ela iria sumir depois.
    // Ao invés de usar um Tipo Primitivo, vamos usar um tipo Abstrato para `desafiado´ e `desafiante`
    private Lutador desafiado; // Instância da Classe `Lutador`, vai ser um Objeto de Lutador
    private Lutador desafiante; // Isso é um tipo abstrato
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l0, Lutador l1) { // Parâmetros os dois Lutadores do Vetor Lutador
        if (l0.getCategoria().equals(l1.getCategoria()) && l0 != l1) { //getCategoria pertence a Classe "Lutador"
            aprovada = true;
            desafiado = l0;
            desafiante = l1;
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            Random random = new Random(); // Instância dentro do 'if' para nõa gastar processamento e memória. Só cria se a luta for aprovada.

            desafiado.apresentar(); // Desafiado é um Objeto do TIPO LUTADOR, então posso usar os métodos
            desafiante.apresentar();

            vencedor = random.nextInt(3); // Número aleatório de 0, 1 e 2

            switch (vencedor) { // Escolha

                case 0: // Empate
                    System.out.println("A luta Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1: // Ganhou Desafiado
                    System.out.println("Ganhou a luta: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2: // Ganhou Desafiante
                    System.out.println("Ganhou a luta: " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;

                default:
                    System.out.println("Erro na definição do resultado da luta.");
                    break;
            }
            // Dica de "Clean Code", coloca após o switch para não repetir as duas linhas em cada case.
            System.out.println("\n===== PLACAR ATUALIZADO =====");
            desafiado.status();
            desafiante.status();

        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
