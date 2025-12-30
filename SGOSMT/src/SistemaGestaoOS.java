import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoOS {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Chico Bento", "123.456.789-00", "88940028922");
        Tecnico t1 = new Tecnico("Neymar Jr", "Refrigeração");
        Equipamento e1 = new Equipamento("Ar Condicionado", "LG Dual Inverter", "AC12345");

        OrdemServico os1 = new OrdemServico(c1, t1, e1);
        os1.adicionarServico(new Servico("Troca de compressor", 350.0));
        os1.adicionarServico(new Servico("Carga de gás", 150.0));
        os1.atualizarStatus("Concluída");

        os1.registrar();
        c1.registrar();
        t1.registrar();

        Cliente c2 = new Cliente("Alanzoka", "123.555.666-00", "88889998974");
        Tecnico t2 = new Tecnico("Miguel Wilbert", "Reparação de Computadores");
        Equipamento e2 = new Equipamento("Chromebook", "Samsung", "Xe310xba");

        OrdemServico os2 = new OrdemServico(c2, t2, e2);
        os2.adicionarServico(new Servico("Troca de memória ram", 220.0));
        os2.adicionarServico(new Servico("Limpeza", 75.0));

        os2.registrar();
        c2.registrar();
        t2.registrar();

        List<OrdemServico> lista = new ArrayList<>();
        lista.add(os1);
        lista.add(os2);

        Relatorio.gerarRelatorioMensal(lista);
    }
}
