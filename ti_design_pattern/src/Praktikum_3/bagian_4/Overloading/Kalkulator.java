package Praktikum_3.bagian_4.Overloading;

public class Kalkulator {
    //method overloading : penjumlahan dua bilangan bulat
    int tambah(int a,int b){
        return a + b;
    }
    //method overloading :penjumlahan tiga bilangan buat
    int tambah(int a,int b,int c){
        return a + b + c;
    }
    //method overloading:penjumlahan bilangan desimal
    double tambah(double a,double b){
        return a + b;
    }
}
