# Laporan Modul 2: Review konsep Dasar OOP Menggunakan Java
**Mata Kuliah:** Desain Pattern  
**Nama:** MUHAMMAD RAYYAN ALFARISY
**NIM:** 2024573010118
**Kelas:** TI 2A

---

## 1. Abstrak

Pemrograman Berorientasi Objek atau Object-Oriented Programming (OOP) merupakan paradigma pemrograman yang berfokus pada penggunaan objek sebagai representasi dari data dan perilaku dalam sebuah program. Konsep ini bertujuan untuk meningkatkan struktur, modularitas, serta kemudahan dalam pengembangan dan pemeliharaan perangkat lunak.

Pada praktikum ini dilakukan peninjauan kembali terhadap empat pilar utama OOP yaitu Encapsulation, Inheritance, Polymorphism, dan Abstraction menggunakan bahasa pemrograman Java. Selain itu juga dipelajari konsep dasar seperti Class dan Object serta konsep Composition yang sering digunakan dalam pengembangan perangkat lunak berorientasi objek.

Melalui serangkaian latihan dan implementasi program sederhana, mahasiswa diharapkan dapat memahami cara kerja konsep-konsep OOP serta mampu menerapkannya dalam pembuatan program berbasis Java.
---
## Review 4 Pillar OOP Menggunakan Java
### Tujuan
Tujuan dari praktikum ini adalah:

Memahami konsep dasar dalam pemrograman berorientasi objek seperti Class, Object, Encapsulation, Inheritance, Polymorphism, dan Abstraction.
Mampu membuat program sederhana menggunakan pendekatan OOP dengan bahasa pemrograman Java.
Menerapkan prinsip-prinsip OOP dalam menyelesaikan permasalahan pemrograman secara terstruktur.


## Bagian 1 - Pengenalan OOP dan Class-Object
Object-Oriented Programming (OOP) merupakan paradigma pemrograman yang menggunakan objek sebagai komponen utama dalam membangun sebuah program. Objek tersebut merepresentasikan data serta fungsi yang dapat digunakan untuk memproses data tersebut.

Dalam OOP terdapat beberapa konsep dasar, yaitu:

Class
Class merupakan blueprint atau template yang digunakan untuk membuat objek. Class mendefinisikan atribut serta metode yang dimiliki oleh objek.

Object
Object adalah instansi dari sebuah class. Object memiliki nilai atribut tertentu serta dapat menjalankan metode yang telah didefinisikan di dalam class.

