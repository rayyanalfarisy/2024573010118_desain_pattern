package Praktikum_3.bagian_4.Overloading;

public class Main {
    public static  void main (String[] args){
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("hasil 1 :" + kalkulator.tambah(5, 10));
        System.out.println("hasil 2 :" + kalkulator.tambah(5, 10, 15));
        System.out.println("hasil 3 :" + kalkulator.tambah(3.5, 2.5));
    }
}
