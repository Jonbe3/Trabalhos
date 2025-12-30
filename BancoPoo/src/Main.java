public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        // Cliente 1
        Cliente c1 = new Cliente("João");
        ContaCorrente cc1 = new ContaCorrente(101, c1, 500);
        c1.addConta(cc1);
        banco.addCliente(c1);

        // Cliente 2
        Cliente c2 = new Cliente("Maria");
        ContaPoupanca cp1 = new ContaPoupanca(202, c2, 0.05);
        c2.addConta(cp1);
        banco.addCliente(c2);

        // Operações
        cc1.depositar(1000);
        cc1.sacar(300);
        cc1.transferir(cp1, 200);

        cp1.depositar(500);
        double rendimento = cp1.calcularRendimento();

        // Mostrar resultados
        banco.listarClientes();

        System.out.println("Rendimento da conta poupança da Maria: R$ " + rendimento);
    }
}
