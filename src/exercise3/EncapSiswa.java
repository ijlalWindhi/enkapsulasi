package exercise3;
public class EncapSiswa {
//    deklarasi variable
    private String name;
    private String address;
    private int absen;
    
//    membuat method getAbsen
    public int getAbsen(){
        return absen;//menggembalikan nilai absen
    }
//    membuat method getName
    public String getName(){
        return name;//menggembalikan nilai name
    }
//    membuat method getAddress
    public String getAddress(){
        return address;//mengembalikan nilai address
    }
//    membuat method getAbsen dengan terdapat parameter
    public void setAbsen( int newAbsen){
        absen=newAbsen;
    } 
//    membuat method getName dengan terdapat parameter
    public void setName(String newName){
        name=newName;
    }
//    membuat method getAddress dengan terdapat parameter
    public void setAddress(String newAddress){
        address=newAddress;
    }
}