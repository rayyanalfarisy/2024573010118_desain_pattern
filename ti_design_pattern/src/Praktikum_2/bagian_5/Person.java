package Praktikum_2.bagian_5;

public class Person {
    private String nama;
    private int umur;

    //default constuctor
    public Person(){
        nama = "unknow";
        umur = 0;
    }

    //parameter constuctor
    public Person(String nama,int umur){
        this.nama =  nama;
        this.umur = umur;
    }

    //method
    public void tampilkanInfo(){
        System.out.println("nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
