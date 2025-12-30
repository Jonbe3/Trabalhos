public abstract class Conta implements Transacao {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Transferência negada.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Conta nº " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: R$ " + saldo);
    }
}
