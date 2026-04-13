package Praktikum_4.bagian_2.dengan_srp;

public class UserService {
    public void sendWelcomeEmail(User user){
        System.out.println("/nMengirim email ke " + user.getEmail() + "...");
        System.out.println("Halo" + user.getName() + ",Selamat datang di sistem kami!/n");
    }
}
