import java.util.ArrayList;
import java.util.List;

public class SistemaSCVS {

    private List<Cidadao> cidadaos;
    private List<Vacina> vacinas;
    private List<ProfissionalSaude> profissionais;
    private List<UnidadedeSaude> unidades;
    private List<AplicacaoVacina> aplicacoes;

    public SistemaSCVS() {
        this.cidadaos = new ArrayList<>();
        this.vacinas = new ArrayList<>();
        this.profissionais = new ArrayList<>();
        this.unidades = new ArrayList<>();
        this.aplicacoes = new ArrayList<>();
    }

    public void cadastrarCidadao(Cidadao cidadao) {
        cidadaos.add(cidadao);
    }

    public void cadastrarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    public void cadastrarProfissional(ProfissionalSaude profissional) {
        profissionais.add(profissional);
    }

    public void cadastrarUnidade(UnidadedeSaude unidade) {
        unidades.add(unidade);
    }

    public void registrarAplicacao(AplicacaoVacina aplicacao) {
        aplicacoes.add(aplicacao);
    }


}
