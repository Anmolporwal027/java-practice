// reading content to multiple files using SequenceInputStream
import java.util.Scanner;
import java.io.*;
class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        File file1 = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new1.txt");
        File file2 = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new2.txt");

        try(
            FileInputStream fobj1 = new FileInputStream(file1);
            FileInputStream fobj2 = new FileInputStream(file2);
            SequenceInputStream sis = new SequenceInputStream(fobj1,fobj2);
        ){
           while(true){
               int x = sis.read();
               if(x == -1)
                break;

                System.out.print((char)x);
           }
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}