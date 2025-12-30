public class AlertaValidadeVacina implements Notificacao{

    @Override
    public void enviarNotificacao() {
        System.out.println("Alerta: Vacina próxima da data de validade!");
    }
}
