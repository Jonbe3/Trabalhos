public class LoteVacina {

    private String codigoLote;
    private String validade;
    private int quantidade;
    private Vacina vacina;

    public LoteVacina(String codigoLote, String validade, int quantidade, Vacina vacina) {
        this.codigoLote = codigoLote;
        this.validade = validade;
        this.quantidade = quantidade;
        this.vacina = vacina;
    }

    public String getCodigoLote() {return codigoLote;}
    public String getValidade() {return validade;}
    public int getQuantidade() {return quantidade;}
    public Vacina getVacina() {return vacina;}
}
