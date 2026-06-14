package Praktikum_6.latihan.dengan_lsp;

public class Car implements Vehicle, EnginePowered {

    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating car route to " + destination);
        System.out.println("Driving to " + destination);
    }
}
