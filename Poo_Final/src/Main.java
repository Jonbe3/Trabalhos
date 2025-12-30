import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ===== Sistema =====
        SistemaSCVS sistema = new SistemaSCVS();

        // ===== Cidadão =====
        Cidadao cidadao = new Cidadao(
                "João Silva",
                "123.456.789-00",
                "10/02/1990",
                "Rua A, 123"
        );
        sistema.cadastrarCidadao(cidadao);

        // ===== Vacina =====
        Vacina vacina = new Vacina(
                "Hepatite B",
                "Butantan",
                3
        );
        sistema.cadastrarVacina(vacina);

        // ===== Lote =====
        LoteVacina lote = new LoteVacina(
                "L2025-01",
                "05/2026",
                100,
                vacina
        );

        // ===== Unidade de Saúde =====
        UnidadedeSaude ubs = new UBS(
                "UBS São José",
                "Av. Central, 200"
        );
        sistema.cadastrarUnidade(ubs);

        // ===== Profissional =====
        ProfissionalSaude enfermeiro = new Enfermeiro(
                "Carla Mendes",
                "COREN-55821"
        );
        sistema.cadastrarProfissional(enfermeiro);

        // ===== Estoque =====
        EstoqueVacina estoque = new EstoqueVacina();
        estoque.adicionarLote(lote);

        // ===== Agendamento =====
        Agendamento agendamento = new Agendamento(
                "16/12/2025",
                "10:30",
                cidadao,
                vacina,
                ubs,
                "Pendente"
        );

        AgendadorVacinas agendador = new AgendadorVacinas();
        agendador.adicionarAgendamento(agendamento);

        agendamento.confimar();

        // ===== Aplicação da Vacina =====
        AplicacaoVacina aplicacao = new AplicacaoVacina(
                "16/12/2025",
                "1ª dose",
                cidadao,
                lote,
                enfermeiro,
                ubs,
                vacina
        );
        sistema.registrarAplicacao(aplicacao);

        // ===== Histórico Vacinal =====
        HistoricoVacinacao historico = new HistoricoVacinacao(cidadao);
        historico.adicionarAplicacao(aplicacao);

        // ===== Campanha =====
        List<Vacina> vacinasCampanha = new ArrayList<>();
        vacinasCampanha.add(vacina);

        List<UnidadedeSaude> unidadesCampanha = new ArrayList<>();
        unidadesCampanha.add(ubs);

        CampanhaVacinacao campanha = new CampanhaVacinacao(
                "Campanha Nacional Hepatite B",
                "Adultos",
                "01/12/2025",
                "31/12/2025",
                vacinasCampanha,
                unidadesCampanha
        );

        // ===== Relatórios e Notificações =====
        estoque.gerarRelatorio();
        estoque.enviarNotificacao();

        RelaVasApli relatorio = new RelaVasApli();
        relatorio.gerarRelatorio();

        AlertaValidadeVacina alerta = new AlertaValidadeVacina();
        alerta.enviarNotificacao();

        // ===== Polimorfismo =====
        enfermeiro.aplicarVacina();

        System.out.println("Sistema SCVS executado com sucesso!");
    }
}
