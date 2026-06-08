# Laporan Modul 4: Open-Closed Principle (OCP)
**Mata Kuliah:** Desain Pattern  
**Nama:** MUHAMMAD RAYYAN ALFARISY
**NIM:** 2024573010118
**Kelas:** TI 2A

---

## 1. Abstrak
Laporan ini bertujuan untuk memahami konsep Open-Closed Principle (OCP) sebagai salah satu bagian dari prinsip SOLID dalam pemrograman berorientasi objek. Selain itu, laporan ini juga membahas pentingnya penerapan prinsip SOLID dalam pengembangan perangkat lunak agar kode menjadi lebih terstruktur, fleksibel, dan mudah dipelihara. Melalui praktikum yang dilakukan, penulis mampu mengidentifikasi kode yang melanggar prinsip OCP serta melakukan refactoring dengan memanfaatkan konsep polimorfisme dan penggunaan interface. Dengan demikian, sistem yang dihasilkan dapat dengan mudah dikembangkan tanpa harus mengubah kode yang sudah ada, sehingga meminimalkan risiko kesalahan dan meningkatkan efisiensi pengembangan perangkat lunak.

### Tujuan

1. Memahami konsep Open-Closed Principle (OCP) sebagai bagian dari prinsip SOLID.
2. Mengetahui pentingnya penerapan prinsip SOLID dalam pengembangan perangkat lunak.
3. Mampu mengenali kode yang tidak sesuai dengan OCP.
4. Mampu memperbaiki (refactor) kode agar sesuai dengan prinsip OCP.

---

SOLID merupakan kumpulan lima prinsip dasar dalam pemrograman berorientasi objek (OOP) yang bertujuan untuk menghasilkan perangkat lunak yang lebih terstruktur, fleksibel, dan mudah dirawat. Lima prinsip tersebut meliputi:

1. Single Responsibility Principle (SRP)
2. Open-Closed Principle (OCP)
3. Liskov Substitution Principle (LSP)
4. Interface Segregation Principle (ISP)
5. Dependency Inversion Principle (DIP)

#### Manfaat penerapan SOLID:
- Meningkatkan keterbacaan dan pemeliharaan kode.
- Mengurangi ketergantungan antar komponen.
- Mempermudah pengujian unit dan integrasi.
- Memudahkan pengembangan fitur baru.

## Open-Closed Principle (OCP)
Open-Closed Principle (OCP) menyatakan bahwa
Sebuah entitas perangkat lunak (kelas, modul, atau fungsi) harus terbuka untuk perluasan tetapi tertutup untuk modifikasi.

Open-Closed Principle (OCP) adalah salah satu dari lima prinsip SOLID dalam pemrograman berorientasi objek (OOP) yang dirumuskan oleh Robert C. Martin (Uncle Bob). Prinsip ini pertama kali diperkenalkan oleh Bertrand Meyer dalam bukunya Object-Oriented Software Construction (1988).

Menurut prinsip ini, suatu entitas perangkat lunak (seperti kelas, modul, atau fungsi) harus:
- Terbuka untuk perluasan (Open for extension) → Dapat diperluas dengan menambahkan fitur atau fungsionalitas baru.
- Tertutup untuk modifikasi (Closed for modification) → Tidak perlu mengubah kode yang sudah ada ketika ada kebutuhan baru.

##### Penjelasan Prinsip OCP dengan Contoh
Prinsip ini berarti bahwa kita tidak boleh mengubah kode yang sudah ada setiap kali ada perubahan kebutuhan.Dalam praktiknya, OCP mendorong penggunaan teknik seperti:

- Interface atau abstract class
- Pewarisan (inheritance)
- Polimorfisme
- Design pattern seperti Strategy

### Mengapa OCP Penting?
- Mengurangi kemungkinan error karena kode lama tidak diubah.
- Meningkatkan penggunaan ulang kode (reusability).
- Mempermudah maintenance karena perubahan tidak menyentuh bagian lama.
- Mempercepat pengembangan fitur baru.

---

### Kapan dan Bagaimana Menerapkan OCP?
OCP sangat berguna dalam proyek besar atau jangka panjang, tetapi untuk proyek sederhana, terkadang implementasi OCP bisa terasa seperti over.

Gunakan OCP jika:
✔ Sistem akan terus berkembang
✔ Dibutuhkan fleksibilitas tinggi
✔ Ingin menghindari perubahan pada kode lama

Tidak perlu digunakan jika:
❌ Sistem sangat sederhana
❌ Tidak ada rencana pengembangan lanjutan

