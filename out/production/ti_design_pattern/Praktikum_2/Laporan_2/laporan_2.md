# Laporan Modul 2: Review konsep Dasar OOP Menggunakan Java
**Mata Kuliah:** Desain Pattern  
**Nama:** MUHAMMAD RAYYAN ALFARISY
**NIM:** 2024573010118
**Kelas:** TI 2A

---

## 1. Abstrak
Pemrograman Berorientasi Objek atau Object Oriented Programming (OOP) merupakan pendekatan dalam pemrograman yang berfokus pada penggunaan objek sebagai komponen utama dalam membangun sebuah program. Dalam bahasa pemrograman Java, konsep OOP sangat penting karena sebagian besar struktur program dibangun menggunakan class dan object.

Praktikum pada modul ini bertujuan untuk memahami konsep dasar OOP yang meliputi pembuatan class dan object, penggunaan atribut dan method, penerapan akses modifier, penggunaan setter dan getter, serta penggunaan constructor. Dengan memahami konsep-konsep tersebut, mahasiswa diharapkan mampu mengembangkan program Java yang lebih terstruktur, mudah dipelihara, dan sesuai dengan prinsip OOP.
---
### Tujuan

1. Memahami konsep dasar pemrograman berorientasi objek dalam bahasa Java.
2. Mampu membuat serta menggunakan class, object, attribute, dan method.
3. Memahami fungsi dari berbagai akses modifier seperti public, private, protected, dan default.
4. Mampu menggunakan setter dan getter untuk mengelola atribut pada sebuah class.
5. Memahami konsep constructor, baik default constructor, parameterized constructor, maupun constructor overloading.

## 1. Class dan Object
Class merupakan cetakan atau rancangan dasar yang digunakan untuk membuat sebuah objek. Di dalam class terdapat definisi atribut dan method yang menggambarkan karakteristik serta perilaku dari objek yang akan dibuat.

Object adalah hasil instansiasi dari sebuah class. Setiap object memiliki keadaan (state) yang direpresentasikan oleh nilai atribut, serta perilaku (behavior) yang direpresentasikan oleh method.

### Langkah Praktikum
1. Buka project pada praktikum sebelumnya menggunakan intellij IDEA
2. Buat sebuah package baru di dalam folder `src` dengan cara klik kanan pada folder `src` kemudian pilih `New -> Package`. Beri nama `modul_2`.
3. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_1`
4. Kemudian buat sebuah class baru dengan nama `Mahasiswa` dan isikan kode berikut:

         public class Mahasiswa {

             String Nama;
             int Umur;

          }

6. Selanjutnya, buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[]args){
        Mahasiswa mhs1 = new Mahasiswa();
        
                mhs1.Nama = "Budi";
                mhs1.Umur = 20;
        
                System.out.println("nama : " + mhs1.Nama);
                System.out.println("umur : " + mhs1.Umur);
            }
        }

7. Jalankan dan lihat hasilnya.

![2026-04-11 (19).png](gambar/2026-04-11%20%2819%29.png)

### Latihan
1. Buatlah class Buku dengan atribut judul dan pengarang.


        public class Buku {
        String judul;
        String pengarang;
        }
2. Buat object dari class Buku dan isi nilai atributnya.        
        public class Main {
        public static void  main(String[] args){
        Buku buku1 = new Buku();
        
        public class Main {
        public static void  main(String[] args){
        Buku buku1 = new Buku();

        buku1.judul = "Laskar pelangi";
        buku1.pengarang ="Andrea Hirata";

        System.out.println("Judul : " + buku1.judul);
        System.out.println("Pengarang : " + buku1.pengarang);

            }
        }
3. Tampilkan nilai atribut tersebut.

#### screenshoot hasil
![2026-04-11 (20).png](gambar/2026-04-11%20%2820%29.png)

### Analisis program
Class berfungsi sebagai kerangka atau blueprint yang mendefinisikan atribut dan method yang dimiliki oleh suatu objek. Sementara itu, object merupakan instansiasi dari class tersebut. Dari percobaan yang dilakukan dengan membuat class Mahasiswa dan menjalankan class Main, dapat dilihat bahwa object dapat digunakan untuk menyimpan nilai atribut dan menjalankan method yang ada di dalam class.

---
## 2. Attribute dan Method
Attribute merupakan variabel yang dimiliki oleh sebuah class dan berfungsi untuk menyimpan data dari objek. Sedangkan method adalah fungsi yang terdapat di dalam class yang digunakan untuk mendefinisikan perilaku atau operasi yang dapat dilakukan oleh objek.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_2`
2. Kemudian buat sebuah class baru dengan nama `Kalkulator` dan isikan kode berikut:

        public class Kalkulator {
        // Atribut
        int angka1;
        int angka2;
        
            // Method
            int tambah() {
                return angka1 + angka2;
            }
        }

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.angka1 = 5;
        kalkulator.angka2 = 10;
        
                System.out.println("Hasil Penjumlahan: " + kalkulator.tambah());
            }
        }

