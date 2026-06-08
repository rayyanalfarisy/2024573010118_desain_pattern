package Praktikum_7.latihan;

public class Checkout {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Metode pembayaran belum dipilih!");
            return;
        }

        paymentStrategy.pay(amount);
    }
}
