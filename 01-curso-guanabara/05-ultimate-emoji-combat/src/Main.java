public class Main {
    public static void main(String[] args) {
        // 1. Criamos a estrutura para armazenar os lutadores
        Lutador[] l = new Lutador[6]; // Vetor para criar 6 lutadores (0..5)

        // 2. Preenchemos o vetor com os dados dos lutadores
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Javaicedo", "Brasil", 24, 1.72f, 70.5f, 15, 0, 2);
        l[5] = new Lutador("RubyKing", "Alemanha", 34, 1.86f, 80.5f, 12, 5, 1);

        // 3. O EVENTO COMEÇA AQUI: Instanciamos a luta perto de onde vamos usá-la
        Luta UEC01 = new Luta();

        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
    }
}