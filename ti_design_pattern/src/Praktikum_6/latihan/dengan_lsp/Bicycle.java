package Praktikum_6.latihan.dengan_lsp;

public class Bicycle implements Vehicle {

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating bicycle route to " + destination);
        System.out.println("Cycling to " + destination);
    }
}
