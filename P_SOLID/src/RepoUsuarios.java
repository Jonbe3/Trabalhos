public class RepoUsuarios {
    Usuario usuario;


    public void salvarUsuario() {
        System.out.println("Usuário " + usuario.getNome() + " salvo no repositório.");
    }
    public RepoUsuarios(Usuario usuario) {
        this.usuario = usuario;

    }
}
