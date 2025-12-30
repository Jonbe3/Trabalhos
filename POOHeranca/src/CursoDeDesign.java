public class CursoDeDesign extends Curso {
    private String ferramenta;

    public CursoDeDesign(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String ferramenta) {
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        this.ferramenta = ferramenta;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ferramenta Principal: " + ferramenta);
    }

    @Override
    public double calcularCusto() {
        double custo = super.calcularCusto();

        if (cargaHoraria < 20) {
            custo = custo * 1.05; // acréscimo de 5%
        }

        return custo;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("===== RELATÓRIO - CURSO DE DESIGN =====");
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Ferramenta: " + ferramenta);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Custo Total: R$ " + calcularCusto());
    }
}
