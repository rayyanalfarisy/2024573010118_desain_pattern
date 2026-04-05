package Praktikum_3.bagian_3.Komposisi;

class Mobil {
    private final Mesin mesin; //komposisi

    public Mobil(){
        this.mesin = new Mesin(); //membuat objek Mesin
    }

    void mulai(){
        mesin.hidupkan();
        System.out.println("mobil siap digunakan.");
    }

    void berhenti(){
        mesin.matikan();
        System.out.println("Mobil berhenti");
    }
}
