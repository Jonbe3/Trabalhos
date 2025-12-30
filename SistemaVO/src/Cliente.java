import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
