package Praktikum_7.bagian_1;

public class PublicTransportRoute implements RouteStrategy{
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("membuat rute transportasi umum dari " + from + "ke" + to);
    }
}
