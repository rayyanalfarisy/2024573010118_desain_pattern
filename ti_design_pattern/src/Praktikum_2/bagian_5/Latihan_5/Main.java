package Praktikum_2.bagian_5.Latihan_5;

public class Main {
    public static void main(String[] args) {
        // Membuat object menggunakan Default Constructor
        Barang barang1 = new Barang();

        // Membuat object menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop Gaming", 15000000);

        // Menampilkan hasil
        System.out.println("--- Info Barang 1 ---");
        barang1.tampilkanBarang();

        System.out.println("--- Info Barang 2 ---");
        barang2.tampilkanBarang();
    }
}
