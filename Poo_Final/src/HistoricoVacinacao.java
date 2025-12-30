import java.util.ArrayList;
import java.util.List;

public class HistoricoVacinacao {

    private Cidadao cidadao;
    private List<AplicacaoVacina> aplicacoes;

    public HistoricoVacinacao(Cidadao cidadao) {
        this.cidadao = cidadao;
        this.aplicacoes = new ArrayList<>();
    }

    public void adicionarAplicacao(AplicacaoVacina aplicacao) {
        aplicacoes.add(aplicacao);
    }

    public List<AplicacaoVacina> getAplicacoes() {
        return aplicacoes;
    }

}
