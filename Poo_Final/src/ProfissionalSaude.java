public abstract class ProfissionalSaude {

    protected String nome;
    protected String registroProfissional;

    public ProfissionalSaude(String nome, String endereco) {
        this.nome = nome;
        this.registroProfissional = endereco;
    }

    public abstract void aplicarVacina();

    public String getNome() {return nome;}
}
