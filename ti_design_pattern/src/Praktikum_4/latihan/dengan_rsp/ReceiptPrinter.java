package Praktikum_4.latihan.dengan_rsp;

public class ReceiptPrinter {

    public void printReceipt(Order order) {
        System.out.println("\n--- Struk Pesanan ---");
        System.out.println("Produk     : " + order.getProduct());
        System.out.println("Jumlah     : " + order.getQuantity());
        System.out.println("Total Harga: Rp" + order.calculateTotal());
        System.out.println("======================");
    }
}
