public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo('M');
        p2.setSexo('F');
        p2.setIdade(18);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p1.receberAum(550.20f); Não é possível, porque p1 é Pessoa e não tem o metodo 'receberAum'
        //p2.mudarTrabalho(); // Não é possivel, porque p2 é Aluno e não tem o metodo 'mudarTrabalho'
        //p4.cancelarMat(); // Não é possível, porque p4 é Funcionario e não tem o metodo 'cancelarMat'

        //System.out.println(p1.toString()); Redundância, de qualquer forma ele chama o metodo toString()
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}