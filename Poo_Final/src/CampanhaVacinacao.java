import java.util.List;

public class CampanhaVacinacao implements Notificacao {

    private String nome;
    private String publicoAlvo;
    private String dataInicio;
    private String dataFim;
    private List<Vacina> vacinas;
    private List<UnidadedeSaude> unidades;

    public CampanhaVacinacao(String nome, String publicoAlvo, String dataInicio, String dataFim, List<Vacina> vacinas, List<UnidadedeSaude> unidades) {
        this.nome = nome;
        this.publicoAlvo = publicoAlvo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.vacinas = vacinas;
        this.unidades = unidades;

    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Campanha ativa: " + nome);
    }
}


