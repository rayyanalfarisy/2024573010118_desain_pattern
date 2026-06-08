`# Laporan Modul 4: SOLID Principle : Single Responsibility Principle (SRP)
**Mata Kuliah:** Desain Pattern  
**Nama:** MUHAMMAD RAYYAN ALFARISY
**NIM:** 2024573010118
**Kelas:** TI 2A

---

## 1. Abstrak
Laporan ini membahas penerapan Single Responsibility Principle (SRP) sebagai salah satu bagian dari prinsip SOLID dalam pengembangan perangkat lunak berorientasi objek.
Tujuan dari praktikum ini adalah untuk memahami konsep dasar SRP, mengidentifikasi pelanggaran prinsip tersebut dalam kode program, serta melakukan refactoring agar struktur kode menjadi lebih modular dan terorganisir.
Melalui beberapa studi kasus seperti pengelolaan laporan dan manajemen pengguna, ditunjukkan bahwa satu kelas yang memiliki banyak tanggung jawab dapat menyebabkan kode sulit dipelihara dan rentan terhadap kesalahan.
Dengan menerapkan SRP, setiap kelas hanya memiliki satu fungsi utama sehingga meningkatkan keterbacaan, kemudahan pengujian, dan fleksibilitas dalam pengembangan. Hasil dari praktikum ini menunjukkan bahwa penerapan SRP mampu menghasilkan kode yang lebih bersih, terstruktur, dan mudah dikembangkan di masa mendatang.
`
### Tujuan

1. Memahami prinsip Single Responsibility Principle (SRP) dalam SOLID.
2. Mengetahui manfaat penerapan prinsip SOLID dalam pengembangan perangkat lunak.
3. Mampu mengidentifikasi pelanggaran SRP dalam kode.
4. Mampu melakukan refactoring kode agar sesuai dengan prinsip SRP.
   
---

SOLID merupakan kumpulan lima prinsip dasar dalam pemrograman berorientasi objek (OOP) yang bertujuan untuk menghasilkan perangkat lunak yang lebih terstruktur, fleksibel, dan mudah dirawat. Lima prinsip tersebut meliputi:

1. Single Responsibility Principle (SRP)
2. Open-Closed Principle (OCP)
3. Liskov Substitution Principle (LSP)
4. Interface Segregation Principle (ISP)
5. Dependency Inversion Principle (DIP)

#### Manfaat penerapan SOLID:
- Membuat kode lebih mudah dipahami.
- Mengurangi ketergantungan antar modul.
- Mempermudah proses pengujian.
- Mendukung pengembangan fitur baru tanpa merusak sistem lama.

## Single Responsibility Principle (SRP)

Single Responsibility Principle (SRP) adalah prinsip yang menyatakan bahwa sebuah kelas hanya boleh memiliki satu tanggung jawab utama atau satu alasan untuk mengalami perubahan. Dengan kata lain, setiap kelas harus fokus pada satu fungsi tertentu.

Prinsip ini diperkenalkan oleh Robert C. Martin (Uncle Bob) dalam bukunya Agile Software Development: Principles, Patterns, and Practices. Tujuan dari SRP adalah meningkatkan kualitas struktur kode agar lebih modular, mudah dirawat, dan fleksibel terhadap perubahan.
### Mengapa SRP Penting?
- Mengurangi kompleksitas: Kelas dengan banyak tanggung jawab akan sulit dipahami.
- Mempermudah pemeliharaan: Perubahan hanya berdampak pada satu bagian.
- Mendukung pengujian: Unit testing menjadi lebih sederhana.
- Menghindari bug: Perubahan kecil tidak berdampak ke bagian lain.

---

### Kelebihan dan Kekurangan SRP
Kelebihan SRP:
- Kode menjadi lebih mudah dibaca dan dipahami karena setiap kelas memiliki satu fungsi yang jelas.
- Memudahkan proses pemeliharaan karena perubahan hanya dilakukan pada satu bagian tertentu.
- Meningkatkan reusability (penggunaan ulang kode) karena fungsi yang spesifik dapat digunakan kembali.
- Mempermudah proses unit testing karena setiap kelas memiliki tanggung jawab yang terpisah.
- Mengurangi risiko bug atau efek samping akibat perubahan pada kode.
- Mempermudah pengembangan fitur baru tanpa mengganggu bagian lain dari sistem.

