package exercise4;
public class Bus {
//    deklarasi variable
    public int penumpang;
    public int maxPenumpang;
    
//    konstruktor
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
//    Method Mutator
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
        }
    }
    public void getPenumpang(int password){
//        percabangan untuk menentukan output
        if (password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimal penumpang yang seharusnya adalah = "+maxPenumpang);
    }
}
