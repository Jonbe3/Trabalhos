public interface Not_Email implements Notificador{

    @Override
    public void ;enviarNotificacao(Usuario usuario) {
        System.out.println("Enviando notificação por Email para " + usuario.getEmail());
    }
}
