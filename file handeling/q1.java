// Creatign folder using mkdir
import java.io.File;
class Q1{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("File Created Successfully ");
        }
        else{
            System.out.println("File Already Exists");
        }
    }
}