package exercise4;
public class UjiBus3 {
    public static void main(String[] abc) {
//        membuat objek Bus dari class Bus
        Bus Bus = new Bus(5);
//        memberikan nilai parameter pada setiap method yang dipanggil
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(1); //tambah 1 penumpang
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
    }
}
