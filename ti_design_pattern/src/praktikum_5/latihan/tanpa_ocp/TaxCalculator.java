package praktikum_5.latihan.tanpa_ocp;

public class TaxCalculator {
    public double calculateTax(String vehicleType,double price){
        if(vehicleType.equals("Car")){
            return price * 0.1; //pajak 10% untuk mobil
        } else if (vehicleType.equals("Motorcyle")) {
            return price * 0.5; //pajak 5% untuk motor

        }else {
            return 0;
        }
    }
}
