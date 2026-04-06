package Praktikum_2.bagian_4.Latihan_4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Menggunakan setter untuk mengisi nilai atribut
        mhs.setNama("Budi Santoso");
        mhs.setNim("12345678");

        // Menampilkan hasil menggunakan getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM : " + mhs.getNim());
    }
}