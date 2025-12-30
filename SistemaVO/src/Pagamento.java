public class Pagamento {
    private int id;
    private double valor;
    private String metodo;

    public Pagamento(int id, double valor, String metodo) {
        this.id = id;
        this.valor = valor;
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Pagamento #" + id + " - Valor: R$ " + valor + " - Método: " + metodo;
    }
}
