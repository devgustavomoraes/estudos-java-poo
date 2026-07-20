public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if (isReproduzindo()) {
            System.out.println("O vídeo já está sendo reproduzido.");
            return;
        }

        setReproduzindo(true);
        System.out.println("Vídeo iniciado com sucesso");
    }

    @Override
    public void pause() {
        if (!isReproduzindo()) {
            System.out.println("O vídeo já está pausado");
            return;
        }

        setReproduzindo(false);
        System.out.println("O vídeo foi pausado com sucesso!");
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        if (views <= 1) {
            this.avaliacao = avaliacao;
            return;
        }
        this.avaliacao = (this.avaliacao + avaliacao) / views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                "Avaliação: " + avaliacao + "\n" +
                "Views: " + views + "\n" +
                "Curtidas: " + curtidas + "\n" +
                "Reproduzindo: " + reproduzindo;
    }
}
