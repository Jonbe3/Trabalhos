public class Vacina {

    private String nome;
    private String fabricante;
    private int dosesNescessarias;

    public Vacina(String nome, String fabricante, int dosesNescessarias) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.dosesNescessarias = dosesNescessarias;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getFabricante() {return fabricante;}
    public void setFabricante(String fabricante) {this.fabricante = fabricante;}

    public int getDosesNescessarias() {return dosesNescessarias;}
    public void setDosesNescessarias(int dosesNescessarias) {this.dosesNescessarias = dosesNescessarias;}
}
