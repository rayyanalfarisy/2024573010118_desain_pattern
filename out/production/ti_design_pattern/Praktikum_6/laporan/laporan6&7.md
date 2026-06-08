# Laporan Modul 4: LSP dan Strategy Pattern
**Mata Kuliah:** Desain Pattern  
**Nama:** MUHAMMAD RAYYAN ALFARISY
**NIM:** 2024573010118
**Kelas:** TI 2A

---
## 1. Abstrak
Pada modul ini dipelajari penerapan prinsip Liskov Substitution Principle (LSP) yang merupakan salah satu prinsip dalam SOLID serta Strategy Pattern sebagai salah satu pola desain perilaku (behavioral design pattern). LSP menekankan bahwa objek dari kelas turunan harus dapat menggantikan objek dari kelas induknya tanpa mengubah perilaku program. Sementara itu, Strategy Pattern digunakan untuk memisahkan algoritma ke dalam kelas-kelas terpisah sehingga algoritma dapat dipilih dan diganti secara fleksibel saat program berjalan.

Melalui praktikum ini dilakukan identifikasi kode yang melanggar prinsip LSP, kemudian dilakukan proses refactoring agar kode menjadi lebih fleksibel, mudah dikembangkan, dan sesuai dengan prinsip desain perangkat lunak yang baik.

### Tujuan
1. Memahami konsep SOLID Principle dalam pengembangan perangkat lunak.
2. Memahami prinsip Liskov Substitution Principle (LSP).
3. Mengidentifikasi pelanggaran LSP pada kode program.
4. Melakukan refactoring kode agar sesuai dengan prinsip LSP.
5. Memahami konsep dan implementasi Strategy Pattern.
6. Mengimplementasikan Strategy Pattern dalam studi kasus pembayaran e-commerce.
7. Meningkatkan kualitas desain perangkat lunak agar lebih fleksibel dan mudah dipelihara.

---
#### Manfaat penerapan SOLID:

1.Membuat kode lebih mudah dipahami.
2. Memudahkan proses pengembangan dan pemeliharaan aplikasi.
3. Mengurangi ketergantungan antar kelas.
4. Memudahkan pengujian (testing).
5. Mempermudah pengembangan fitur baru.
6. Menghasilkan desain perangkat lunak yang lebih fleksibel dan scalable.
7. Mengurangi risiko munculnya bug ketika sistem dikembangkan.

#### Manfaat penerapan Strategy Pattern:
1. Meningkatkan fleksibilitas program karena algoritma dapat diganti tanpa mengubah kode utama.
2. Mengurangi penggunaan percabangan (if-else atau switch) yang berlebihan sehingga kode lebih bersih dan mudah dibaca.
3. Memudahkan penambahan fitur baru dengan membuat strategi baru tanpa memodifikasi kelas yang sudah ada.
4. Mendukung prinsip Open-Closed Principle (OCP) karena sistem terbuka untuk pengembangan tetapi tertutup untuk modifikasi.
5. Memisahkan logika algoritma dari kelas utama sehingga tanggung jawab setiap kelas menjadi lebih jelas.
6. Memudahkan proses pengujian (testing) karena setiap strategi dapat diuji secara terpisah.
7. Meningkatkan maintainability (kemudahan pemeliharaan) karena perubahan pada satu strategi tidak memengaruhi strategi lainnya.


## LSP dan Strategy Pattern
##### Penjelasan Prinsip LSP dan Strategy pattern
Liskov Substitution Principle (LSP) adalah prinsip ketiga dari SOLID yang diperkenalkan oleh Barbara Liskov. Prinsip ini menyatakan bahwa objek dari kelas turunan harus dapat menggantikan objek dari kelas induk tanpa mengubah kebenaran program.

Contohnya, jika terdapat kelas Rectangle dan kelas Square, maka penggunaan objek Square sebagai pengganti Rectangle tidak boleh menghasilkan perilaku yang berbeda dari yang diharapkan.

Strategy Pattern adalah pola desain perilaku yang memungkinkan suatu algoritma dipisahkan dari objek yang menggunakannya. Dengan pola ini, algoritma dapat dipilih dan diganti saat runtime tanpa mengubah kode utama aplikasi.

Strategy Pattern terdiri dari:

1. Strategy Interface
2. Concrete Strategy
3. Context Class

### Mengapa Lsp dan Strategy  Penting?
LSP penting karena:

1. Menjamin konsistensi perilaku antar kelas.
2. Mengurangi bug akibat pewarisan yang tidak tepat.
3. Membantu menghasilkan desain yang lebih stabil.

