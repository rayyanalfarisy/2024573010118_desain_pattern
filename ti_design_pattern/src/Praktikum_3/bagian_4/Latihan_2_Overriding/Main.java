package Praktikum_3.bagian_4.Latihan_2_Overriding;

public class Main {
    public static void main(String[] args) {
        Matematika math = new Matematika();

        // Memanggil method dengan 2 int
        System.out.println("Hasil 5 + 10 = " + math.tambah(5, 10));

        // Memanggil method dengan 3 int
        System.out.println("Hasil 5 + 10 + 15 = " + math.tambah(5, 10, 15));

        // Memanggil method dengan 2 double
        System.out.println("Hasil 5.5 + 4.5 = " + math.tambah(5.5, 4.5));
    }
}