4. Jalankan program untuk melihat hasilnya.

![2026-04-11 (21).png](gambar/2026-04-11%20%2821%29.png)

### Latihan
1. Buat class `Lingkaran` dengan atribut `jariJari`.
2. Tambahkan method `hitungLuas()` yang mengembalikan nilai luas lingkaran.
    
       public class Lingkaran {
       double jariJari;
    
       double hitungLuas(){
       return 3.14*(jariJari*jariJari);
         }
       }
3. Buat object dari class Lingkaran dan panggil method `hitungLuas()`.
    
       public class Main {
       public static void main(String[] args){
       Lingkaran lingkaran = new Lingkaran();
       lingkaran.jariJari=2.0;
    
            System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
         }
       }

#### screenshoot hasil
![2026-04-11 (22).png](gambar/2026-04-11%20%2822%29.png)
### Analisis program

attribute digunakan untuk menyimpan data yang berkaitan dengan objek, sedangkan method digunakan untuk mendefinisikan perilaku atau operasi yang dapat dilakukan oleh objek tersebut. Melalui contoh pembuatan class Kalkulator, terlihat bahwa method dapat digunakan untuk melakukan berbagai operasi seperti penjumlahan, pengurangan, perkalian, dan pembagian.

---

## 3. Akses Modifier
Akses modifier digunakan untuk menentukan tingkat akses suatu class, atribut, maupun method. Dengan menggunakan akses modifier, programmer dapat mengatur bagian mana dari program yang dapat mengakses suatu data atau fungsi.

Jenis-jenis akses modifier dalam Java antara lain:

- public : dapat diakses dari mana saja.
- private : hanya dapat diakses di dalam class yang sama.
- protected : dapat diakses dalam package yang sama maupun oleh subclass.
- default : hanya dapat diakses oleh class yang berada dalam package yang sama.

### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_3`
2. Kemudian buat sebuah class baru dengan nama `AksesModifier` dan isikan kode berikut:

        public class AksesModifier {
        public int publicVar=1;
        private int privateVar=2;
        protected int protectedVar=3;
        int defaultVar=4;
        
            public void tampilkan(){
                System.out.println("Public " + publicVar);
                System.out.println("Private " + privateVar);
                System.out.println("Protected " + protectedVar);
                System.out.println("Default " + defaultVar);
            }
        }

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

    public class Main {
    
        public static void main(String[]args){
            AksesModifier contoh = new AksesModifier();
            contoh.tampilkan();
         }
       }

4. Jalankan program untuk melihat hasilnya.
![2026-04-11 (23).png](gambar/2026-04-11%20%2823%29.png)

### Latihan
1. Membuat class AkunBank dengan atribut saldo yang memiliki akses private.
2. Menambahkan method tampilkanSaldo() dengan akses public.

        public class AkunBank {
        private int saldo=100;
        
            public void tampilkanSaldo(){
                System.out.println("Saldo :" + saldo);
            }
        }
3. Mencoba mengakses atribut saldo secara langsung dari luar class dan mengamati hasilnya.

        public class Main {
        public static void main(String[] args){
        AkunBank saldo = new AkunBank();
        saldo.tampilkanSaldo();
          }
        }

#### screenshoot hasil
![2026-04-11 (24).png](gambar/2026-04-11%20%2824%29.png)
### Analisis program

