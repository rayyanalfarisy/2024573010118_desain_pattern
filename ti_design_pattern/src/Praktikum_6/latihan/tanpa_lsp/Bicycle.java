package Praktikum_6.latihan.tanpa_lsp;

import javax.naming.AuthenticationNotSupportedException;

public class Bicycle extends Vehicle {
    @Override
    public void startEngine(){
        throw new UnsupportedOperationException("Bicycles dont have engine");
    }

    @Override
    public void navigateTo(String destination){
        System.out.println("Calculateing BIKE route to" + destination);
    }
}
