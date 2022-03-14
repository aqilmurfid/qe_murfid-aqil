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
 <p align ="justify">Class HashMap merupakan class turunan dari class AbstractMap dan implementasi dari interface Map.HashMap adalah sebuah class yang berisi sekumpulan pasangan nilai (value) dan kunci (key).Nilai bisa dalam bentuk string, integer, boolean, float, double, dan objek. Sedangkan untuk key biasanya dalam bentuk string dan integer.HashMap bisa dibilang seperti Array asosiatif dalam Java.
![image](https://user-images.githubusercontent.com/81450117/158132971-e3324e1d-438c-4dfc-9a33-c8efac4b2c5a.png)

