package Praktikum_2.bagian_5.Latihan_5;

public class Barang {
    private String namaBarang;
    private double harga;

    // Default Constructor (Tanpa parameter)
    public Barang() {
        this.namaBarang = "Belum diisi";
        this.harga = 0.0;
    }

    // Parameterized Constructor (Dengan parameter)
    public Barang(String nama, double harga) {
        this.namaBarang = nama;
        this.harga = harga;
    }

    // Method untuk menampilkan info barang
    public void tampilkanBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga      : Rp" + harga);
        System.out.println("-------------------------");
    }
}
