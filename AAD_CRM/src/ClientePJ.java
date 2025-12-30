public class ClientePJ extends Cliente {
        private double faturamentoMensal;

        public ClientePJ(String nome, String email, int tempoRelacionamento, double pontuacaoBase, double faturamentoMensal) {
            super(nome, email, tempoRelacionamento, pontuacaoBase);
            this.faturamentoMensal = faturamentoMensal;
        }

        @Override
        public double calcularScoreFinal() {
            double score = pontBase;
            if (faturamentoMensal > 50000.0) {
                score = score * 1.15; // aumenta 15%
            }
            return score;
        }

        @Override
        public void exibirinfo(boolean detalhesCompletos, boolean incluirScoreFinal) {
            super.exibirinfo(detalhesCompletos, false);
            if (detalhesCompletos) {
                System.out.println("Faturamento mensal: R$ " + faturamentoMensal);
            }
            if (incluirScoreFinal) {
                System.out.printf("Score final: %.2f%n", calcularScoreFinal());
                System.out.println("Classificação: " + classificarCliente());
            }
        }
    }

