import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
}
