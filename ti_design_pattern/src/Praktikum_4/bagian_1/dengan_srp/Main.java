package Praktikum_4.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.println("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportGenerator report = new ReportGenerator(reportText);
        String reportContent = report.generateReport();

        ReportSaver saver = new ReportSaver();
        saver.saveToFile(reportFileName + ".txt",reportContent);

        ReportPrinter printer =  new ReportPrinter();
        printer.printReport(reportContent);
    }
}
