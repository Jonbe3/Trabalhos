public class TecnicoEnfermagem extends ProfissionalSaude {

    public TecnicoEnfermagem(String nome, String registro) {
        super(nome, registro);
    }

    @Override
    public void aplicarVacina() {
        System.out.println("Vacina aplicada pelo técnico de enfermagem");
    }
}