pentingnya pengaturan hak akses dalam sebuah program. Dengan menggunakan modifier seperti public, private, protected, dan default, programmer dapat mengontrol bagian mana dari kode yang dapat diakses oleh class lain. Hal ini bertujuan untuk menjaga keamanan data dan mencegah perubahan yang tidak diinginkan dari luar class.

---
## 4. Setter dan Getter
Setter dan Getter merupakan method yang digunakan untuk mengatur dan mengambil nilai dari atribut yang memiliki akses private.

Setter digunakan untuk memberikan atau mengubah nilai atribut.
Getter digunakan untuk mengambil nilai atribut.

Penggunaan setter dan getter merupakan bagian dari konsep encapsulation dalam OOP yang bertujuan untuk menjaga keamanan data.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_4`
2. Kemudian buat sebuah class baru dengan nama `Mobil` dan isikan kode berikut:

        public class Mobil {
        private String merk;
        
            //setter
            public void setMerk(String merk){
                this.merk=merk;
            }
            //getter
            public String getMerk(){
                return merk;
            }
        }

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[]args){
        Mobil mobil =new Mobil();
        mobil.setMerk("Toyota");
        
                System.out.println("Merk Mobil:" + mobil.getMerk());
            }
        }

4. Jalankan program untuk melihat hasilnya.
![2026-04-11 (27).png](gambar/2026-04-11%20%2827%29.png)

### Latihan
1. Buat class Mahasiswa dengan atribut nama (private) dan nim (private).
2. Buat setter dan getter untuk kedua atribut tersebut.

        public class Mahasiswa {
        // Atribut private
        private String nama;
        private String nim;
        
            // Setter untuk nama
            public void setNama(String nama) {
                this.nama = nama;
            }
        
            // Getter untuk nama
            public String getNama() {
                return nama;
            }
        
            // Setter untuk nim
            public void setNim(String nim) {
                this.nim = nim;
            }
        
            // Getter untuk nim
            public String getNim() {
                return nim;
            }
        }

3. Buat object dari class Mahasiswa dan gunakan setter untuk mengisi nilai atribut.

        public class Main {
        public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        
                // Menggunakan setter untuk mengisi nilai atribut
                mhs.setNama("Budi Santoso");
                mhs.setNim("12345678");
        
                // Menampilkan hasil menggunakan getter
                System.out.println("Nama: " + mhs.getNama());
                System.out.println("NIM : " + mhs.getNim());
            }
        }

#### screenshoot hasil
![2026-04-11 (26).png](gambar/2026-04-11%20%2826%29.png)

### Analisis program
pada bagian setter dan getter, diperlihatkan bagaimana atribut yang memiliki akses private tetap dapat diakses atau dimodifikasi melalui method khusus. Konsep ini merupakan bagian dari prinsip encapsulation dalam OOP yang bertujuan untuk melindungi data agar tidak dapat diubah secara langsung oleh class lain.

---

## 5. Constructor
Constructor merupakan method khusus yang akan dipanggil secara otomatis ketika sebuah objek dibuat. Constructor digunakan untuk menginisialisasi nilai awal dari atribut pada sebuah objek.

Jenis constructor yang umum digunakan antara lain:

- Default Constructor : constructor tanpa parameter.
- Parameterized Constructor : constructor yang menerima parameter.
- Constructor Overloading : penggunaan beberapa constructor dalam satu class dengan parameter yang berbeda.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_5`
2. Kemudian buat sebuah class baru dengan nama `Person` dan isikan kode berikut:

        public class Person {
        private String nama;
        private int umur;
        
            //default constuctor
            public Person(){
                nama = "unknow";
                umur = 0;
            }
        
            //parameter constuctor
            public Person(String nama,int umur){
                this.nama =  nama;
                this.umur = umur;
            }
        
            //method
            public void tampilkanInfo(){
                System.out.println("nama : " + nama);
                System.out.println("Umur : " + umur);
            }
        }

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

        public class Main {
        public static void main(String[]args){
        Person person1= new Person();
        Person person2= new Person("Budi" , 25);
        
                person1.tampilkanInfo();
                person2.tampilkanInfo();
            }
        }

4. Jalankan program untuk melihat hasilnya.

