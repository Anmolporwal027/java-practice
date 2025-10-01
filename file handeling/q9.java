// using DataInputStream we can read any type of data inside file 
import java.io.*;
class Q9{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new2.txt");
        try(FileInputStream fobj = new FileInputStream(file);
            DataInputStream obj = new DataInputStream(fobj);
        ){
            System.out.println(obj.readInt());
            System.out.println(obj.readBoolean());
            System.out.println(obj.readDouble());
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}