public class Tecnico implements Registravel{

    private String nome;
    private String especialidade;

    public Tecnico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome(){ return nome;}
    public String getEspecialidade(){ return especialidade;}

    @Override
    public void registrar() {
        System.out.println("Técnico " + nome + "registrado.");
    }

    @Override
    public String toString() {
        return "Técnico: " + nome + " | Especialidade: " + especialidade;
    }

}