---
### Praktikum
1. Buat sebuah package baru di dalam `src` dan beri nama `praktikum_5`

#### Praktikum 1 : Aplikasi Sistem Pembayaran
##### Kode yang melanggar aturan OCP
1. Buat sebuah package baru di dalam `praktikum_5` dan beri nama `modul_1`
2. Buat sebuah package baru di dalam `praktikum_1` dan beri nama `tanpa_ocp`
3. Buat class baru di dalam `tanpa_ocp` dengan nama `PaymentProcessor` dan isikan kode seperti berikut:

        public class PaymentProcessor {
        public void processPayment(String paymentType,double amount){
        if(paymentType.equals("creditCard")){
        System.out.println("Processing Credit Card Payment of " + amount);
        } else if (paymentType.equals("Ewallet")) {
        System.out.println("Processing E-wallet payment of " + amount);
        }else {
        System.out.println("Invalid payment method");
        }
        }
        }

5. Buat class `Main` dan isikan kode berikut:

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Payment type (CreditCard/Ewallet):");
        String type = scanner.next();
        System.out.println("enter amount : ");
        double amount = scanner.nextDouble();
        
                PaymentProcessor processor = new PaymentProcessor();
                processor.processPayment(type,amount);
            }
        }

6. Jalankan dan lihat hasilnya.

##### Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam `modul_1` dan beri nama `dengan_ocp`
2. Buat sebuah interface dengan nama `PaymentMethod` dan isikan kode berikut:

        public interface PaymentMethod {
        void process(double amount);
        }

3. Buat sebuah class dengan nama `CreditCardPayment` dan isikan kode berikut:

        public class CreditCardPayment implements PaymentMethod{
        public void process(double amount){
        System.out.println("Processing Credit Card Payment of " + amount);
        }
        }

4. Buat sebuah class dengan nama `EWalletPayment` dan isikan kode berikut:

        public class EwalletPayment implements PaymentMethod{
        public void process(double amount){
        System.out.println("Prosessing E-Wallet Payment of " + amount);
        }
        }

5. Buat sebuah class dengan nama `PaymentProcessor` dan isikan kode berikut:

        public class PaymentProcessor {
        public void processPayment(PaymentMethod method,double amount){
        method.process(amount);
        }
        }

6. Buat sebuah class `Main` dan isikan kode berikut:

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment type (CreditCard/EWallet): ");
        String type = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        
                PaymentProcessor processor = new PaymentProcessor();
                PaymentMethod paymentMethod;
        
                if (type.equalsIgnoreCase("CreditCard")) {
                    paymentMethod = new CreditCardPayment();
                } else if (type.equalsIgnoreCase("EWallet")) {
                    paymentMethod = new EwalletPayment();
                } else {
                    System.out.println("Invalid payment method");
                    return;
                }
        
                processor.processPayment(paymentMethod, amount);
            }
        }

7. Jalankan dan lihat hasilnya.

📌 Keuntungan setelah menerapkan OCP:
✅ Kode lebih modular → Bisa menambahkan metode pembayaran baru tanpa mengubah `PaymentProcessor`.
✅ Lebih mudah diuji → Tiap strategi pembayaran bisa diuji secara terpisah.

---
#### Praktikum 2 : Sistem Perhitungan Diskon
##### Kode yang melanggar aturan OCP
1. Buat sebuah package baru di dalam `praktikum_5` dan beri nama `modul_2`
2. Buat sebuah package baru di dalam `modul_2` dan beri nama `tanpa_ocp`
3. Buat class baru di dalam `tanpa_ocp` dengan nama `DiscountCalculator` dan isikan kode seperti berikut:

        public class DiscountCalculator {
        public double calculateDiscount(String costumerType,double price){
        if (costumerType.equals("Reguler")){
        return price * 0.1;
        } else if (costumerType.equals("Premium")) {
        return price * 0.2;
        }else {
        return 0;
        }
        }
        }

