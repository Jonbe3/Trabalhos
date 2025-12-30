import java.util.List;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private List<Autor> autores;
    private Biblioteca biblioteca;
    private boolean emprestado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAutor(Autor autor){
        autores.add(autor);
        autor.adicionarLivro(this);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

}
