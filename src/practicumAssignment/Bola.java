package practicumAssignment;
public class Bola {
//    membuat property jariJari
    public double jariJari;
    
//    membuat method setJariJari
    public void setJariJari(double jariJari){
        this.jariJari=jariJari;
    }
//    membuat method showDiameter
    public void showDiameter(){
        double diameter;
        diameter=jariJari*2;
        System.out.println("Diameter bola adalah : "+diameter);
    }
//    membuat method showLuasPermukaan
    public void showLuasPermukaan(){
        double luasPermukaan;
        luasPermukaan=4*Math.PI*(jariJari*jariJari);
        System.out.println("Luas permukaan bola adalah : "+luasPermukaan);
    }
//    membuat method showVolume
    public void showVolume(){
        double volume;
        volume=4*Math.PI*(jariJari*jariJari*jariJari)/3;
        System.out.println("Volume bola adalah : "+volume);
    }
}