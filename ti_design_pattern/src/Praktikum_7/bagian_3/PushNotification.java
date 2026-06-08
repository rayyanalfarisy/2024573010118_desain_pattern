package Praktikum_7.bagian_3;

public class PushNotification implements NotificationStrategy{
    @Override
    public void send(String message) {
        System.out.println("Mengirim notifikasi push:" + message);
    }
}
