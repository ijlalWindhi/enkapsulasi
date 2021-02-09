package exercise3;
public class TestSiswa {
    public static void main(String[] args) {
//        membuat objek siswa dari class EncapSiswa
        EncapSiswa siswa = new EncapSiswa();
//        memberikan nilai pada setiap method pada class EncapSiswa
        siswa.setName("Ijlal");
        siswa.setAbsen(19);
        siswa.setAddress("Nganjuk");
        
//        memanggil dan menampilkan masing-masing method
        System.out.print("Name : "+siswa.getName()
        + " Absen : "+siswa.getAbsen()
        + " Address : "+siswa.getAddress()); 
   }
}
