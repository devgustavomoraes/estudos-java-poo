public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // Instância da Classe Pessoa (agregação)

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    // Métodos Get e Set
    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    // Métodos (comportamentos)
    public void detalhes() {
        System.out.println("\n===== INFORMAÇÕES SOBRE O LIVRO: " + getTitulo() + " =====");
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de Páginas: " + getTotPaginas());
        System.out.println("Página Atual: " + getPagAtual());
        System.out.println("O livro está aberto: " + isAberto());
        System.out.println("Leitor: " + leitor.getNome() + ", idade: " + leitor.getIdade() + ", sexo: " + leitor.getSexo());
        System.out.println("================================================\n");
    }

    // Sobrescrever os métodos da Interface (Publicacao)
    @Override
    public void abrir() {
        // 1. Cláusula de Guarda: Se a condição de erro/exceção acontecer, avisa e sai imediatamente.
        if (isAberto()) {
            System.out.println("O livro já está aberto.");
            return; // O return força a saída imediata do metodo
        }
        // 2. Fluxo Principal: Só chega aqui se o livro estiver fechado
        System.out.println("Abrindo o livro...");
        setAberto(true);

       /* if (!isAberto()) {
            System.out.println("Abrindo o livro");
            setAberto(true);
        } else {
            System.out.println("O livro já está aberto");
        }*/
    }

    @Override
    public void avancarPag() {
        if (!isAberto()) {
            System.out.println("O livro está fechado");
            return;
        }
        if (getPagAtual() >= getTotPaginas()) {
            System.out.println("Você está na última página, não é possível folhar mais.");
            return; // Força a saída imediata do metodo
        }

        // Fluxo principal Limpo: Só chega aqui se o livro estiver aberto E tiver páginas para avançar
        setPagAtual(getPagAtual() + 1);

      /*  if (isAberto()) {
            if (getPagAtual() < getTotPaginas()) {
                setPagAtual(getPagAtual() + 1);
            } else {
                System.out.println("Você está na última página, não é possivel folhar mais.");
            }
        } else {
            System.out.println("O livro está fechado!");
        }*/
    }

    @Override
    public void fechar() {
        if (!isAberto()) {
            System.out.println("O livro já está fechado");
            return;
        }

        System.out.println("Fechando o livro");
        setAberto(false);


       /* if (isAberto()) {
            System.out.println("Fechando o livro");
            setAberto(false);
        } else {
            System.out.println("O livro já está fechado");
        }*/
    }

    @Override
    public void folhear(int p) {
        if (!isAberto()) {
            System.out.println("O livro está fechado");
            return;
        }
        // Utilizamos o OPERADOR OU, para que qualquer das condições falhem, a página é inválida
        if (p < 1 || p > getTotPaginas()) {
            System.out.println("Página inválida!");
            return;
        }

        setPagAtual(p);
        System.out.println("Folheando para a página " + p);


        /*if (isAberto()) {
            if (p >= 1 && p <= getTotPaginas()) {
                setPagAtual(p);
            } else {
                System.out.println("Página inválida! O livro tem apenas " + getTotPaginas() + " páginas.");
            }
        } else {
            System.out.println("Não é possível folhear, o livro está fechado.");
        }*/
    }

    @Override
    public void voltarPag() {
        if (!isAberto()) {
            System.out.println("O livro está fechado");
            return;
        }
        if (getPagAtual() <= 1) {
            System.out.println("Não é possível voltar uma página");
            return;
        }

        setPagAtual(getPagAtual() - 1);

        /*if (isAberto()) {
            if (getPagAtual() > 1) {
                setPagAtual(getPagAtual() - 1);
            } else {
                System.out.println("Impossível voltar página.");
            }
        } else {
            System.out.println("O livro está fechado");
        }*/
    }
}
