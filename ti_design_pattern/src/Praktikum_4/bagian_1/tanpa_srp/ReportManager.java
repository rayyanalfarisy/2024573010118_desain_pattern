package Praktikum_4.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
    private final String content;

    public ReportManager(String content){
        this.content = content;
    }

    // membuat laporan
    public String generateManager(){
        return "=== LAPORAN ===\n" + content + "\n==============";
    }

    // menyimpan laporan ke file (seharusnya tugas ke kelas lain)
    public void saveFiles(String filename){
        String folderPath = "src/Praktikum_4/tanpa_srp/";

        File file = new File(folderPath + filename);

        try (FileWriter writer = new FileWriter(file)){
            writer.write(generateManager());
            System.out.println("Laporan disimpan ke file: " + filename);
        } catch (IOException e){
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }

    // mencetak laporan ke console (seharusnya tugas ke kelas lain)
    public void printReport(){
        System.out.println("\nLaporan yang dicetak:\n" + generateManager());
    }
}