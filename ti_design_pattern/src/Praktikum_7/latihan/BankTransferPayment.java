package Praktikum_7.latihan;

public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount +
                " berhasil menggunakan Transfer Bank.");
    }
}
