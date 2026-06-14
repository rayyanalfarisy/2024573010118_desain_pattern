package Praktikum_6.latihan.dengan_lsp;

public class Main {

    public static void beginTrip(Vehicle vehicle, String destination) {
        vehicle.navigateTo(destination);
    }

    public static void beginMotorizedTrip(
            EnginePowered vehicle,
            Vehicle navigator,
            String destination) {

        vehicle.startEngine();
        navigator.navigateTo(destination);
    }

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println("Car Trip:");
        beginMotorizedTrip(car, car, "Central Park");

        System.out.println("\nBicycle Trip:");
        beginTrip(bicycle, "Central Park");
    }
}
