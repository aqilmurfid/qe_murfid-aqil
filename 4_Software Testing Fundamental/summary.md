# Task 1

Nah disitu terdapat line coverage yang pertama bernilai 6/9 dengan presentasi 67% sedangkan line coverage yang kedua bernilai 6/6 dengan persentase 100%, lalu apa itu line coverage?<br>

**Line Coverage**: mengevaluasi pada seberapa banyak baris kode yang ditulis telah dilakukan testing.<br>
Dengan kata lain, berarti untuk baris pertama terdapat 9 pengujian baris kode dengan keberhasilan sebanyak 6 kali dan line coverage pertama telah dilakukan uji sebanyak 6 baris kode dengan keenam baris tersebut berhasil dijalankan.<br>
Selanjutnya,ada mutation coverage dengan yang pertama persentase 67% dan yang kedua 75%.Jadi,apa sih maksud dari keterangan tersebuat dan apa itu arti dari mutation coverage?<br>

**Mutation Coverage**:<p align ="justify">Mutation testing merupakan testing yang dilakukan terhadap suatu program dengan memodifikasi satu bagian kecil dari sebuah fungsi/method kode program. Mutation testing dilakukan untuk menentukan apakah test case sudah cukup atau belum. Pada mutation testing kita melakukan sedikit perubahan pada baris program, dimana perubahan biasanya dilakukan pada conditional statement. Program yang telah dimodifikasi tersebut dinamakan dengan ‘mutant’. Tanpa mengurangi rasa hormat kita kepada teman2nya yang berusaha memasukkan undang-undang mengenai mutant ke dalam sistem pemerintahan di USA, mutant yang telah diciptakan tadi harus dibunuh. Sebuah mutant dapat dibunuh (killable) jika mutant menghasilkan output yang berbeda daripada program aslinya. Jika tidak menghasilkan output yang berbeda maka mutant belum berhasil dibunuh. Persentase mutant yang terbunuh dibandingkan keseluruhan mutant yang diciptakan menjadi nilai dari usaha percobaan pembunuhan ini. Nilainya dinamakan dengan mutation score. Score ini bermakna:

- Jika mutation score = 100%, maka test case sudah cukup<br>
- Jika mutation score < 100%, maka test case belum cukup, test case perlu ditambah lagi hingga mutant yang not killable menjadi killable dan mutation score menjadi 100%<br>
Namun, hal ini tidak berlaku untuk equivalent mutant. Equivalent mutant merupakan mutant yang selalu menghasilkan output yang sama dengan output dari program aslinya sebanyak apa pun test case. Mutant ini tidak dapat digunakan atau mutant ini tidak perlu diperhitungkan.
  
<p align ="justify">Sebuah program dikatakan “baik” jika mutation score yang didapatkan bernilai 100%. Untuk mendapatkan mutasi score senilai 100%, maka langkah yang perlu kita lakukan adalah menambahkan test case untuk program tersebut. Jika test case tersebut terhitung mendapatkan nilai yang berbeda dari expected outcome, maka mutant tersebut dinyatakan terbunuh. Setelah semua mutant terbunuh, maka akan didapatkan mutation score senilai 100%.
  
# Task 2
Untuk task yang kedua ini saya mendapatkan kesimpulan bahwa itu merupakan proses mutation coverage dimana yang berwarna hijau adalah proses mutation yang berhasil dan yang berwarna merah menandakan mutation berhasil untuk survive
  
# Resume Materi
**Software Testing Fundamental**
Sebuah proses menganalisis item perangkat lunak untuk mendeteksi persamaan antara kondisi yang ada dan yang dibutuhkan (yaitu, cacat) dan untuk mengevaluasi fitur dari item perangkat lunak. *menurut standar ANSI / IEEE 1059*

 **Testing Platform**
 - API
 - Web
 - Mobile
 - Desktop
  
 **Software Testing Fundamental** <br>
  Functional Testing :
  - Manual
  - Automate
  - etc.
  
  Non functional Testing :
  - Performance Testing
  - etc.
  
  Maintencance :
  - Regression
  - etc.
