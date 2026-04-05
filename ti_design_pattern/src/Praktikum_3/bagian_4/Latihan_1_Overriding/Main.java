package Praktikum_3.bagian_4.Latihan_1_Overriding;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subclass
        BangunDatar persegi = new Persegi(2);
        BangunDatar lingkaran = new Lingkaran(2);

        // Memanggil method yang telah di-override
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.format("Luas Lingkaran: %.2f\n", lingkaran.hitungLuas());
    }
}
