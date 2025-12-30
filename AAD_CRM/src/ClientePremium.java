public class ClientePremium extends Cliente {
    private double valorContratos;

    public ClientePremium(String nome, String email, int tempoRelacionamento, double pontuacaoBase, double valorContratos) {
        super(nome, email, tempoRelacionamento, pontuacaoBase);
        this.valorContratos = valorContratos;
    }

    @Override
    public double calcularScoreFinal() {
        double score = pontBase;
        if (valorContratos > 100000.0) {
            score = score * 1.25; // aumenta 25%
        }
        return score;
    }

    @Override
    public void exibirinfo(boolean detalhesCompletos, boolean incluirScoreFinal) {
        super.exibirinfo(detalhesCompletos, false);
        if (detalhesCompletos) {
            System.out.println("Valor total de contratos: R$ " + valorContratos);
        }
        if (incluirScoreFinal) {
            System.out.printf("Score final: %.2f%n", calcularScoreFinal());
            System.out.println("Classificação: " + classificarCliente());
        }
    }
}