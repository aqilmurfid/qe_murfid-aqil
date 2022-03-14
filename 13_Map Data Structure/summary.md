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
