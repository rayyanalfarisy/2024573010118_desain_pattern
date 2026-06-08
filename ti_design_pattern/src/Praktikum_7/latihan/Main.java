package Praktikum_7.latihan;

public class Main {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        System.out.println("=== Pembayaran dengan Kartu Kredit ===");
        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.processPayment(500000);

        System.out.println("\n=== Pembayaran dengan E-Wallet ===");
        checkout.setPaymentStrategy(new EWalletPayment());
        checkout.processPayment(250000);

        System.out.println("\n=== Pembayaran dengan Transfer Bank ===");
        checkout.setPaymentStrategy(new BankTransferPayment());
        checkout.processPayment(750000);
    }
}