### Latihan
1. Buat class `Barang` dengan atribut `namaBarang` dan `harga`.
2. Buat `default constructor` dan `parameterized constructor`.

        public class Barang {
        private String namaBarang;
        private double harga;
        
            // Default Constructor (Tanpa parameter)
            public Barang() {
                this.namaBarang = "Belum diisi";
                this.harga = 0.0;
            }
        
            // Parameterized Constructor (Dengan parameter)
            public Barang(String nama, double harga) {
                this.namaBarang = nama;
                this.harga = harga;
            }
        
            // Method untuk menampilkan info barang
            public void tampilkanBarang() {
                System.out.println("Nama Barang: " + namaBarang);
                System.out.println("Harga      : Rp" + harga);
                System.out.println("-------------------------");
            }
        }

3. Buat object dari class `Barang` menggunakan kedua constructor tersebut.

        public class Main {
        public static void main(String[] args) {
        // Membuat object menggunakan Default Constructor
        Barang barang1 = new Barang();
        
                // Membuat object menggunakan Parameterized Constructor
                Barang barang2 = new Barang("Laptop Gaming", 15000000);
        
                // Menampilkan hasil
                System.out.println("--- Info Barang 1 ---");
                barang1.tampilkanBarang();
        
                System.out.println("--- Info Barang 2 ---");
                barang2.tampilkanBarang();
            }
        }

#### screenshoot hasil

### Analisis program
constructor merupakan method khusus yang akan dijalankan secara otomatis ketika sebuah object dibuat. Dengan adanya constructor, nilai awal atribut dapat langsung diinisialisasi saat objek dibuat. Praktikum ini juga memperlihatkan adanya beberapa jenis constructor seperti default constructor, parameterized constructor, dan constructor overloading.

---

