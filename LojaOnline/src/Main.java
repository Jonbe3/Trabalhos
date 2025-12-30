public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Mouse Gamer", 198.0);
        Produto p2 = new Produto("Teclado Mecânico", 264.0);
        Produto p3 = new Produto("Monitor 24\"", 900.0);

        // Criando cliente
        Cliente cliente = new Cliente("João");

        // Criando pedido
        Pedido pedido1 = new Pedido(1);
        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p3);

        // Associando pedido ao cliente
        cliente.adicionarPedido(pedido1);

        // Listando produtos do pedido
        pedido1.listarProdutos();

        // Criando e processando pagamento
        Pagamento pagamento = new Pagamento("Cartão de Crédito", pedido1);
        pedido1.setPagamento(pagamento);
        pagamento.processarPagamento();

        // Listando pedidos do cliente
        cliente.listarPedidos();
    }
}
