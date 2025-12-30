import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        livro.setBiblioteca(this);
    }

    public void removerLivro(Livro livro){
        livros.remove(livro);
    }

    public void listarLivros(){
        System.out.println("Livros da Biblioteca " + nome + ":");
        for (Livro livro : livros){
            System.out.println("- " + livro.getTitulo());
        }
    }
    public Livro buscarLivroPorTitulo(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
