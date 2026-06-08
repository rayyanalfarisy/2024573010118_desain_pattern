# Jawaban Tugas Analisis

## Soal 1
Jelaskan mengapa Strategy Pattern cocok digunakan dalam kasus pembayaran e-commerce.

### Jawaban:
Strategy Pattern cocok digunakan dalam kasus pembayaran e-commerce karena terdapat berbagai metode pembayaran yang memiliki proses berbeda-beda, seperti Kartu Kredit, E-Wallet, dan Transfer Bank.

Dengan menggunakan Strategy Pattern, setiap metode pembayaran dibuat dalam class terpisah yang mengimplementasikan interface yang sama, yaitu PaymentStrategy. Hal ini membuat sistem lebih fleksibel karena metode pembayaran dapat diganti saat runtime tanpa mengubah kode utama.

Keuntungan lainnya adalah:
- Mengurangi penggunaan if-else yang berlebihan.
- Mempermudah pemeliharaan kode.
- Mendukung prinsip Open/Closed Principle (OCP) karena sistem dapat diperluas tanpa memodifikasi kode yang sudah ada.

---

## Soal 2
Bagaimana jika suatu hari ingin menambahkan metode pembayaran baru seperti QRIS? Apakah Anda perlu mengubah class Checkout?

### Jawaban:
Tidak perlu mengubah class Checkout.

Untuk menambahkan metode pembayaran QRIS, cukup membuat class baru yang mengimplementasikan interface PaymentStrategy.

Contoh:

```java
public class QRISPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Pembayaran sebesar Rp" + amount +
            " berhasil menggunakan QRIS."
        );
    }
}