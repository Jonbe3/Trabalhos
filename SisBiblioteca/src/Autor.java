import java.util.List;
import java.util.ArrayList;

public class Autor {

    private String nome;
    private List<Livro> livros;

    public Autor(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
        }
    }

    public void listarLivros() {
        System.out.println("Livros do autor " + nome + ": ");
        for (Livro livro : livros) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
