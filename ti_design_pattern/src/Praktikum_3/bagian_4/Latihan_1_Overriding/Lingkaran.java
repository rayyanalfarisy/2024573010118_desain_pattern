package Praktikum_3.bagian_4.Latihan_1_Overriding;

public class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari=jariJari;
    }
    @Override
    public double hitungLuas(){
        return Math.PI*jariJari*jariJari;
    }
}
