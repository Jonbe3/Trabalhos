public class ClientePF extends Cliente {
    private int idade;

    public ClientePF(String nome, String email, int tempRel, double pontBase, int idade) {
        super(nome, email, tempRel, pontBase);
        this.idade = idade;
    }


    @Override
    public double calcularScoreFinal() {
        double score = pontBase;
        if (idade > 60) {
            score = score * 1.10; // aumenta 10%
        }
        return score;
    }

    @Override
    public void exibirinfo(boolean detalhesCompletos, boolean incluirScoreFinal) {
        super.exibirinfo(detalhesCompletos, false);
        if (detalhesCompletos) {
            System.out.println("Idade: " + idade);
        }
        if (incluirScoreFinal) {
            System.out.printf("Score final: %.2f%n", calcularScoreFinal());
            System.out.println("Classificação: " + classificarCliente());
        }

    }
}