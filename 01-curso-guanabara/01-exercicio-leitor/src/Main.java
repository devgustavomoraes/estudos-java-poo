public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];

        p[0] = new Pessoa("Gustavo", 24, 'M');
        p[1] = new Pessoa("Leticia", 24, 'F');
        p[2] = new Pessoa("Cleitinho", 10, 'M');

        Livro[] l = new Livro[3];

        l[0] = new Livro("Java POO", "Putscript", 200, 20, true, p[0]);
        l[1] = new Livro("Clean Code", "Phpzeira", 250, 10, false, p[1]);
        l[2] = new Livro("PHP", "José Augusto", 350, 253, false, p[2]);

        p[0].fazerAniver();
        l[0].detalhes();
        l[0].avancarPag();
        l[0].folhear(60);
        l[0].voltarPag();
        l[0].abrir();
        l[0].detalhes();

        p[1].fazerAniver();
        l[1].detalhes();
        l[1].avancarPag();
        l[1].folhear(26);
        l[1].voltarPag();
        l[1].fechar();
        l[1].abrir();
        l[1].detalhes();

        p[2].fazerAniver();
        l[2].detalhes();
        l[2].avancarPag();
        l[2].folhear(200);
        l[2].voltarPag();
        l[2].fechar();
        l[2].abrir();
        l[2].detalhes();
    }
}