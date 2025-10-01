// Creating file using createNewFile with handeling exceptions 
import java.io.File;
import java.io.IOException;
class Q2{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\demo1.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File Created Successfully ");
            }
            else{
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}