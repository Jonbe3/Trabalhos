import java.util.List;

public class Relatorio {

    public static void gerarRelatorioMensal(List<OrdemServico> ordens) {
        System.out.println("===== RELATÓRIO MENSAL =====");
        for (OrdemServico os: ordens) {
            System.out.println(os);
            System.out.println("----------------------------");
        }
    }
}
