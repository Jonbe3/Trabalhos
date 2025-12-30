public class Main {
    public static void main(String[] args) {
        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Criando autores
        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Clarice Lispector");

        // Criando livros
        Livro livro1 = new Livro("Dom Casmurro");
        livro1.adicionarAutor(autor1);

        Livro livro2 = new Livro("A Hora da Estrela");
        livro2.adicionarAutor(autor2);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();

        // Criando leitor
        Leitor leitor = new Leitor("Maria");

        // Emprestando e devolvendo livros
        leitor.emprestarLivro(livro1);
        leitor.emprestarLivro(livro2);
        leitor.listarLivrosEmprestados();

        leitor.devolverLivro(livro1);
        leitor.listarLivrosEmprestados();
    }
}