import java.util.ArrayList;
import java.util.List;

public class OrdemServico implements Registravel{
    private static int contador = 1;

    private int numero;
    private Cliente cliente;
    private Tecnico tecnico;
    private Equipamento equipamento;
    private List<Servico> servicos;
    private String status;

    public OrdemServico(Cliente cliente, Tecnico tecnico, Equipamento equipamento) {
        this.numero = contador++;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.equipamento = equipamento;
        this.servicos = new ArrayList<>();
        this.status = "Aberta";
    }

    public void adicionarServico(Servico s) {
        servicos.add(s);
    }

    public double calcularCustoTotal() {
        double total = 0;
        for (Servico s : servicos) {
            total += s.getCusto();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    @Override
    public void registrar() {
        System.out.println("Ordem de serviço #" + numero + "registrada no sitema.");
    }

    @Override
    public String toString() {
        return "\nOS #" + numero +
                "\nCliente: " + cliente +
                "\nTécnico: " + tecnico +
                "\nEquipamento: " + equipamento +
                "\nStatus: " + status +
                "\nServiços: " + servicos +
                "\nTotal: R$ " + calcularCustoTotal();
    }
}
