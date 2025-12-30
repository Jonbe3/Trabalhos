import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private Cliente cliente;
    private List<Produto> produtos;
    private Pagamento pagamento;

    public Pedido(int id) {
        this.id = id;
        this.produtos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void listarProdutos() {
        System.out.println("produtos do pedido ID " + id + ":");
        for (Produto p : produtos) {
            System.out.println("- " + p);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}
