package Praktikum_3.bagian_4.Latihan_1_Overriding;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi){
        this.sisi=sisi;
    }
    @Override
    public double hitungLuas(){
        return sisi * sisi;
    }
}
