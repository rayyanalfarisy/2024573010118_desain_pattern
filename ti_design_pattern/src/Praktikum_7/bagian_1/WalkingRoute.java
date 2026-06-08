package Praktikum_7.bagian_1;

public class WalkingRoute implements RouteStrategy {
    public void buildRoute(String from, String to){
        System.out.println("Membuat rute jalan kaki " + from + "ke" + to);
    }
}
