package Praktikum_4.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.println("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        Praktikum_4.dengan_srp.ReportGenerator report = new Praktikum_4.dengan_srp.ReportGenerator(reportText);
        String reportContent = report.generateReport();

        Praktikum_4.dengan_srp.ReportSaver saver = new Praktikum_4.dengan_srp.ReportSaver();
        saver.saveToFile(reportFileName + ".txt",reportContent);

        Praktikum_4.dengan_srp.ReportPrinter printer =  new Praktikum_4.dengan_srp.ReportPrinter();
        printer.printReport(reportContent);
    }
}
