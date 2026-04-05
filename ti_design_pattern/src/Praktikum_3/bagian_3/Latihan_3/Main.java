package Praktikum_3.bagian_3.Latihan_3;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Laptop yang secara otomatis membuat Processor dan RAM di dalamnya
        Laptop laptopSaya = new Laptop("Asus ROG", "Intel i9", 32);

        laptopSaya.nyalakan();
    }
}
