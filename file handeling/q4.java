//writitng data to a file
import java.util.Scanner;
import java.io.*;
class Q4{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\demo1.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content to enter in file ");
        String content = sc.nextLine();
        try(FileOutputStream fobj = new FileOutputStream(file,true);){//true helps to write data (Appending)
            byte brr[] = content.getBytes();
            fobj.write(brr);
            fobj.close();
            System.out.println("Data Inserted Succesfully");
        }
        catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}