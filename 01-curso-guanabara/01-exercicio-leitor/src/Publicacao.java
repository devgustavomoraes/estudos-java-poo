public interface Publicacao {
    // Por padrao todo metodo declarado dentro de uma interface obrigatoriamente e public e abstrato
    void abrir();
    void fechar();
    void folhear(int p);
    void avancarPag();
    void voltarPag();
}
