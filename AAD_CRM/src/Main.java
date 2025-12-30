import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new ClientePF("Ana Silva", "ana@outloky.com", 24, 60.0, 65));
        clientes.add(new ClientePJ("Empresa X", "contato@Xmusky.com", 48, 70.0, 120000.0));
        clientes.add(new Lead("Carlos Lead", "carlos@leaderX.com", 2, 40.0,2));
        clientes.add(new ClientePremium("Premium Ltda", "vip@premiertiger.com", 60, 85.0, 150000));

        for (Cliente c : clientes) {
            System.out.println("========================================");
            System.out.println("Chamando exibirInformacoes() - sem parâmetros:");
            c.exibirinfo();

            System.out.println("\nChamando exibirInformacoes(true) - detalhes completos:");
            c.exibirinfo(true);

            System.out.println("\nChamando exibirInformacoes(true, true) - detalhes + score final:");
            c.exibirinfo(true, true);

            System.out.println();
        }

        System.out.println("Resumo de scores (polimórfico):");
        for (Cliente c : clientes) {
            System.out.printf("%s -> Score final: %.2f, Classificação: %s%n",
                    c.nome, c.calcularScoreFinal(), c.classificarCliente());

        }
    }
}