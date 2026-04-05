package Praktikum_3.bagian_5.antarmuka;

public interface Bergerak {
    void bergerak();

    default void berhenti(){
        System.out.println("berhenti bergerak.");
    }

    static void info(){
        System.out.println("ini adalah interface bergerak.");
    }
}
