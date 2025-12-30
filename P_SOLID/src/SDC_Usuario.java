public class SDC_Usuario {

    private Notificador notificador;

    SDC_Usuario(Usuario usuario, Notificador notificador) {
        this.notificador = notificador;
        notificador.enviarNotificacao(usuario);
        Not_Email.enviarNotificacao(usuario);

    }
}
