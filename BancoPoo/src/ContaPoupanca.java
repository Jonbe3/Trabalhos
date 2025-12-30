public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numero, Cliente cliente, double taxaJuros) {
        super(numero, cliente);
        this.taxaJuros = taxaJuros;
    }

    public double calcularRendimento() {
        return getSaldo() * taxaJuros;
    }
}