## 6. Sistem Manajemen Perpustakaan Sederhana
Pada bagian ini dibuat sebuah program sederhana berbasis konsol yang menggabungkan berbagai konsep OOP yang telah dipelajari sebelumnya, seperti class, object, attribute, method, akses modifier, setter-getter, dan constructor. Program ini berfungsi sebagai sistem manajemen perpustakaan sederhana yang memungkinkan pengguna untuk menambahkan buku, menampilkan daftar buku, serta mencari buku berdasarkan judul.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_6`
2. Kemudian buat sebuah class baru dengan nama `Buku` dan isikan kode berikut:

        public class Buku {
        // Atribut (private)
        private String judul;
        private String pengarang;
        private int tahunTerbit;
        
            // Constructor (default)
            public Buku() {
                this.judul = "Unknown";
                this.pengarang = "Unknown";
                this.tahunTerbit = 0;
            }
        
            // Constructor (parameterized)
            public Buku(String judul, String pengarang, int tahunTerbit) {
                this.judul = judul;
                this.pengarang = pengarang;
                this.tahunTerbit = tahunTerbit;
            }
        
            // Setter dan Getter
            public void setJudul(String judul) {
                this.judul = judul;
            }
        
            public String getJudul() {
                return judul;
            }
        
            public void setPengarang(String pengarang) {
                this.pengarang = pengarang;
            }
        
            public String getPengarang() {
                return pengarang;
            }
        
            public void setTahunTerbit(int tahunTerbit) {
                this.tahunTerbit = tahunTerbit;
            }
        
            public int getTahunTerbit() {
                return tahunTerbit;
            }
        
            // Method untuk menampilkan informasi buku
            public void tampilkanInfo() {
                System.out.println("Judul: " + judul);
                System.out.println("Pengarang: " + pengarang);
                System.out.println("Tahun Terbit: " + tahunTerbit);
                System.out.println("------------------------------");
            }
        }

3. Kemudian buat sebuah class baru dengan nama `Perpustakaan` dan isikan kode berikut:

        import java.util.ArrayList;
        
        public class Perpustakaan {
        // Atribut (private)
        private ArrayList<Buku> daftarBuku;
        
            // Constructor
            public Perpustakaan() {
                daftarBuku = new ArrayList<>();
            }
        
            // Method untuk menambahkan buku
            public void tambahBuku(Buku buku) {
                daftarBuku.add(buku);
                System.out.println("Buku berhasil ditambahkan!");
            }
        
            // Method untuk menampilkan semua buku
            public void tampilkanSemuaBuku() {
                if (daftarBuku.isEmpty()) {
                    System.out.println("Tidak ada buku dalam perpustakaan.");
                } else {
                    System.out.println("Daftar Buku:");
                    for (Buku buku : daftarBuku) {
                        buku.tampilkanInfo();
                    }
                }
            }
        
            // Method untuk mencari buku berdasarkan judul
            public void cariBuku(String judul) {
                boolean ditemukan = false;
                for (Buku buku : daftarBuku) {
                    if (buku.getJudul().equalsIgnoreCase(judul)) {
                        System.out.println("Buku ditemukan:");
                        buku.tampilkanInfo();
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
                }
            }
        }

4. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

        import java.util.Scanner;
        
        public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pilihan;
        
                do {
                    // Menu
                    System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
                    System.out.println("1. Tambah Buku");
                    System.out.println("2. Tampilkan Semua Buku");
                    System.out.println("3. Cari Buku");
                    System.out.println("4. Keluar");
                    System.out.print("Pilih menu: ");
                    pilihan = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline
        
                    switch (pilihan) {
                        case 1:
                            // Tambah Buku
                            System.out.print("Masukkan judul buku: ");
                            String judul = scanner.nextLine();
                            System.out.print("Masukkan nama pengarang: ");
                            String pengarang = scanner.nextLine();
                            System.out.print("Masukkan tahun terbit: ");
                            int tahunTerbit = scanner.nextInt();
                            scanner.nextLine(); // Membersihkan newline
        
                            Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
                            perpustakaan.tambahBuku(bukuBaru);
                            break;
        
                        case 2:
                            // Tampilkan Semua Buku
                            perpustakaan.tampilkanSemuaBuku();
                            break;
        
                        case 3:
                            // Cari Buku
                            System.out.print("Masukkan judul buku yang dicari: ");
                            String judulCari = scanner.nextLine();
                            perpustakaan.cariBuku(judulCari);
                            break;
        
                        case 4:
                            // Keluar
                            System.out.println("Terima kasih telah menggunakan sistem ini!");
                            break;
        
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } while (pilihan != 4);
        
                scanner.close();
            }
        }

4. Jalankan program untuk melihat hasilnya.

### Penjelasan Program:
1. Class Buku

- Memiliki atribut judul, pengarang, dan tahunTerbit dengan akses private.
- Menggunakan constructor untuk menginisialisasi objek.
- Menyediakan method setter dan getter.
- Memiliki method tampilkanInfo() untuk menampilkan informasi buku.

2. Class Perpustakaan

- Menggunakan ArrayList untuk menyimpan data buku.
- Menyediakan method tambahBuku(), tampilkanSemuaBuku(), dan cariBuku().

3. Class Main

- Menyediakan menu interaktif bagi pengguna.
- Menggunakan Scanner untuk menerima input dari pengguna.
- Menghubungkan seluruh fitur dari class Buku dan Perpustakaan.
- Output Program

Program akan menampilkan menu yang memungkinkan pengguna untuk menambah buku, melihat daftar buku, dan mencari buku berdasarkan judul.
![64](https://hackmd.io/_uploads/rksRNZ0ske.png)

### analisis program
semua konsep yang telah dipelajari diterapkan dalam pembuatan program sistem manajemen perpustakaan sederhana. Program ini memungkinkan pengguna untuk menambahkan data buku, menampilkan daftar buku, serta mencari buku berdasarkan judul. Program ini menunjukkan bagaimana konsep OOP dapat digunakan untuk membangun sebuah aplikasi yang lebih terstruktur dan modular.

---

## Penutup
Melalui modul ini telah dipelajari berbagai konsep dasar dalam pemrograman berorientasi objek menggunakan Java. Materi yang dibahas meliputi pembuatan class dan object, penggunaan atribut dan method, penerapan akses modifier, penggunaan setter dan getter, serta penggunaan constructor.

Dengan memahami konsep-konsep tersebut, diharapkan mahasiswa dapat mengembangkan program Java yang lebih terstruktur, modular, dan mudah dikembangkan untuk aplikasi yang lebih kompleks di masa mendatang.