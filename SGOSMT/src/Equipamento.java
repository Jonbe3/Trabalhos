public class Equipamento {
    private String tipo;
    private String modelo;
    private String numeroSerie;

    public Equipamento(String tipo, String modelo, String numeroSerie) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { return tipo;}
    public String getModelo() { return modelo;}
    public String getNumeroSerie() { return numeroSerie;}

    @Override
    public String toString() {
        return "Equipamento: " + tipo + " | Modelo: " + modelo + " | Nº Série: " + numeroSerie;
    }

}
