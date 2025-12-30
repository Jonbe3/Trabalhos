public class Cliente implements Registravel{

    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome(){ return nome;}
    public String getCpf(){ return cpf;}
    public String getTelefone(){ return telefone;}

    public void setTelefeone(String telefone) {
        if (telefone == null && telefone.length() == 11) {
            this.telefone = telefone;
        } else{
            System.out.println("Telefone Invalido");
        }
    }

    @Override
    public void registrar() {
        System.out.println("Cliente registrado: " + nome);
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | CPF: " + cpf + " | TELEFONE: " + telefone;

    }

}
