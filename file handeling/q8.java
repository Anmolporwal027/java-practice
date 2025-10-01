// using DataOutputStream we can write any type of data inside file 
import java.io.*;
class Q8{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new2.txt");
        try(FileOutputStream fobj = new FileOutputStream(file);
            DataOutputStream obj = new DataOutputStream(fobj);
        ){
            obj.writeInt(1212);
            obj.writeBoolean(true);
            obj.writeDouble(1.2);
            System.out.println("Data Inserted Successfully ");
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}