4. Buat class `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[] args){
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Reguler costumer doscount: " +
        calculator.calculateDiscount("Reguler",100));
        System.out.println("Premium costomer discount :" +
        calculator.calculateDiscount("Premium", 100));
        }
        }

5. Jalankan dan lihat hasilnya.

##### Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam `modul_2` dan beri nama `dengan_ocp`
2. Buat sebuah interface dengan nama `Discount` dan isikan kode berikut:

        public interface Discount {
        double applyDiscount(double price);
        }

3. Buat sebuah class dengan nama `RegularDiscount` dan isikan kode berikut:

        public class RegulerDiscount implements Discount{
        @Override
        public double applyDiscount(double price) {
        return price * 0.2;
        }
        }

4. Buat sebuah class dengan nama `PremiumDiscount` dan isikan kode berikut:

        public class PremiumDiscount implements Discount{
        @Override
        public double applyDiscount(double price) {
        return price * 0.2;
        }
        }

5. Buat sebuah class dengan nama `DiscountCalculator` dan isikan kode berikut:

        public class DiscountCalculator {
        public double calculateDiscount(Discount discountStrategy,double price){
        return discountStrategy.applyDiscount(price);
        }
        }

6. Buat sebuah class `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[] args){
        DiscountCalculator calculator = new DiscountCalculator();
        
                Discount reguler = new RegulerDiscount();
                Discount premium = new PremiumDiscount();
        
                System.out.println("reguler Costumer Discount:" + calculator.calculateDiscount(reguler,100));
                System.out.println("Premium Costumer Discount:" + calculator.calculateDiscount(premium,100));
            }
        }

7. Jalankan dan lihat hasilnya.

📌 Keuntungan setelah menerapkan OCP:
✅ Kode lebih modular → Bisa menambahkan jenis diskon baru tanpa mengubah `DiscountCalculator`.
✅ Lebih mudah diuji → Tiap strategi diskon bisa diuji secara terpisah.

---

#### Praktikum 3 : Sistem Notifikasi
##### Kode yang melanggar aturan OCP
1. Buat sebuah package baru di dalam `praktikum_5` dan beri nama `modul_3`
2. Buat sebuah package baru di dalam `modul_3` dan beri nama `tanpa_ocp`
3. Buat class baru di dalam `tanpa_ocp` dengan nama `NotificationService` dan isikan kode seperti berikut:

        public class NotificationService {
        public void sendNotification(String type, String message) {
        if (type.equals("Email")) {
        System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
        System.out.println("Sending SMS: " + message);
        } else {
        System.out.println("Invalid notification type");
        }
        }
        }

4. Buat class `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[] args){
        NotificationService service = new NotificationService();
        service.sendNotification("Email","Hello Via Email!");
        service.sendNotification("SMS","Hello via SMS ");
        }
        }

5. Jalankan dan lihat hasilnya.

##### Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam `modul_3` dan beri nama `dengan_ocp`
2. Buat sebuah interface dengan nama `Notifier` dan isikan kode berikut:

        public interface Notifier {
        void send(String message);
        }

3. Buat sebuah class dengan nama `EmailNotifier` dan isikan kode berikut:

        public class EmailNotifier implements Notifier {
        public void send(String message){
        System.out.println("Sending Email: " + message);
        }
        }

4. Buat sebuah class dengan nama `SMSNotifier` dan isikan kode berikut:

        public class SMSNotifier implements Notifier{
        public void send(String message){
        System.out.println("Sendin SMS:" + message);
        }
        }


5. Buat sebuah class dengan nama `NotificationService` dan isikan kode berikut:

        public class NotificationService {
        public void sendNotification(Notifier notifier,String message){
        notifier.send(message);
        }
        }

6. Buat sebuah class `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[] args){
        NotificationService service = new NotificationService();
        
                Notifier emailNotifier = new EmailNotifier();
                Notifier smsNotifier = new SMSNotifier();
        
                service.sendNotification(emailNotifier, "Hello via email");
                service.sendNotification(smsNotifier,"Hello via sms");
            }
        }

7. Jalankan dan lihat hasilnya.

📌 Keuntungan setelah menerapkan OCP:
✅ Kode lebih modular → Bisa menambahkan jenis notifikasi baru tanpa mengubah `NotificationService`.
✅ Lebih mudah diuji → Tiap strategi notifikasi bisa diuji secara terpisah.

---
### Latihan : Sistem Pengelolaan Pajak
Program ini menghitung pajak berdasarkan jenis kendaraan (Mobil atau Motor). Saat ini, kode yang ada dibawah ini tidak mengikuti OCP, sehingga jika kita ingin menambahkan jenis kendaraan baru (misalnya Truk), kita harus mengubah metode `calculateTax()`. Kode yang melanggar aturan OCP adalah sebagai berikut:

1. Buat Class `TaxCalculator` dan isikan kode berikut:

    public class TaxCalculator {
    public double calculateTax(String vehicleType,double price){
    if(vehicleType.equals("Car")){
    return price * 0.1; //pajak 10% untuk mobil
    } else if (vehicleType.equals("Motorcyle")) {
    return price * 0.5; //pajak 5% untuk motor
    
            }else {
                return 0;
            }
        }
    }


