import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setCliente(this);
    }

    public void listarPedidos() {
        System.out.println("Pedidos do Cliente " + nome + ":");
        for (Pedido pedido : pedidos) {
        System.out.println("- Pedido ID: " + pedido.getId());}
    }
}
