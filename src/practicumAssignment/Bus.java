package practicumAssignment;
public class Bus {
//    membuat property
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    
//    konstruktor
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
//    Method Mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
        }
    }
    public void getPenumpang(int password){
//        percabangan untuk menentukan output program
        if (password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public void getAverage(double average){
        this.penumpangBaru = average;
        counter=penumpangBaru/penumpang;
    }
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimal penumpang yang seharusnya adalah = "+maxPenumpang);
        System.out.println("Berat rata-rata penumpang baru = "+counter);
    }
}
