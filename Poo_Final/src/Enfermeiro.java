public class Enfermeiro extends ProfissionalSaude {

    public Enfermeiro(String nome, String registro) {
        super(nome, registro);
    }

    @Override
    public void aplicarVacina() {
        System.out.println("Vacina aplicada pelo enfermeiro");
    }
}