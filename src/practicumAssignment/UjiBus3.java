package practicumAssignment;
public class UjiBus3 {
        public static void main(String[] abc) {
        Bus Bus = new Bus(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.getAverage(60);
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(1); //tambah 1 penumpang
        Bus.getAverage(45);
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.getAverage(56);
        Bus.cetakPenumpang();
//        penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.getAverage(49);
        Bus.cetakPenumpang();
    }
}
