import java.util.ArrayList;
import java.util.List;

public class EstoqueVacina implements Notificacao, Relatorio {

    private List<LoteVacina> lotes;

    public EstoqueVacina() {
        this.lotes = new ArrayList<>();
    }

    public void adicionarLote(LoteVacina lote) {
        lotes.add(lote);
    }

    public void removerVacina(LoteVacina lote) {
        lotes.remove(lote);

    }

    public int vericarQuantidade() {
        int total = 0;
        for (LoteVacina lote : lotes) {
            total += lote.getQuantidade();
        }
        return total;
    }

    public void listarVacinasDisponiveis() {
        for (LoteVacina lote : lotes) {
            System.out.println(lote.getVacina().getNome());
        }
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Notificaçao: Estoque de vacinas");
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório: Estoque de vacinas");
    }
}