Strategy Pattern penting karena:

1. Mengurangi penggunaan banyak percabangan (if-else atau switch).
2. Memudahkan penambahan algoritma baru.
3. Mendukung prinsip Open-Closed Principle (OCP).
4. Membuat kode lebih modular dan mudah dipelihara.

---

### Kapan dan Bagaimana Menerapkannya?
LSP diterapkan ketika menggunakan konsep pewarisan (inheritance). Sebelum membuat kelas turunan, pastikan seluruh perilaku kelas induk masih tetap valid ketika objek digantikan oleh objek turunan.

Strategy Pattern diterapkan ketika terdapat beberapa algoritma atau proses yang memiliki tujuan sama tetapi implementasi berbeda, misalnya:

1. Metode pembayaran.
2. Algoritma pengurutan.
3. Kompresi data.
4. Pengiriman notifikasi.

---
### Praktikum LSP

#### bagian 1 : 
##### Kode yang melanggar aturan lsp
Buat sebuah package baru di dalam modul_6 dan beri nama praktikum_1
Buat sebuah package baru di dalam praktikum_1 dan beri nama tanpa_lsp
Buat class baru di dalam tanpa_lsp dengan nama Rectangle dan isikan kode seperti berikut:

![img.png](gambar/img.png)

Buat class Square dan isikan kode berikut:
![img.png](img.png)
Buat class Main dan isikan kode berikut:
![img_2.png](gambar/img_2.png)
Jalankan dan lihat hasilnya.
![img_1.png](img_1.png)
##### Refactor kode di atas untuk mematuhi aturan LSP
Buat sebuah package baru di dalam praktikum_1 dan beri nama dengan_lsp
Buat sebuah interface dengan nama Shape dan isikan kode berikut:
![img_2.png](img_2.png)
Buat sebuah class dengan nama Rectangle dan isikan kode berikut:
![img_3.png](img_3.png)
Buat sebuah class dengan nama Square dan isikan kode berikut:
![img_4.png](img_4.png)
Buat sebuah class Main dan isikan kode berikut:
![img_5.png](img_5.png)
Jalankan dan lihat hasilnya.
![img_6.png](img_6.png)
---
#### bagian 2 : 
##### Kode yang melanggar aturan LSP
Buat sebuah package baru di dalam modul_6 dan beri nama praktikum_2
Buat sebuah package baru di dalam praktikum_2 dan beri nama tanpa_lsp
Buat class baru di dalam tanpa_lsp dengan nama SocialMediaPost dan isikan kode seperti berikut:
![img_7.png](img_7.png)

Buat class TwitterPost dan isikan kode berikut:
![img_8.png](img_8.png)
Buat class BlogPost dan isikan kode berikut:
![img_9.png](img_9.png)
Buat class Main dan isikan kode berikut:
![img_10.png](img_10.png)
![img_11.png](img_11.png)
Jalankan dan lihat hasilnya.
![img_12.png](img_12.png)
##### Refactor kode di atas untuk mematuhi aturan LSP
Buat sebuah package baru di dalam praktikum_2 dan beri nama dengan_lsp
Buat sebuah interface dengan nama Publishable dan isikan kode berikut:
![img_13.png](img_13.png)
Buat sebuah class dengan nama SocialPost dan isikan kode berikut:
![img_14.png](img_14.png)
Buat sebuah class dengan nama TwitterPost dan isikan kode berikut:
![img_15.png](img_15.png)
Buat sebuah class dengan nama BlogPost dan isikan kode berikut:
![img_16.png](img_16.png)
![img_17.png](img_17.png)
Buat sebuah class Main dan isikan kode berikut:
![img_18.png](img_18.png)
![img_19.png](img_19.png)
Jalankan dan lihat hasilnya.

---

#### Bagian 3 : LSP
##### Kode yang melanggar aturan OCP

##### Refactor kode di atas untuk mematuhi aturan LSP
---
### Latihan : 

---

### Praktikum Strategy pattern

#### bagian 1 :
##### Kode 
##### Kode
##### Kode
##### Kode
##### Kode
##### Kode

---
#### bagian 2 :
#### bagian 1 :
##### Kode
##### Kode
##### Kode
##### Kode
##### Kode
##### Kode
---

#### Bagian 3 : LSP
#### bagian 1 :
##### Kode
##### Kode
##### Kode
##### Kode
##### Kode

### Latihan :
##### Kode
##### Kode
##### Kode
##### Kode
##### Kode
##### Kode

### Kesimpulan

### Penutup
