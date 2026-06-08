package Praktikum_7.latihan;

public class EWalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount +
                " berhasil menggunakan E-Wallet.");
    }
}
