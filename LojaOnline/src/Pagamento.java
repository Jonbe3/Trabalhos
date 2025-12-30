public class Pagamento {

    private double valor;
    private String metodo;
    private Pedido pedido;
    private boolean pago;

    public Pagamento(String metodo, Pedido pedido) {
        this.metodo = metodo;
        this.pedido = pedido;
        this.valor = pedido.calcularTotal();
        this.pago = false;
    }

    public void processarPagamento(){
        if (!pago) {
            pago = true;
            System.out.println("Pagamento de R$ " + valor + "realizado via " + metodo);
        } else {
            System.out.println("Pagamento ja foi realizado.");
        }
    }

    public boolean isPago() {
        return pago;
    }
}
