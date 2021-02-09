package practicumAssignment;
public class TestBola {
    public static void main(String[] args) {
//        membuat variable jariJari
        double jariJari=14;
//        membuat objek bola dari class Bola
        Bola bola = new Bola();
//        memanggil method showDiameter dari class Bola
        bola.showDiameter();
//        memanggil method showLuasPermukaan dari class Bola
        bola.showLuasPermukaan();
//        memanggil method showVolume dari class Bola
        bola.showVolume();
        
//        memanipulasi objek bola dengan memanggil method setJariJari dengan
//        menggunakan variable jariJari
        bola.setJariJari(jariJari);
//        memanggil method showDiameter dari class Bola
        bola.showDiameter();
//        memanggil method showLuasPermukaan dari class Bola
        bola.showLuasPermukaan();
//        memanggil method showVolume dari class Bola
        bola.showVolume();
    }
}