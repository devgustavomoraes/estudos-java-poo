public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        espectador.setTotAssistido(espectador.getTotAssistido() + 1);
        espectador.setExperiencia(espectador.getExperiencia() + 3);
        filme.setViews(filme.getViews() + 1);
    }

    public void avaliar() {
        filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        if (porc <= 20) {
            filme.setAvaliacao(3);
            return;
        }

        if (porc <= 50) {
            filme.setAvaliacao(5);
            return;
        }

        if (porc <= 90) {
            filme.setAvaliacao(8);
            return;
        }

        filme.setAvaliacao(10);
    }

    @Override
    public String toString() {
        return "\n--- DETALHES DA VISUALIZAÇÃO ---\n" +
                "-> DADOS DO USUÁRIO:\n" + espectador + "\n\n" +
                "-> DADOS DO VÍDEO:\n" + filme + "\n" +
                "--------------------------------\n";
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
