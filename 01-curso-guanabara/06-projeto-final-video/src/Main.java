public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[4];

        v[0] = new Video("Java POO");
        v[1] = new Video("Java + Spring Boot");
        v[2] = new Video("Banco de dados MySQL");
        v[3] = new Video("Git e Github");

        Gafanhoto[] g = new Gafanhoto[4];

        g[0] = new Gafanhoto("Moraes", 24, 'M', "moraes21");
        g[1] = new Gafanhoto("Carneiro", 24, 'F', "leticia16");
        g[2] = new Gafanhoto("Shelby", 1, 'M', "shelbynho");
        g[3] = new Gafanhoto("Cleitinho", 2, 'M', "cleiton12");

        Visualizacao[] vis = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].getFilme().play();
        vis[0].getFilme().like();
        vis[0].getFilme().pause();
        vis[0].avaliar();
        System.out.println(vis[0]);

        vis[1] = new Visualizacao(g[1], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1]);



    }
}