2. Buat Class `Main` dan isikan kode berikut:

    import java.util.Scanner;
    
    public class Main {
    public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    System.out.print("Enter Vehicle Type (Car/Motorcyle):");
    String type = scanner.next();
    System.out.println("Enter vehicle price: ");
    double price = scanner.nextDouble();
    
            TaxCalculator calculator = new TaxCalculator();
            double tax = calculator.calculateTax(type,price);
    
            System.out.println("Calculated tax: " + tax);
        }
    }


Tugas:

Modifikasi kode di atas agar memenuhi prinsip OCP, sehingga kita bisa menambahkan jenis kendaraan baru tanpa mengubah kode yang sudah ada.

Petunjuk:
1. Gunakan polimorfisme dengan membuat interface `TaxStrategy`.
2. Buat class `CarTax` dan `MotorcycleTax` yang mengimplementasikan `TaxStrategy`.
3. Ubah `TaxCalculator` agar menerima strategi pajak sebagai parameter, bukan langsung menerima `vehicleType`.
4. Tambahkan kelas baru `TruckTax` (dengan pajak 15%) tanpa mengubah `TaxCalculator`.

Setelah refactoring, program harus bisa dengan mudah menangani kendaraan baru tanpa mengubah kode TaxCalculator.

Langkah membuat solusi latihan:
1. Buat sebuah package baru di dalam `praktikum_5` dengan nama `latihan`
2. Buat sebuah interface dengan nama `TaxStrategy` dan isikan kode berikut:

        public interface TaxStrategy {
        double calculateTax(double price);
        }

3. Buat sebuah class dengan nama `TaxCalculator` dan isikan kode berikut:

        public class TaxCalculator {
        public double calculateTax(TaxStrategy strategy,double price){
        return strategy.calculateTax(price);
        }
        }

4. Buat sebuah class dengan nama `CarTax` dan isikan kode berikut:

        public class CarTax implements TaxStrategy{
        @Override
        public double calculateTax(double price){
        return price * 0.1;
        }
        }


5. Buat sebuah class dengan nama `MotorcyleTax` dan isikan kode berikut:

        public class MotorcycleTax implements TaxStrategy{
        @Override
        public double calculateTax(double price){
        return price * 0.5;
        }
        }

6. Buat sebuah class `Main` untuk menguji kode tersebut

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter Vehicle Type (Car/Motorcycle/Truck): ");
                String type = scanner.next();
        
                System.out.print("Enter vehicle price: ");
                double price = scanner.nextDouble();
        
                TaxStrategy strategy;
        
                if(type.equalsIgnoreCase("Car")){
                    strategy = new CarTax();
                } else if(type.equalsIgnoreCase("Motorcycle")){
                    strategy = new MotorcycleTax();
                } else if(type.equalsIgnoreCase("Truck")){
                    strategy = new CarTax();
                } else {
                    System.out.println("Unknown vehicle type!");
                    return;
                }
        
                TaxCalculator calculator = new TaxCalculator();
                double tax = calculator.calculateTax(strategy, price);
        
                System.out.println("Calculated tax: " + tax);
            }
        }

---
### Kesimpulan
Berdasarkan praktikum dan pembahasan yang telah dilakukan, dapat disimpulkan bahwa Open-Closed Principle (OCP) merupakan prinsip yang sangat penting dalam pengembangan perangkat lunak berbasis objek. Prinsip ini memungkinkan sebuah sistem untuk dikembangkan lebih lanjut tanpa harus mengubah kode yang sudah ada. Dengan menerapkan konsep seperti polimorfisme, interface, dan design pattern, kode menjadi lebih modular, fleksibel, serta mudah untuk dipelihara dan diuji. Selain itu, penerapan OCP juga membantu mengurangi risiko terjadinya bug ketika menambahkan fitur baru, karena perubahan tidak dilakukan pada kode lama yang sudah berjalan dengan baik.

### Penutup
Demikian laporan praktikum mengenai Open-Closed Principle (OCP) ini disusun. Diharapkan melalui praktikum ini, pemahaman mengenai pentingnya prinsip OCP dalam pengembangan perangkat lunak dapat semakin meningkat. Penulis menyadari bahwa laporan ini masih memiliki kekurangan, sehingga kritik dan saran yang membangun sangat diharapkan untuk perbaikan di masa mendatang. Semoga laporan ini dapat memberikan manfaat dan menjadi referensi dalam memahami konsep desain perangkat lunak yang baik dan benar.