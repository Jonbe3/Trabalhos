public class Not_Fake implements Notificador{

    @Override
    public void enviarNotificacao(Usuario usuario) {
        System.out.println("Enviando notificação Fake para " + usuario.getNome());
    }
}
