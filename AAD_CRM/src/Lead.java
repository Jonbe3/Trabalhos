public class Lead extends Cliente{

    private int interacoes;

    public Lead(String nome, String email, int tempRel, double pontBase, int interacoes) {
        super(nome, email, tempRel, pontBase);
        this.interacoes = interacoes;
    }

    @Override
    public double calcularScoreFinal() {
        double score = pontBase;
        if (interacoes < 3){
            score = score *0.80; // pra reduzir os 20%
        }
        return score;
    }

    @Override
    public void exibirinfo(boolean detalhesCompletos, boolean incluirScoreFinal) {
        super.exibirinfo(detalhesCompletos, false);
        if (detalhesCompletos) {
            System.out.println("Interacoes com a empresa: " + interacoes);
        }
        if (incluirScoreFinal) {
            System.out.println("Score Final: %.2f%n" + calcularScoreFinal());
            System.out.println("Classificação: " + classificarCliente());
        }
    }
}
