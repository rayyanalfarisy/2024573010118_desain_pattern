package praktikum_5.latihan.dengan_ocp;

public class CarTax implements TaxStrategy{
    @Override
    public double calculateTax(double price){
        return price * 0.1;
    }
}
