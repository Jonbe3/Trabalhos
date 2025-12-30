import java.util.List;
import java.util.ArrayList;

public class Leitor {

    private String nome;
    private List<Livro> livrosEmprestados;

    public Leitor(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void emprestarLivro(Livro livro) {
        if (!livro.isEmprestado()) {
            livrosEmprestados.add(livro);
            livro.setEmprestado(true);
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" já está emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.setEmprestado(false);
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println(nome + " não possiu o livro \"" + livro.getTitulo() + "\"");
        }
    }
    public void listarLivrosEmprestados() {
        System.out.println("livros emprestados por " + nome + ": ");
        for (Livro livro : livrosEmprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