### Langkah Praktikum
1. Buka project pada praktikum sebelumnya menggunakan intellij IDEA
2. Buat sebuah package baru di dalam folder `src` dengan cara klik kanan pada folder `src` kemudian pilih `New -> Package`. Beri nama `modul_3`.
3. Buat Sebuah package baru lagi didalam package `modul_3` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_1`
4. Kemudian buat sebuah class baru dengan nama `Mahasiswa` dan isikan kode berikut:

#### Screenshoot
![11](https://hackmd.io/_uploads/B1Chr2Q2yl.png)

6. Selanjutnya, buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### Screenshoot
![12](https://hackmd.io/_uploads/rJKarhQnyl.png)

7. Jalankan dan lihat hasilnya.

### Latihan
1. Buat class Buku dengan atribut judul, penulis, dan tahunTerbit.
2. Buat objek dari class Buku dan tampilkan informasi buku ke layar.

#### Screenshoot

---
## Bagian 2 - Encapsulation (Enkapsulasi)
Encapsulation merupakan konsep dalam OOP yang digunakan untuk menyembunyikan detail internal suatu objek agar tidak dapat diakses secara langsung dari luar class. Tujuan dari enkapsulasi adalah untuk menjaga keamanan data serta mengontrol akses terhadap atribut dalam class.

Dalam Java, enkapsulasi biasanya diterapkan dengan cara:

Menggunakan access modifier seperti private, protected, dan public.
Menggunakan getter dan setter untuk mengakses dan mengubah nilai atribut.
### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_3` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_2`
2. Kemudian buat sebuah class baru dengan nama `Mahasiswa` dan isikan kode berikut:

#### screenshoot
![21](https://hackmd.io/_uploads/H1LMw2X2Jl.png)

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![22](https://hackmd.io/_uploads/SyLXPh73kx.png)

4. Jalankan program untuk melihat hasilnya.

### Latihan
1. Buat class Motor dengan atribut merk dan tahun yang dienkapsulasi/bersifat private.
2. Buat getter dan setter untuk mengakses atribut .

#### screenshoot

---

## Bagian 3 - Inheritance (Pewarisan) dan Composition (Komposisi)
Dalam pemrograman berorientasi objek, hubungan antar class dapat dibangun menggunakan konsep Inheritance maupun Composition. Kedua konsep ini digunakan untuk meningkatkan penggunaan kembali kode serta membuat program lebih modular.
#### Inheritance (Pewarisan)
Inheritance merupakan mekanisme di mana sebuah class dapat mewarisi atribut dan metode dari class lain. Class yang mewarisi disebut subclass, sedangkan class yang diwarisi disebut superclass.

Inheritance menggambarkan hubungan "is-a", contohnya Mobil adalah Kendaraan.
##### Ciri-Ciri Inheritance:
- Menggunakan keyword extends.
- Subclass mewarisi atribut dan metode dari superclass.
- Subclass dapat menambahkan metode baru atau mengganti metode yang sudah ada.

### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_3` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_3`
2. Buat package baru di dalam `bagian_3` dan beri nama `pewarisan`
3. Kemudian buat sebuah class baru dengan nama `Kendaraan` dan isikan kode berikut:

#### screenshoot
![31](https://hackmd.io/_uploads/BykUuhmnkg.png)

4. Kemudian buat sebuah class baru dengan nama `Mobil` dan isikan kode berikut:

#### screenshoot
![32](https://hackmd.io/_uploads/HyA8dhQ21x.png)

5. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![33](https://hackmd.io/_uploads/HJGYuhm2kg.png)

6. Jalankan program dan lihat hasilnya.

#### Composition (Komposisi)
Composition merupakan konsep di mana sebuah class memiliki objek dari class lain sebagai bagian dari strukturnya. Hubungan ini dikenal sebagai hubungan "has-a".

Sebagai contoh, sebuah Mobil memiliki Mesin.
##### Karakteristik Composition:
- Menggunakan objek dari class lain sebagai atribut.
- Tidak menggunakan keyword khusus.
- Lebih fleksibel dibandingkan inheritance karena tidak bergantung pada hierarki class.

### Langkah Praktikum
1. Buat package baru di dalam `bagian_3` dan beri nama `komposisi`
2. Kemudian buat sebuah class baru dengan nama `Mesin` dan isikan kode berikut:

#### screenshoot
![34](https://hackmd.io/_uploads/S1E1P6mhJx.png)

#### screenshoot
3. Kemudian buat sebuah class baru dengan nama `Mobil` dan isikan kode berikut:

#### screenshoot
![35](https://hackmd.io/_uploads/B1Hxv6mhyg.png)

4. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![36](https://hackmd.io/_uploads/BkV-P673Jl.png)

5. Jalankan program dan lihat hasilnya.

#### Perbandingan Inheritance dan Composition
## Perbandingan Inheritance dan Composition
Inheritance dan Composition merupakan dua konsep penting dalam pemrograman berorientasi objek yang digunakan untuk membangun hubungan antar class. Inheritance adalah mekanisme di mana sebuah class dapat mewarisi atribut dan metode dari class lain. Konsep ini menggambarkan hubungan “is-a” atau hubungan hierarki, di mana suatu objek merupakan jenis dari objek lain. Contohnya adalah hubungan antara class Mobil dan Kendaraan, di mana Mobil merupakan bagian dari jenis Kendaraan. Dalam Java, inheritance diimplementasikan menggunakan keyword extends, sehingga class turunan dapat menggunakan kembali atribut dan metode dari class induk.

Sementara itu, Composition adalah konsep di mana sebuah class memiliki objek dari class lain sebagai bagian dari strukturnya. Konsep ini menggambarkan hubungan “has-a” atau hubungan kepemilikan. Sebagai contoh, sebuah Mobil memiliki komponen seperti Mesin, Roda, dan Bahan Bakar. Dalam composition tidak ada keyword khusus yang digunakan, melainkan hanya dengan membuat objek dari class lain sebagai atribut dalam class tersebut. Pendekatan ini dianggap lebih fleksibel karena tidak terikat pada struktur hierarki class dan memungkinkan penggunaan kembali komponen secara lebih bebas.

Secara umum, inheritance memiliki tingkat ketergantungan yang lebih kuat antara superclass dan subclass, sehingga perubahan pada class induk dapat mempengaruhi class turunannya. Sebaliknya, composition memiliki tingkat ketergantungan yang lebih rendah karena class hanya menggunakan objek dari class lain tanpa harus berada dalam hubungan hierarki. Oleh karena itu, composition sering dianggap lebih fleksibel dan lebih mudah untuk dikembangkan dalam sistem yang kompleks.

#### Kapan Menggunakan Inheritance vs Composition?
Penggunaan inheritance sebaiknya dilakukan ketika terdapat hubungan yang jelas antara dua class dalam bentuk “is-a”. Artinya, class turunan benar-benar merupakan jenis dari class induk. Inheritance juga cocok digunakan ketika ingin mewarisi seluruh atribut dan metode dari class induk sehingga kode dapat digunakan kembali secara langsung. Selain itu, inheritance juga berguna ketika ingin melakukan method overriding untuk mengubah perilaku method yang diwarisi dari superclass.

Di sisi lain, composition sebaiknya digunakan ketika hubungan antara class bersifat “has-a” atau kepemilikan. Composition cocok digunakan ketika sebuah class dibangun dari beberapa komponen yang berasal dari class lain. Pendekatan ini juga lebih disarankan ketika ingin mengurangi ketergantungan antar class sehingga program menjadi lebih fleksibel dan mudah dikembangkan. Dalam banyak kasus pengembangan perangkat lunak modern, composition lebih sering digunakan karena memungkinkan penggabungan berbagai objek untuk membentuk sistem yang lebih kompleks tanpa harus bergantung pada struktur pewarisan.

### Langkah Praktikum
1. Di dalam package `bagian_3`, buat sebuah class baru dan beri nama `Main` dan isikan kode berikut:

#### screenshoot
![37](https://hackmd.io/_uploads/Hkj_OpQhJl.png)

2. Jalankan dan lihat hasilnya.

### Latihan
1. Buat class `Laptop` yang memiliki komponen Processor dan RAM (gunakan composition).
2. Buat class `Processor` dengan metode `jalankan()`.
3. Buat class `RAM` dengan metode `baca()` dan `tulis()`.
4. Implementasikan class `Laptop` yang menggunakan objek `Processor` dan `RAM`.

#### screenshoot
---
## Bagian 4 - Polymorphism (Polimorfisme)
Polymorphism merupakan kemampuan sebuah objek untuk memiliki berbagai bentuk perilaku. Dalam Java, polymorphism dapat diterapkan melalui method overriding dan method overloading.
#### Method Overriding
Method overriding terjadi ketika subclass memberikan implementasi baru terhadap method yang telah didefinisikan di superclass.
##### Ciri-ciri overriding antara lain:

- Nama method harus sama dengan method di superclass.
- Parameter method harus sama.
- Return type harus sama atau turunan dari return type superclass..

### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_3` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_4`
2. Kemudian buat sebuah package baru di dalam `bagian_4` dan beri nama `overriding`
3. Kemudian buat sebuah class baru dengan nama `Hewan` dan isikan kode berikut:

#### screenshoot
![41](https://hackmd.io/_uploads/rJJWs2mnkg.png)

4. Kemudian buat sebuah class baru dengan nama `Kucing` dan isikan kode berikut:

#### screenshoot
![42](https://hackmd.io/_uploads/SyOZj3m2ye.png)

5. Kemudian buat sebuah class baru dengan nama `Anjing` dan isikan kode berikut:

#### screenshoot
![43](https://hackmd.io/_uploads/rkjzj3Xhyg.png)

6. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![44](https://hackmd.io/_uploads/S1OQo2XhJg.png)

7. Jalankan program untuk melihat hasilnya.

#### Method Overloading
Method overloading terjadi ketika sebuah class memiliki beberapa method dengan nama yang sama namun parameter yang berbeda.
##### Aturan Method Overloading:
- Method harus memiliki nama yang sama.
- Parameter harus berbeda (jumlah atau tipe).
- Return type bisa sama atau berbeda (tidak mempengaruhi overloading).
- Access modifier bisa sama atau berbeda.

### Langkah Praktikum
1. Buat sebuah package baru di dalam `bagian_4` dan beri nama `overloading`
2. Kemudian buat sebuah class baru dengan nama `Kalkulator` dan isikan kode berikut:

#### screenshoot
![45](https://hackmd.io/_uploads/rJCbnnmh1l.png)

3. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![46](https://hackmd.io/_uploads/r1dz2nX31e.png)

4. Jalankan program untuk melihat hasilnya.

##### Perbandingan Overriding dan Overloading
| Aspek       | Overriding                                      | Overloading                                      |
|------------|--------------------------------|--------------------------------|
| Definisi   | Mengganti implementasi method di subclass | Membuat method dengan nama sama tetapi parameter berbeda |
| Parameter  | Harus sama | Harus berbeda |
| Return Type | Harus sama atau subtype | Bisa berbeda |
| Class      | Terjadi antara superclass dan subclass | Terjadi dalam satu class |
| Tujuan     | Mengubah perilaku method yang diwarisi | Memberikan fleksibilitas dalam pemanggilan method |
| Keyword    | `@Override` (opsional) | Tidak ada keyword khusus |

### Latihan
##### Latihan 1: Overriding
1. Buat class BangunDatar dengan method hitungLuas().
2. Buat subclass Persegi dan Lingkaran yang meng-override method hitungLuas().
3. Implementasikan method hitungLuas() di masing-masing subclass.

#### screenshoot

##### Latihan 2: Overloading
1. Buat class Matematika dengan method tambah() yang dapat menerima 2 atau 3 parameter bertipe int.
2. Tambahkan method tambah() yang menerima 2 parameter bertipe double.

#### screenshoot
---

## Bagian 5 - Abstraction (Abstraksi) | Abstract Class dan Interface
Abstraction merupakan konsep dalam OOP yang digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan fungsi yang penting bagi pengguna.

Dalam Java, abstraction dapat diterapkan menggunakan:

- Abstract Class
- Interface
#### Abstract Class
Abstract class adalah class yang tidak dapat dibuat objeknya secara langsung. Class ini biasanya digunakan sebagai dasar bagi class lain yang memiliki karakteristik serupa.
##### Ciri-Ciri Abstract Class:
- Dideklarasikan dengan keyword abstract.
- Dapat memiliki atribut, method konkret, dan method abstrak.
- Method abstrak tidak memiliki body (hanya deklarasi).
- Subclass yang mewarisi abstract class harus mengimplementasikan semua method abstrak (kecuali subclass tersebut juga abstract).

### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_3` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_5`
2. Buat sebuah package baru di dalam `bagian_5` dan beri nama `abstrak`.
3. Kemudian buat sebuah class baru di dalam `abtrak` dengan nama `Hewan` dan isikan kode berikut:

#### screenshoot
![51](https://hackmd.io/_uploads/H1OM-pX2kg.png)

4. Kemudian buat sebuah class baru di dalam `abtrak` dengan nama `Kucing` dan isikan kode berikut:

#### screenshoot
![52](https://hackmd.io/_uploads/Hkv7bp7h1e.png)

5. Kemudian buat sebuah class baru di dalam `abtrak` dengan nama `Anjing` dan isikan kode berikut:

#### screenshoot
![53](https://hackmd.io/_uploads/BkmNWpmnJx.png)

6. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![54](https://hackmd.io/_uploads/HJ3VW6Xn1e.png)

7. Jalankan program untuk melihat hasilnya.

#### Interface
Interface merupakan blueprint yang berisi kumpulan method yang harus diimplementasikan oleh class yang menggunakannya.
##### Ciri-Ciri Interface:
- Semua method bersifat abstract secara default.
- Sebuah class dapat mengimplementasikan lebih dari satu interface.
- Digunakan untuk mendefinisikan kemampuan tertentu.
### Langkah Praktikum
1. Buat sebuah package baru di dalam `bagian_5` dan beri nama `antarmuka`.
2. Kemudian buat sebuah interface baru di dalam `antarmuka` dengan nama `Bergerak` dan isikan kode berikut:

#### screenshoot
![55](https://hackmd.io/_uploads/SyUQGTQnJx.png)

3. Kemudian buat sebuah class baru di dalam `antarmuka` dengan nama `Mobil` dan isikan kode berikut:

#### screenshoot
![56](https://hackmd.io/_uploads/BJXSM6Xnyg.png)

4. Kemudian buat sebuah class baru di dalam `antarmuka` dengan nama `Pesawat` dan isikan kode berikut:

#### screenshoot
![57](https://hackmd.io/_uploads/rJAHfp721g.png)

5. Kemudian buat sebuah class baru dengan nama `Main` dan isikan kode berikut:

#### screenshoot
![58](https://hackmd.io/_uploads/BkxwGTXnkg.png)

6. Jalankan program untuk melihat hasilnya.

#### Perbandingan Abstract Class dan Interface
| Aspek       | Abstract Class                                  | Interface                                      |
|------------|---------------------------------|--------------------------------|
| Keyword    | `abstract class` | `interface` |
| Method     | Bisa memiliki method abstrak dan konkret | Sebelum Java 8: hanya method abstrak.<br>Java 8+: bisa memiliki method default dan static. |
| Atribut    | Bisa memiliki atribut non-static | Hanya bisa memiliki konstanta (`public static final`) |
| Constructor | Bisa memiliki constructor | Tidak bisa memiliki constructor |
| Inheritance | Subclass hanya bisa mewarisi satu abstract class | Class bisa mengimplementasikan banyak interface |
| Penggunaan | Cocok untuk class-class yang memiliki hubungan "is-a" (misalnya, Kucing adalah Hewan) | Cocok untuk mendefinisikan kontrak atau kemampuan (misalnya, Bergerak, Terbang) |

#### Kapan Menggunakan Abstract Class dan Interface
###### Gunakan Abstract Class Jika:
- Anda ingin membuat blueprint untuk class-class yang memiliki perilaku dan atribut yang sama.
- Anda ingin memiliki method konkret yang dapat diwarisi oleh subclass.
- Anda ingin mengontrol state objek melalui atribut non-static.

###### Gunakan Interface Jika:
- Anda ingin mendefinisikan kontrak atau kemampuan yang harus diimplementasikan oleh class-class yang berbeda.
- Anda ingin mendukung multiple inheritance (sebuah class bisa mengimplementasikan banyak interface).
- Anda ingin menambahkan fungsionalitas tambahan ke class tanpa mengubah struktur class tersebut (menggunakan method default di Java 8+).

Dalam Sebuah program, kita juga dapat mengkombinasikan abstract class dengan interface.

### Langkah Praktikum
1. Didalam package `bagian_5`, buatlah sebuah class baru dan beri nama `Main` dan isikan kode berikut:

#### screenshoot
![59](https://hackmd.io/_uploads/S1sMN67nJl.png)

2. Jalankan program untuk melihat hasilnya.

### Latihan
1. Buat sebuah interface `Berenang` dengan method `berenang()`.
2. Buat abstract class `HewanAir` dengan atribut `nama` dan method abstrak `makan()`.
3. Buat class `Ikan` yang mewarisi `HewanAir` dan mengimplementasikan `Berenang`.
4. Implementasikan method `berenang()` dan `makan()` di class `Ikan`.

#### screenshoot
---

## Bagian 6 - Aplikasi Console Pemesanan Tiket Sederhana
Pada bagian ini dibuat sebuah aplikasi sederhana berbasis console untuk melakukan pemesanan tiket konferensi. Aplikasi ini mengimplementasikan seluruh konsep utama OOP yang telah dipelajari sebelumnya.

Fitur yang tersedia dalam aplikasi ini meliputi:

1. Menampilkan daftar tiket yang tersedia.
2. Memesan tiket sesuai jenis dan jumlah yang diinginkan.
3. Menampilkan detail pesanan berdasarkan nomor pesanan.
4. Membatalkan pesanan yang telah dibuat.
5. Menghitung total harga tiket yang dipesan.
6. Memberikan diskon berdasarkan jenis tiket.

Dalam aplikasi ini beberapa konsep OOP diterapkan, antara lain:

Encapsulation pada atribut class Tiket.
Inheritance pada class TiketReguler dan TiketVIP yang mewarisi class Tiket.
Polymorphism pada method hitungDiskon() yang dioverride oleh subclass.
Abstraction dengan menjadikan class Tiket sebagai abstract class.

### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package `modul_3` dengan cara klik kanan dan pilih `New -> Package`. Beri nama `bagian_6`
2. Kemudian buat sebuah class baru dengan nama `Tiket` dan isikan kode berikut:

![61](https://hackmd.io/_uploads/H1zIhTmhkl.png)

3. Kemudian buat sebuah class baru dengan nama `TiketReguler` dan isikan kode berikut:

![62](https://hackmd.io/_uploads/r12L2a7nke.png)

4. Kemudian buat sebuah class baru dengan nama `TiketVIP` dan isikan kode berikut:

![63](https://hackmd.io/_uploads/BJLw36Q3ye.png)

5. Kemudian buat sebuah class baru dengan nama `Pesanan` dan isikan kode berikut:

![64](https://hackmd.io/_uploads/B1Z_nTmhke.png)

6. Kemudian buat sebuah class baru dengan nama `KonferensiApp` dan isikan kode berikut:

![65](https://hackmd.io/_uploads/HyQpnTmhkl.png)

#### Fitur Apliaksi:
1. Lihat Daftar Tiket: Menampilkan jenis tiket dan harganya.
2. Pesan Tiket: Memungkinkan pengguna memesan tiket dengan memilih jenis dan jumlah.
3. Lihat Detail Pesanan: Menampilkan detail pesanan berdasarkan nomor pesanan.
4. Batalkan Pesanan: Menghapus pesanan berdasarkan nomor pesanan.
5. Hitung Total Harga: Menghitung total harga setelah diskon (jika ada).

#### Penjelasan Program:
1. Encapsulation: Atribut seperti `jenis` dan `harga` dienkapsulasi dalam class Tiket.
2. Inheritance: `TiketReguler` dan `TiketVIP` mewarisi class Tiket.
3. Polymorphism: Method `hitungDiskon()` di-override di subclass.
4. Abstraction: Class `Tiket` adalah abstract class dengan method abstrak `hitungDiskon()`.

### Output Program:

![66](https://hackmd.io/_uploads/r1dZpT7hJx.png)


---

## Penutup
Berdasarkan praktikum yang telah dilakukan, dapat disimpulkan bahwa pemrograman berorientasi objek merupakan metode pemrograman yang sangat penting dalam pengembangan perangkat lunak modern. Dengan menggunakan konsep OOP, program dapat disusun secara lebih terstruktur, modular, serta mudah untuk dikembangkan.

Dalam praktikum ini telah dipelajari berbagai konsep utama OOP yaitu Class dan Object, Encapsulation, Inheritance, Polymorphism, Abstraction, serta Composition. Setiap konsep memiliki peran penting dalam membangun sistem perangkat lunak yang fleksibel dan mudah dipelihara.

Melalui latihan dan implementasi program menggunakan bahasa pemrograman Java, mahasiswa dapat memahami bagaimana konsep-konsep tersebut diterapkan secara nyata dalam pembuatan aplikasi. Dengan penguasaan konsep OOP yang baik, diharapkan mahasiswa mampu mengembangkan program yang lebih kompleks dan efisien di masa mendatang.