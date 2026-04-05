package Praktikum_3.bagian_5.absrak;

public class Main {
    public static void main(String[] args){
        Hewan Kucing = new Kucing();
        Kucing.makan();
        Kucing.bersuara();

        Hewan anjing =  new Anjing();
        anjing.makan();
        anjing.bersuara();
    }
}
