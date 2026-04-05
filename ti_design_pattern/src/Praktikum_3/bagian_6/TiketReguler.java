package Praktikum_3.bagian_6;

class TiketReguler extends Tiket{
    public TiketReguler(){
        super("Reguler",1000000);
    }
    @Override
    public double hitungDiskon(){
        return 0;
    }
}
