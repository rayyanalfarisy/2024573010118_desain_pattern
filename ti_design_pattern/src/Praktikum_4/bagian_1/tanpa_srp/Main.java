package Praktikum_4.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.println("masukkkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager =new ReportManager(reportText);
        String report = reportManager.generateManager();

        reportManager.saveFiles(reportFileName + ".txt");
        reportManager.printReport();
    }
}
