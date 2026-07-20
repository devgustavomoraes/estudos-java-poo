public class Professor extends Pessoa {
    private String especialidade;
    private Float salario;

    public void receberAumento(float aumento) { // Dica: Pesquisar sobre BigDecimal (muito utilizado para finanças)
        if (getEspecialidade() == null || getEspecialidade().isEmpty()) {
            System.out.println("Erro: " + getNome() + " não possui uma especialidade para receber aumento!");
            return;
        }

        if (getSalario() <= 0) {
            System.out.println("Salário inválido!");
            return;
        }

        if (aumento <= 0) {
            System.out.println("Valor de aumento inválido");
            return;
        }

        setSalario(getSalario() + aumento); // Só vai aumentar se todas as condições acimas forem aprovadas
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) { // Alteramos sua lógica, para que valor inseriod seja inválido, ele define como 0
        if (salario < 0) {
            System.out.println("Erro: Tentativa de atribuir salário negativo!");
            this.salario = 0.0f;
            return;
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
