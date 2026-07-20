public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar() {
        if (getRegistroProfissional() == null || getRegistroProfissional().isEmpty()) {
            System.out.println("Erro: " + getNome() + " não pode praticar sem um registro profissional válido!");
            return;
        }

        System.out.println("O técnico " + getNome() + " está realizando uma atividade prática usando o registro: " + getRegistroProfissional());
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
