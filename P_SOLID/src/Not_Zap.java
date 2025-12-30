public class Not_Zap implements Notificador{

    @Override
    public void enviarNotificacao(Usuario usuario) {
        System.out.println("Enviando notificação por WhatsApp para " + usuario.getNome());
    }
}
