public class Agendamento {

    private String dataAgendada;
    private String horario;
    private Cidadao cidadao;
    private Vacina vacina;
    private UnidadedeSaude unidade;
    private String status;

    public Agendamento(String dataAgendada, String horario, Cidadao cidadao, Vacina vacina, UnidadedeSaude unidade, String status) {
        this.dataAgendada = dataAgendada;
        this.horario = horario;
        this.cidadao = cidadao;
        this.vacina = vacina;
        this.unidade = unidade;
        this.status = status;
    }

    public String getDataAgendada() {return dataAgendada;}
    public String getHorario() {return horario;}
    public String getStatus() {return status;}

    public void confimar() {
        this.status = "Confirmado";
    }

    public void cancelar() {
        this.status = "Cancelado";
    }


}
