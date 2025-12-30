public class AplicacaoVacina {

    private String dataAplicacao;
    private String dose;
    private Cidadao cidadao;
    private LoteVacina lote;
    ProfissionalSaude profissional;
    private UnidadedeSaude unidade;
    private Vacina vacina;

    public AplicacaoVacina(String dataAplicacao, String dose, Cidadao cidadao, LoteVacina lote, ProfissionalSaude profissional, UnidadedeSaude unidade, Vacina vacina) {
        this.dataAplicacao = dataAplicacao;
        this.dose = dose;
        this.cidadao = cidadao;
        this.lote = lote;
        this.profissional = profissional;
        this.unidade = unidade;
        this.vacina = vacina;
    }

    public String getDataAplicacao() {return dataAplicacao;}
    public String getDose() {return dose;}
    public Cidadao getCidadao() {return cidadao;}
    public Vacina getVacina() {return vacina;}
}
