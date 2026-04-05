package Praktikum_3.bagian_2.Latihan_2;

public class Motor {
    // Atribut diatur menjadi private (Enkapsulasi)
    private String merk;
    private int tahun;

    // Constructor
    public Motor(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Getter untuk merk (Mengambil nilai)
    public String getMerk() {
        return merk;
    }

    // Setter untuk merk (Mengubah nilai)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk tahun
    public void setTahun(int tahun) {
        // Keuntungan setter: kita bisa menambah validasi
        if (tahun > 1885) { // Tahun motor pertama diciptakan
            this.tahun = tahun;
        } else {
            System.out.println("Tahun tidak valid!");
        }
    }
}
