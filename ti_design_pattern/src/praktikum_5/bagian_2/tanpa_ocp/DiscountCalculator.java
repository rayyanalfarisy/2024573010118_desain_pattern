package praktikum_5.bagian_2.tanpa_ocp;

public class DiscountCalculator {
    public double calculateDiscount(String costumerType,double price){
        if (costumerType.equals("Reguler")){
            return price * 0.1;
        } else if (costumerType.equals("Premium")) {
            return price * 0.2;
        }else {
            return 0;
        }
    }
}
