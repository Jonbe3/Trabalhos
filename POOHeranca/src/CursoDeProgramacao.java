public class CursoDeProgramacao extends Curso {
    private String linguagem;

    public CursoDeProgramacao(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String linguagem) {
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        this.linguagem = linguagem;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Linguagem: " + linguagem);
    }

    @Override
    public double calcularCusto() {
        double custo = super.calcularCusto();

        if (cargaHoraria > 50) {
            custo = custo * 0.9; // desconto de 10%
        }

        return custo;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("===== RELATÓRIO - CURSO DE PROGRAMAÇÃO =====");
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Custo Total: R$ " + calcularCusto());
    }
}
