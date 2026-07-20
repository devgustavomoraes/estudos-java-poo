public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); Não pode ser instanciada, pois é uma Classe Abstrata
        Visitante v1 = new Visitante();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo('M');
        System.out.println(v1); //Chamada do toString

        Aluno a1 = new Aluno();

        a1.setNome("Claudio");
        a1.setMatricula(111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo('M');
        b1.pagarMensalidade();

        Professor p1 = new Professor();

        p1.setNome("Geraldo");
        p1.setEspecialidade("Odontologia");
        p1.setSexo('M');
        p1.setIdade(47);
        p1.setSalario(-7550.0f);
        p1.receberAumento(500.0f);
        System.out.println(p1);

        Tecnico t1 = new Tecnico();

        t1.setNome("Gustavo");
        t1.setIdade(24);
        t1.setSexo('M');
        t1.setRegistroProfissional("Analista de Sistemas");
        t1.praticar();
    }
}