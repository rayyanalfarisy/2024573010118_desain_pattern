package Praktikum_3.bagian_5.absrak;

abstract class Hewan {
    String nama;

    void makan(){
        System.out.println(nama + "sedang makan.");
    }

    abstract void bersuara();
}
