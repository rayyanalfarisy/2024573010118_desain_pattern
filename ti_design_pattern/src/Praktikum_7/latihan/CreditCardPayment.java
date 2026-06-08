package Praktikum_7.latihan;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount +
                " berhasil menggunakan Kartu Kredit.");
    }
}
