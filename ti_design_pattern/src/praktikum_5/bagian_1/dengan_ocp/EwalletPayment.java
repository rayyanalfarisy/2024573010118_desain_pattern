package praktikum_5.bagian_1.dengan_ocp;

public class EwalletPayment implements PaymentMethod{
    public void process(double amount){
        System.out.println("Prosessing E-Wallet Payment of " + amount);
    }
}
