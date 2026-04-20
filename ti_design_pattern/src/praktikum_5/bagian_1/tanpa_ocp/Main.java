package praktikum_5.bagian_1.tanpa_ocp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Payment type (CreditCard/Ewallet):");
        String type = scanner.next();
        System.out.println("enter amount : ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(type,amount);
    }
}
