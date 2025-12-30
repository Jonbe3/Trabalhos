public abstract class UnidadedeSaude {

    protected String nome;
    protected String endereco;

    public UnidadedeSaude( String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}
}
