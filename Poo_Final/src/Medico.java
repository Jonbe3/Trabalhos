public class Medico extends ProfissionalSaude {

    public Medico(String nome, String registro) {
        super(nome, registro);
    }

    @Override
    public void aplicarVacina() {
        System.out.println("Vacina aplicada pelo médico");
    }
}