package Praktikum_3.bagian_3.Latihan_3;

public class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public void jalankan() {
        System.out.println("Processor " + model + " sedang memproses instruksi...");
    }
}
