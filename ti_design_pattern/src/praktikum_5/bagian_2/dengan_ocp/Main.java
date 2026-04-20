package praktikum_5.bagian_2.dengan_ocp;

public class Main {
    public static void main(String[] args){
        DiscountCalculator calculator = new DiscountCalculator();

        Discount reguler = new RegulerDiscount();
        Discount premium = new PremiumDiscount();

        System.out.println("reguler Costumer Discount:" + calculator.calculateDiscount(reguler,100));
        System.out.println("Premium Costumer Discount:" + calculator.calculateDiscount(premium,100));
    }
}