Kekurangan SRP:
- Jumlah kelas dalam program bisa menjadi lebih banyak sehingga struktur terlihat lebih kompleks.
- Membutuhkan perencanaan desain yang lebih matang di awal pengembangan.
- Jika diterapkan secara berlebihan dapat menyebabkan over-engineering.
- Pengelolaan dependensi antar kelas menjadi lebih kompleks.
- Untuk proyek kecil, penerapan SRP terkadang terasa kurang efisien.

---
### Praktikum
1. Buatlah sebuah package baru di dalam `src` dan beri nama `modul_4`

#### Praktikum 1 : Membuat Program Report Manager
Program ini menghasilkan laporan, menyimpannya ke file, dan mencetaknya ke console.
##### Kode yang melanggar aturan SRP
1. Buat sebuah package baru di dalam `Praktikum_4` dan beri nama `bagian_1`
2. Buat sebuah package baru di dalam `bagian_1` dan beri nama `tanpa_srp`
3. Buat class baru di dalam `tanpa_srp` dengan nama `ReportManager` dan isikan kode berikut:

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

4. Buat class `Main` dan isikan kode berikut:

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

5. Jalankan dan lihat hasilnya.

📌 Masalah:
* ReportManager menangani pembuatan, penyimpanan, dan pencetakan laporan, melanggar SRP.
* Jika ada perubahan dalam penyimpanan atau pencetakan, seluruh kelas ini harus diubah.

##### Refactor kode diatas untuk mematuhi aturan SRP
1. Buat sebuah package baru di dalam `praktikum_1` dan beri nama `dengan_srp`
2. Kemudian buat class baru dengan nama `ReportGenerator` dan isikan kode berikut:

        public class ReportGenerator {
        private final String content;
        
            public ReportGenerator(String content){
                this.content = content;
            }
        
            public String generateReport(){
                return "=== LAPORAN ===/n" + content + "/n============";
            }
        }

3. Buat class baru dengan nama `ReportSaver` dan isikan kode berikut:

        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        
        public class ReportSaver {
        public void saveToFile(String filename,String content){
        String folderPath = "src//Praktikum_4//dengan_srp";
        
                File file = new File(folderPath + filename);
        
                try(FileWriter writer = new FileWriter(file)){
                    writer.write(content);
                    System.out.println("Laporan disimpan ke file: " + filename);
                } catch (IOException e) {
                    System.out.println("gagal menyimpan laporan: " + e.getLocalizedMessage());
                }
        
            }
        }

4. Buat class baru dengan nama `ReportPrinter` dan isikan kode berikut:

        public class ReportPrinter {
        public void printReport(String content){
        System.out.println("/nLaporan yang di cetak: /n" + content);
        }
        }

5. Buat class `Main` dan isikan kode berikut:

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

6. Jalankan dan lihat hasilnya.

📌 Keuntungan setelah menerapkan SRP:
- Kode lebih modular → Perubahan pada penyimpanan atau pencetakan tidak memengaruhi kelas `ReportGenerator`.
- Lebih mudah diuji → `ReportSaver` dan `ReportPrinter` bisa diuji secara terpisah.
- Kode lebih rapi
- Perubahan tidak saling memengaruhi

---
#### Praktikum 2 : Membuat Program Manajemen Pengguna
Program ini memungkinkan pengguna untuk mendaftar, menyimpan datanya ke "database" (file teks), dan mengirim email selamat datang (simulasi).

