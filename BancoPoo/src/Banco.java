import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void listarClientes() {
        for (Cliente c : clientes) {
            System.out.println("Cliente: " + c.getNome());
            for (Conta conta : c.getContas()) {
                conta.mostrarInfo();
                System.out.println("---------------------");
            }
        }
    }
}
