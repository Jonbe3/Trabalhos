public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saque negado (excedeu limite).");
        }
    }
}
