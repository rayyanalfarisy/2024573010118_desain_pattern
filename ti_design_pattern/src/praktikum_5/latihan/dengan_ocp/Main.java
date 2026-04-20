package praktikum_5.latihan.dengan_ocp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Vehicle Type (Car/Motorcycle/Truck): ");
        String type = scanner.next();

        System.out.print("Enter vehicle price: ");
        double price = scanner.nextDouble();

        TaxStrategy strategy;

        if(type.equalsIgnoreCase("Car")){
            strategy = new CarTax();
        } else if(type.equalsIgnoreCase("Motorcycle")){
            strategy = new MotorcycleTax();
        } else if(type.equalsIgnoreCase("Truck")){
            strategy = new CarTax();
        } else {
            System.out.println("Unknown vehicle type!");
            return;
        }

        TaxCalculator calculator = new TaxCalculator();
        double tax = calculator.calculateTax(strategy, price);

        System.out.println("Calculated tax: " + tax);
    }
}