##### Kode yang melanggar aturan SRP
1. Buat sebuah package baru di dalam `Praktikum_4` dan beri nama `modul_2`
2. Buat sebuah package baru di dalam `modul_2` dan beri nama `tanpa_srp`
3. Buat class baru di dalam `tanpa_srp` dengan nama `UserManager` dan isikan kode berikut:

        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        
        public class UserManager {
        private final String name;
        private final String email;
        
            public UserManager(String name, String email) {
                this.name = name;
                this.email = email;
            }
        
            // Menyimpan pengguna ke database (Seharusnya tugas kelas lain)
            public void saveToDatabase() {
                String folderPath = "src\\modul_4\\srp\\praktikum_2\\tanpa_srp\\";
                String filename = "user.txt";
        
                File file = new File(folderPath + filename);
        
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(name + " - " + email + "\n");
                    System.out.println("Pengguna berhasil disimpan: " + name);
                } catch (IOException e) {
                    System.out.println("Gagal menyimpan pengguna: " + e.getMessage());
                }
            }
        
            // Mengirim email selamat datang (Seharusnya tugas kelas lain)
            public void sendWelcomeEmail() {
                System.out.println("\nMengirim email ke " + email + "...");
                System.out.println("Halo " + name + ", selamat datang di sistem kami!\n");
            }
        }

4. Buat class `Main` dan isikan kode berikut:

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("Masukkan nama pengguna: ");
                String name = scanner.nextLine();
        
                System.out.print("Masukkan email pengguna: ");
                String email = scanner.nextLine();
        
                UserManager userManager = new UserManager(name, email);
                userManager.saveToDatabase();
                userManager.sendWelcomeEmail();
            }
        }

5. Jalankan dan lihat hasilnya.

📌 Masalah:
* `UserManager` menangani manajemen user, penyimpanan ke database, dan pengiriman email.
* Jika ada perubahan dalam penyimpanan atau sistem email, seluruh kelas ini harus diubah.

##### Refactor kode diatas untuk mematuhi aturan SRP
1. Buat sebuah package baru di dalam `modul_2` dan beri nama `dengan_srp`
2. Buat class baru dengan nama `User` dan isikan kode berikut:

        public class User {
        private String name;
        private String email;
        
            public  User (String name,String email){
                this.name = name;
                this.email = email;
            }
        
            public String getName(){
                return name;
            }
        
            public String getEmail() {
                return email;
            }
        }

3. Buat class baru dengan nama `UserRepository` dan isikan kode berikut:

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

4. Buat class baru dengan nama `UserService` dan isikan kode berikut:

        public class UserService {
        public void sendWelcomeEmail(User user){
        System.out.println("/nMengirim email ke " + user.getEmail() + "...");
        System.out.println("Halo" + user.getName() + ",Selamat datang di sistem kami!/n");
        }
        }

5. Buat class `Main` dan isikan kode berikut:

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

6. Jalankan dan lihat hasilnya.

Dengan SRP
Dipisahkan menjadi:
- User → data pengguna
- UserRepository → penyimpanan data
- UserService → logika bisnis

📌 Keuntungan setelah menerapkan SRP:
✅ Kode lebih bersih & modular
✅ Lebih mudah diperbaiki & diuji

---
### Latihan
#### Membuat Program Manajemen Pesanan (Order Management)
Deskripsi:
Seorang developer telah membuat program sederhana untuk menangani manajemen pesanan (order management). Namun, kode tersebut melanggar prinsip Single Responsibility Principle (SRP) karena menangani banyak tugas dalam satu kelas. Kode yang melanggar aturan SRP adalah sebagai berikut:

buat class`OrderManager` dan isikan kode berikut:
    
    import java.io.FileWriter;
    import java.io.IOException;
    
    public class OrderManager {
    private String product;
    private int quantity;
    private double price;
    
        public OrderManager(String product, int quantity, double price) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
        }
    
        // Menghitung total harga
        public double calculateTotal() {
            return quantity * price;
        }
    
        // Menyimpan pesanan ke file (Seharusnya tugas kelas lain)
        public void saveOrder() {
            try (FileWriter writer = new FileWriter("orders.txt", true)) {
                writer.write(product + " - " + quantity + " - Rp" + calculateTotal() + "\n");
                System.out.println("Pesanan telah disimpan!");
            } catch (IOException e) {
                System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
            }
        }
    
        // Menampilkan struk pesanan (Seharusnya tugas kelas lain)
        public void printReceipt() {
            System.out.println("\n--- Struk Pesanan ---");
            System.out.println("Produk     : " + product);
            System.out.println("Jumlah     : " + quantity);
            System.out.println("Total Harga: Rp" + calculateTotal());
            System.out.println("======================");
        }
    }

