package praktikum_5.bagian_2.tanpa_ocp;

public class Main {
    public static void main(String[] args){
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Reguler costumer doscount: " +
                calculator.calculateDiscount("Reguler",100));
        System.out.println("Premium costomer discount :" +
                calculator.calculateDiscount("Premium", 100));
    }
}
