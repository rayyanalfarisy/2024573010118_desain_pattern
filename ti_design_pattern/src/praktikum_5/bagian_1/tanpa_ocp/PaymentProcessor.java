package praktikum_5.bagian_1.tanpa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymentType,double amount){
        if(paymentType.equals("creditCard")){
            System.out.println("Processing Credit Card Payment of " + amount);
        } else if (paymentType.equals("Ewallet")) {
            System.out.println("Processing E-wallet payment of " + amount);
        }else {
            System.out.println("Invalid payment method");
        }
    }
}
