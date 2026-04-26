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

![11](https://hackmd.io/_uploads/S1mfodA31x.png)

5. Buat class `Main` dan isikan kode berikut:

![12](https://hackmd.io/_uploads/B1bXo_RnJe.png)

6. Jalankan dan lihat hasilnya.

##### Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam `modul_1` dan beri nama `dengan_ocp`
2. Buat sebuah interface dengan nama `PaymentMethod` dan isikan kode berikut:

![21](https://hackmd.io/_uploads/HkB4sdChJx.png)

3. Buat sebuah class dengan nama `CreditCardPayment` dan isikan kode berikut:

![22](https://hackmd.io/_uploads/HkfBju0nJl.png)

4. Buat sebuah class dengan nama `EWalletPayment` dan isikan kode berikut:

![23](https://hackmd.io/_uploads/r1D8odAhJe.png)

5. Buat sebuah class dengan nama `PaymentProcessor` dan isikan kode berikut:

![24](https://hackmd.io/_uploads/H1_PsuChJl.png)

6. Buat sebuah class `Main` dan isikan kode berikut:

![25](https://hackmd.io/_uploads/S1Euj_Cnyl.png)

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

![21](https://hackmd.io/_uploads/Hk9ndFeJel.png)

4. Buat class `Main` dan isikan kode berikut:

![22](https://hackmd.io/_uploads/BJ9aOtg1xl.png)

5. Jalankan dan lihat hasilnya.

##### Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam `modul_2` dan beri nama `dengan_ocp`
2. Buat sebuah interface dengan nama `Discount` dan isikan kode berikut:

![23](https://hackmd.io/_uploads/HJvAdtxJll.png)

3. Buat sebuah class dengan nama `RegularDiscount` dan isikan kode berikut:

![24](https://hackmd.io/_uploads/ByVJtteJxg.png)

4. Buat sebuah class dengan nama `PremiumDiscount` dan isikan kode berikut:

![25](https://hackmd.io/_uploads/SyygYYxyex.png)

5. Buat sebuah class dengan nama `DiscountCalculator` dan isikan kode berikut:

![26](https://hackmd.io/_uploads/SJ_gKKx1xe.png)

6. Buat sebuah class `Main` dan isikan kode berikut:

![27](https://hackmd.io/_uploads/HyE-YKeJxx.png)

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

![31](https://hackmd.io/_uploads/SyzWitx1xl.png)

4. Buat class `Main` dan isikan kode berikut:

![32](https://hackmd.io/_uploads/HkCbote1gx.png)

5. Jalankan dan lihat hasilnya.

##### Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam `modul_3` dan beri nama `dengan_ocp`
2. Buat sebuah interface dengan nama `Notifier` dan isikan kode berikut:

![33](https://hackmd.io/_uploads/HJYQstl1gl.png)

3. Buat sebuah class dengan nama `EmailNotifier` dan isikan kode berikut:

![34](https://hackmd.io/_uploads/BktNstx1ge.png)

4. Buat sebuah class dengan nama `SMSNotifier` dan isikan kode berikut:

![35](https://hackmd.io/_uploads/r1srjtl1lg.png)

5. Buat sebuah class dengan nama `NotificationService` dan isikan kode berikut:

![36](https://hackmd.io/_uploads/HkCIjYxklx.png)

6. Buat sebuah class `Main` dan isikan kode berikut:

![37](https://hackmd.io/_uploads/r1KPsKe1gg.png)

7. Jalankan dan lihat hasilnya.

📌 Keuntungan setelah menerapkan OCP:
✅ Kode lebih modular → Bisa menambahkan jenis notifikasi baru tanpa mengubah `NotificationService`.
✅ Lebih mudah diuji → Tiap strategi notifikasi bisa diuji secara terpisah.

---
### Latihan : Sistem Pengelolaan Pajak
Program ini menghitung pajak berdasarkan jenis kendaraan (Mobil atau Motor). Saat ini, kode yang ada dibawah ini tidak mengikuti OCP, sehingga jika kita ingin menambahkan jenis kendaraan baru (misalnya Truk), kita harus mengubah metode `calculateTax()`. Kode yang melanggar aturan OCP adalah sebagai berikut:

Class `TaxCalculator`
![lat1](https://hackmd.io/_uploads/BkoRpuA2ke.png)

Class `Main`
![lat2](https://hackmd.io/_uploads/HJs1R_Ch1g.png)


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

3. Buat sebuah class dengan nama `TaxCalculator` dan isikan kode berikut:

4. Buat sebuah class dengan nama `CarTax` dan isikan kode berikut:

5. Buat sebuah class dengan nama `MotorcyleTax` dan isikan kode berikut:

6. Buat sebuah class `Main` untuk menguji kode tersebut

---
### Kesimpulan
Berdasarkan praktikum dan pembahasan yang telah dilakukan, dapat disimpulkan bahwa Open-Closed Principle (OCP) merupakan prinsip yang sangat penting dalam pengembangan perangkat lunak berbasis objek. Prinsip ini memungkinkan sebuah sistem untuk dikembangkan lebih lanjut tanpa harus mengubah kode yang sudah ada. Dengan menerapkan konsep seperti polimorfisme, interface, dan design pattern, kode menjadi lebih modular, fleksibel, serta mudah untuk dipelihara dan diuji. Selain itu, penerapan OCP juga membantu mengurangi risiko terjadinya bug ketika menambahkan fitur baru, karena perubahan tidak dilakukan pada kode lama yang sudah berjalan dengan baik.

### Penutup
Demikian laporan praktikum mengenai Open-Closed Principle (OCP) ini disusun. Diharapkan melalui praktikum ini, pemahaman mengenai pentingnya prinsip OCP dalam pengembangan perangkat lunak dapat semakin meningkat. Penulis menyadari bahwa laporan ini masih memiliki kekurangan, sehingga kritik dan saran yang membangun sangat diharapkan untuk perbaikan di masa mendatang. Semoga laporan ini dapat memberikan manfaat dan menjadi referensi dalam memahami konsep desain perangkat lunak yang baik dan benar.