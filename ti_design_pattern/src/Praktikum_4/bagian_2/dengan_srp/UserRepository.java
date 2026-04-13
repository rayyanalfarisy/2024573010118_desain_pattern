package Praktikum_4.bagian_2.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserRepository {
    private static final String FOLDER_PATH = "src/Praktikum_4/bagian_2/dengan_srp//";
    private static final String DATABASE_FILE = "user.txt";

    public void save(User user){

        File file = new File(FOLDER_PATH + DATABASE_FILE);

        try (FileWriter writer = new FileWriter(file,true)){
            writer.write(user.getName() + " _ " + user.getEmail() + "/n");
            System.out.println("pengguna berhasil disimpan: " + user.getName());
        } catch (IOException e) {
            System.out.println("gagal menyimpan pengguna: " + e.getLocalizedMessage() );
        }
    }
}
