public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + getNome());
    }

    @Override // Sobrescrever o metodo da Classe MÃE (Aluno)
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsita! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
