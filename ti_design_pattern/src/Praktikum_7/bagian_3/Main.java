package Praktikum_7.bagian_3;

public class Main {
    public static void main(String[] args){
        NotificationService notif = new NotificationService();

        notif.setStrategy(new EmailNotification());
        notif.notifyUser("Selamat, akun anda berhasil dibuat!");

        notif.setStrategy(new SMSNotification());
        notif.notifyUser("Kode OTP anda: 123456");

        notif.setStrategy(new PushNotification());
        notif.notifyUser("Ada Promo baru menanti anda!");
    }
}
