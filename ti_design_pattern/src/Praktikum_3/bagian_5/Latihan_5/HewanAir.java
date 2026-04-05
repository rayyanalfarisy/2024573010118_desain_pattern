package Praktikum_3.bagian_5.Latihan_5;

public abstract class HewanAir {
    protected String nama;

    public HewanAir(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang wajib diimplementasikan oleh subclass
    public abstract void makan();
}
