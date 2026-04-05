package Praktikum_3.bagian_2.Latihan_2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Motor motorSaya = new Motor("Honda", 2020);

        // Mengakses data menggunakan Getter
        System.out.println("Merk Awal: " + motorSaya.getMerk());

        // Mengubah data menggunakan Setter
        motorSaya.setMerk("Yamaha");
        motorSaya.setTahun(2023);

        System.out.println("Merk Baru: " + motorSaya.getMerk());
        System.out.println("Tahun Baru: " + motorSaya.getTahun());
    }
}
