**Resume**
- Array
<p align ="justify">Salah satu struktur data yang sering digunakan dalam pemrograman adalah Array.Array merupakan struktur data yang digunakan untuk menyimpan sekumpulan data dalam satu tempat.Setiap data dalam Array memiliki indeks, sehingga kita akan mudah memprosesnya.Indeks array selalu dimulai dari angka nol (0).Pada teori struktur data ukuran array akan bergantung dari banyaknya data yang ditampung di dalamnya.
  
- Arraylist
<p align ="justify"> Untuk menyimpan data dalam Array, maka harus mendeklarasikan jumlah elemen maksimalnya. Sehingga penggunaan Array tidak digunakan jika jumlah datanya fleksibel. Sedangkan ArrayList dapat menampung sejumlah data secara dinamis.Deklarasi ArrayList : List<TIPE_DATA> namaArrayList = new ArrayList<>();.Untuk mengetahui jumlah data yang terdapat dalam suatu ArrayList dapat menggunakan method size().
        
        List listProgram = new ArrayList<>();
        listProgram.add("Java");
        listProgram.add("PHP");
        listProgram.add("Web Design");
        
        System.out.println("Jumlah Data "+listProgram.size());
  
<p align ="justify"> listProgram.add("Java"); digunakan untuk memasukkan value kedalam ArrayList. Kemudian bagaimana jika kita ingin menghapus isi dari ArrayList tersebut. Perhatikan contoh berikut 
Untuk melakukan penghapusan salah satu dari value di ArrayList gunakan method remove(Object o) atau remove(int index).
  
        listProgram.remove("Java");
    atau
        listProgram.remove(0);
  
<p align ="justify"> Kedua cara diatas dapat kalian gunakan untuk melakukan remove atau menghapus salah satu dari value ArrayList.Method remove(Object o) akan menghapus value ArrayList berdasarkan object. Sedangkan remove(int index) akan menghapus value ArrayList berdasarkan urutan index dalam ArrayList tersebut.Untuk menghapus seluruh value yang terdapat pada ArrayList dapat menggunakan method clear().
         
        listProgram.clear();
- HashMap
 <p align ="justify">Class HashMap merupakan class turunan dari class AbstractMap dan implementasi dari interface Map.HashMap adalah sebuah class yang berisi sekumpulan pasangan nilai (value) dan kunci (key).Nilai bisa dalam bentuk string, integer, boolean, float, double, dan objek. Sedangkan untuk key biasanya dalam bentuk string dan integer.HashMap bisa dibilang seperti Array asosiatif dalam Java.<br>
(https://user-images.githubusercontent.com/81450117/158132971-e3324e1d-438c-4dfc-9a33-c8efac4b2c5a.png)
<br>Cara Membuat HashMap
<br>Sebelum bisa menggunakan HashMap, kita harus mengimpornya terlebih dahulu:

        import java.util.HashMap;
   
<p align ="justify">Setelah itu baru kita bisa menggunakannya.
Nah!, untuk menggunakan HashMap, kita harus membuat objeknya terlebih dahulu. Objek dari Hashmap dapat dibuat dengan kata kunci new.
Namun, ada sedikit tambahan untuk menentukan tipe data untuk key dan value yang akan disimpan.<br>
   ![image](https://user-images.githubusercontent.com/81450117/158142438-00a8f677-7ac3-4fe5-ad2d-fa21717984e0.png)
   
        HashMap<Integer, String> days = new HashMap<Integer,String>
 Mengisi Nilai ke HashMap
 <br>Tadi kita sudah membuat objek hashmap bernama days dengan tipe data:

K (key): Integer
 <br>V (value): String
Untuk mengisi nilai ke objek days, kita dapat menggunakan method put seperti ini:
 <br>days.put(1, "Minggu");
 <br>days.put(2, "Senin");
 <br>days.put(3, "Selasa");
 <br>days.put(4, "Rabu");
 <br>days.put(5, "Kamis");
 <br>days.put(6, "Jum'at");
 <br>days.put(7, "Sabtu");

   Akhir Kata
  <br> Hashmap kadang nanti akan banyak digunakan dalam pembuatan aplikasi. Karena itu, kamu harus memahaminya.

  
  https://docs.google.com/document/d/1D-oBdIsF3YWvVNnl9yyoJ6egWokAgFbW5WQihiFO-Ss/edit?usp=sharing
