package Praktikum_3.bagian_3.Latihan_3;

public class RAM {
    private int kapasitas; // dalam GB

    public RAM(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void baca() {
        System.out.println("Membaca data dari RAM " + kapasitas + "GB...");
    }

    public void tulis() {
        System.out.println("Menulis data ke RAM...");
    }
}
