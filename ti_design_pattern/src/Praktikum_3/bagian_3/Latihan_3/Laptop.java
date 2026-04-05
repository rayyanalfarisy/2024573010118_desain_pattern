package Praktikum_3.bagian_3.Latihan_3;

public class Laptop {
    private String merk;
    // Laptop "memiliki" Processor dan RAM
    private Processor processor;
    private RAM ram;

    public Laptop(String merk, String modelProc, int kapasitasRam) {
        this.merk = merk;
        // Objek komponen dibuat di dalam constructor Laptop
        this.processor = new Processor(modelProc);
        this.ram = new RAM(kapasitasRam);
    }

    public void nyalakan() {
        System.out.println("Menyalakan Laptop " + merk + "...");
        ram.baca();
        processor.jalankan();
        System.out.println("Laptop siap digunakan.");
    }
}
