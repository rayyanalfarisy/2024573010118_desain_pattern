package Praktikum_4.bagian_2.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pengguna: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan email pengguna: ");
        String email = scanner.nextLine();

        User user = new User(name, email);
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService();

        userRepository.save(user);
        userService.sendWelcomeEmail(user);

        scanner.close();
    }
}