//There are several errors in this file. This error is because this is a task file and the command is like that.
//You can fix this by changing the access modifire on the bus class to public.

package exercise1;
public class ujiBus {
    public static void main(String[] args) {
//    membuat objek busMini dari kelas bus
    bus busMini = new bus();
//    memasukkan nilai jumlah penumpang dan maksimal penumpang ke dalam objek
//    bus mini
    busMini.penumpang=5;
    busMini.maxPenumpang=15;
//    memanggil method cetak pada class bus
    busMini.cetak();
    
//    menambahkan penumpang pada busMini
    busMini.penumpang = busMini.penumpang + 5;
//    memanggil method cetak pada class bus
    busMini.cetak();
    
//    menambahkan penumpang pada busMini
    busMini.penumpang = busMini.penumpang - 2;
//    memanggil method cetak pada class bus
    busMini.cetak();
    
//    menambahkan penumpang pada busMini
    busMini.penumpang = busMini.penumpang + 2;
//    memanggil method cetak pada class bus
    busMini.cetak();
    }    
}