public class Curso {
    protected String titulo;
    protected String instrutor;
    protected int cargaHoraria;
    protected double precoPorHora;

    public Curso(String titulo, String instrutor, int cargaHoraria, double precoPorHora) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
        this.precoPorHora = precoPorHora;
    }

    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Preço por Hora: " + precoPorHora);
    }

    public double calcularCusto() {
        return cargaHoraria * precoPorHora;
    }

    public void gerarRelatorio() {
        System.out.println("===== RELATÓRIO =====");
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Custo Total: R$ " + calcularCusto());
    }
}
