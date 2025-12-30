public class Not_SMS implements Notificador{

    @Override
    public void enviarNotificacao(Usuario usuario) {
        System.out.println("Enviando notificação por SMS para " + usuario.getTelefone());
    }
}
