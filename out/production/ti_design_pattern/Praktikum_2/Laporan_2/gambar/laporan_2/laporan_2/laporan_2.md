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

![11](https://hackmd.io/_uploads/r1wfJWAiyg.png)

6. Selanjutnya, buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

![12](https://hackmd.io/_uploads/SJv71WRiJg.png)

7. Jalankan dan lihat hasilnya.

### Latihan
1. Buatlah class Buku dengan atribut judul dan pengarang.
2. Buat object dari class Buku dan isi nilai atributnya.
3. Tampilkan nilai atribut tersebut.

#### screenshoot

### Analisis program

Class berfungsi sebagai kerangka atau blueprint yang mendefinisikan atribut dan method yang dimiliki oleh suatu objek. Sementara itu, object merupakan instansiasi dari class tersebut. Dari percobaan yang dilakukan dengan membuat class Mahasiswa dan menjalankan class Main, dapat dilihat bahwa object dapat digunakan untuk menyimpan nilai atribut dan menjalankan method yang ada di dalam class.

---
## 2. Attribute dan Method
Attribute merupakan variabel yang dimiliki oleh sebuah class dan berfungsi untuk menyimpan data dari objek. Sedangkan method adalah fungsi yang terdapat di dalam class yang digunakan untuk mendefinisikan perilaku atau operasi yang dapat dilakukan oleh objek.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_2`
2. Kemudian buat sebuah class baru dengan nama `Kalkulator` dan isikan kode berikut:

![21](https://hackmd.io/_uploads/S1Ajl-CsJx.png)

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

![22](https://hackmd.io/_uploads/SJVnlb0oyx.png)

4. Jalankan program untuk melihat hasilnya.

### Latihan
1. Buat class `Lingkaran` dengan atribut `jariJari`.
2. Tambahkan method `hitungLuas()` yang mengembalikan nilai luas lingkaran.
3. Buat object dari class Lingkaran dan panggil method `hitungLuas()`.

#### screenshoot

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

![31](https://hackmd.io/_uploads/SkTsWZRsJg.png)

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

![32](https://hackmd.io/_uploads/Hywh-WAi1g.png)

4. Jalankan program untuk melihat hasilnya.

### Latihan
1. Membuat class AkunBank dengan atribut saldo yang memiliki akses private.
2. Menambahkan method tampilkanSaldo() dengan akses public.
3. Mencoba mengakses atribut saldo secara langsung dari luar class dan mengamati hasilnya.

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

![41](https://hackmd.io/_uploads/r1mBMZCjke.png)

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

![42](https://hackmd.io/_uploads/HJTBz-Asyg.png)

4. Jalankan program untuk melihat hasilnya.


### Latihan
1. Buat class Mahasiswa dengan atribut nama (private) dan nim (private).
2. Buat setter dan getter untuk kedua atribut tersebut.
3. Buat object dari class Mahasiswa dan gunakan setter untuk mengisi nilai atribut.

#### screenshoot

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

![51](https://hackmd.io/_uploads/S12hz-AsJe.png)

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

![52](https://hackmd.io/_uploads/BkBpf-Ao1l.png)

4. Jalankan program untuk melihat hasilnya.

### Latihan
1. Buat class `Barang` dengan atribut `namaBarang` dan `harga`.
2. Buat `default constructor` dan `parameterized constructor`.
3. Buat object dari class `Barang` menggunakan kedua constructor tersebut.

#### screenshoot

### Analisis program
constructor merupakan method khusus yang akan dijalankan secara otomatis ketika sebuah object dibuat. Dengan adanya constructor, nilai awal atribut dapat langsung diinisialisasi saat objek dibuat. Praktikum ini juga memperlihatkan adanya beberapa jenis constructor seperti default constructor, parameterized constructor, dan constructor overloading.

---

## 6. Sistem Manajemen Perpustakaan Sederhana
Pada bagian ini dibuat sebuah program sederhana berbasis konsol yang menggabungkan berbagai konsep OOP yang telah dipelajari sebelumnya, seperti class, object, attribute, method, akses modifier, setter-getter, dan constructor. Program ini berfungsi sebagai sistem manajemen perpustakaan sederhana yang memungkinkan pengguna untuk menambahkan buku, menampilkan daftar buku, serta mencari buku berdasarkan judul.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_2` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_6`
2. Kemudian buat sebuah class baru dengan nama `Buku` dan isikan kode berikut:

![61](https://hackmd.io/_uploads/Byb5QZCoyx.png)

3. Kemudian buat sebuah class baru dengan nama `Perpustakaan` dan isikan kode berikut:

![62](https://hackmd.io/_uploads/HJH2m-RoJe.png)

4. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

![63](https://hackmd.io/_uploads/ryqp7W0o1e.png)

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