buat class `Main` dan isikan kode berikut:

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("Masukkan nama produk: ");
                String product = scanner.nextLine();
        
                System.out.print("Masukkan jumlah: ");
                int quantity = scanner.nextInt();
        
                System.out.print("Masukkan harga satuan: ");
                double price = scanner.nextDouble();
        
                OrderManager order = new OrderManager(product, quantity, price);
                order.saveOrder();
                order.printReceipt();
            }
        }

Tugas Anda:
1. Analisis kode yang telah diberikan.
2. Identifikasi bagian mana yang melanggar SRP.
3. Pisahkan tanggung jawab ke dalam kelas-kelas yang sesuai agar mematuhi SRP.

solusinya:
1. Buat sebuah package baru di dalam `Praktikum_4` dengan nama `latihan`
2. Buat class baru dengan nama `Order` dan isikan kode berikut:

        public class Order {
        private String product;
        private int quantity;
        private double price;
        
            public Order(String product, int quantity, double price) {
                this.product = product;
                this.quantity = quantity;
                this.price = price;
            }
        
            public String getProduct() {
                return product;
            }
        
            public int getQuantity() {
                return quantity;
            }
        
            public double getPrice() {
                return price;
            }
        
            public double calculateTotal() {
                return quantity * price;
            }
        }

3. Buat class baru dengan nama `OrderReposory` dan isikan kode berikut:

        import java.io.FileWriter;
        import java.io.IOException;
        
        public class OrderRepository {
        
            public void saveOrder(Order order) {
                try (FileWriter writer = new FileWriter("orders.txt", true)) {
                    writer.write(order.getProduct() + " - " + order.getQuantity() + " - Rp" + order.calculateTotal() + "\n");
                    System.out.println("Pesanan telah disimpan!");
                } catch (IOException e) {
                    System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
                }
            }
        }

4. Buat class baru dengan nama `ReceiptPrinter` dan isikan kode berikut:

        public class ReceiptPrinter {
        
            public void printReceipt(Order order) {
                System.out.println("\n--- Struk Pesanan ---");
                System.out.println("Produk     : " + order.getProduct());
                System.out.println("Jumlah     : " + order.getQuantity());
                System.out.println("Total Harga: Rp" + order.calculateTotal());
                System.out.println("======================");
            }
        }

5. Buat class main :

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args) {
        
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Masukkan nama produk: ");
                String product = scanner.nextLine();
        
                System.out.print("Masukkan jumlah: ");
                int quantity = scanner.nextInt();
        
                System.out.print("Masukkan harga satuan: ");
                double price = scanner.nextDouble();
        
                Order order = new Order(product, quantity, price);
        
                OrderRepository repository = new OrderRepository();
                ReceiptPrinter printer = new ReceiptPrinter();
        
                repository.saveOrder(order);
                printer.printReceipt(order);
        
                scanner.close();
            }
        }

---
### Kesimpulan
Berdasarkan hasil praktikum yang telah dilakukan, dapat disimpulkan bahwa Single Responsibility Principle (SRP) merupakan prinsip penting dalam pengembangan perangkat lunak yang menekankan bahwa setiap kelas hanya memiliki satu tanggung jawab utama. Dengan menerapkan SRP, struktur kode menjadi lebih terorganisir, mudah dipahami, dan lebih sederhana dalam proses pemeliharaan maupun pengujian. Selain itu, pemisahan tanggung jawab juga membantu mengurangi risiko kesalahan akibat perubahan pada kode. Namun, penerapan SRP perlu dilakukan secara bijak agar tidak menimbulkan kompleksitas berlebih akibat terlalu banyaknya kelas dalam sistem.

## Penutup
Penerapan prinsip desain seperti SRP memberikan kontribusi besar dalam meningkatkan kualitas perangkat lunak. Dengan membagi tanggung jawab secara jelas, pengembang dapat menciptakan sistem yang lebih modular, fleksibel, dan mudah dikembangkan di masa depan. Oleh karena itu, pemahaman terhadap prinsip SRP sangat penting sebagai dasar dalam membangun perangkat lunak yang baik. Diharapkan melalui praktikum ini, pemahaman terhadap konsep SRP dapat semakin meningkat dan dapat diterapkan dalam pengembangan proyek selanjutnya.