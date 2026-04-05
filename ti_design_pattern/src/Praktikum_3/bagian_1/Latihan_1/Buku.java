package Praktikum_3.bagian_1.Latihan_1;

public class Buku {
    // Atribut
    String judul;
    String penulis;
    int tahunTerbit;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("---------------------------");
    }
}
