public abstract class Cliente {

    protected String nome;
    protected String email;
    protected int tempRel;
    protected double pontBase;

    public Cliente(String nome, String email, int tempRel, double pontBase) {
        this.nome = nome;
        this.email = email;
        this.tempRel = tempRel;
    }
    public abstract double calcularScoreFinal();

    public void exibirinfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    public void exibirinfo(boolean detalhesCompletos) {
        exibirinfo();
        if (detalhesCompletos) {
            System.out.println("Tempo de Relacionamento (meses): " + tempRel);
            System.out.println("Pontuação Base: " + pontBase);
        }
    }

    public void exibirinfo(boolean detalhesCompletos, boolean incluirScoreFinal) {
        exibirinfo(detalhesCompletos);
        if (incluirScoreFinal) {
            System.out.println("Score Final: %.2f%n" + calcularScoreFinal());
        }

    }

    public String classificarCliente() {
        double score = calcularScoreFinal();

        if (score < 50.0) return "Baixo Valor";
        if (score <= 80.0) return "Médio Valor";
        return "Alto valor";
    }
}
