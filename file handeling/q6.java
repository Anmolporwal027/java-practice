// Writing content to multiple files using ByteArrayOutputStream and write to 
import java.util.Scanner;
import java.io.*;
class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        File file1 = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new1.txt");
        File file2 = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new2.txt");
        System.out.println("Enter content ");
        String content = sc.nextLine();

        try(
            FileOutputStream fobj1 = new FileOutputStream(file1);
            FileOutputStream fobj2 = new FileOutputStream(file2);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ){
            byte brr[] = content.getBytes();
            baos.write(brr);
            baos.writeTo(fobj1);
            baos.writeTo(fobj2);
            System.out.println("Data Inserted Successfully");
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}