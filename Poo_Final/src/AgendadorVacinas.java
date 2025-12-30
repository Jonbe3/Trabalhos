import java.util.ArrayList;
import java.util.List;

public class AgendadorVacinas {
    private List<Agendamento> agendamentos;

    public AgendadorVacinas() {
        this.agendamentos = new ArrayList<>();
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }
}
