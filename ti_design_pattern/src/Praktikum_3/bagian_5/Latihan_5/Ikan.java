package Praktikum_3.bagian_5.Latihan_5;

public class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        super(nama);
    }

    // Mengimplementasikan method dari abstract class HewanAir
    @Override
    public void makan() {
        System.out.println(nama + " sedang makan pelet atau plankton.");
    }

    // Mengimplementasikan method dari interface Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan cara menggerakkan siripnya.");
    }
}
