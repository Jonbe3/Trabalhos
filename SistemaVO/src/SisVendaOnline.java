public class SisVendaOnline {
    public static void main(String[] args) {
        // Criando cliente
        Cliente cliente1 = new Cliente(1, "João");

        // Criando produtos
        Produto p1 = new Produto(1, "Mouse Gamer", 150.0);
        Produto p2 = new Produto(2, "Teclado Mecânico", 300.0);
        Produto p3 = new Produto(3, "Headset", 200.0);

        // Criando pedido e adicionando produtos
        Pedido pedido1 = new Pedido(1, cliente1);
        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);
        pedido1.adicionarProduto(p3);

        // Criando pagamento e associando ao pedido
        Pagamento pagamento1 = new Pagamento(1, pedido1.calcularTotal(), "Cartão de Crédito");
        pedido1.setPagamento(pagamento1);

        // Exibindo resultados
        System.out.println(pedido1);
        System.out.println("Produtos do pedido:");
        for (Produto p : pedido1.getProdutos()) {
            System.out.println("- " + p);
        }
        System.out.println(pedido1.getPagamento());
    }
}
