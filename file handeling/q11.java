// writing and reading to a file from filewriter and filereader
import java.io.*;
import java.util.Scanner;
class Q11{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\new3.txt");
        Scanner sc = new Scanner(System.in);
      
        // Writing data to file
        try(FileWriter f = new FileWriter(file)){
            f.write("Hello");
            f.write("World");
            System.out.println("Data Inserted Successfully ");
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }

        // Reading data from a file using character stream
         try(FileReader f = new FileReader(file)){
            while(true){
                int x = f.read();
                if(x == -1)
                    break;
                System.out.print((char)x);
            }
            System.out.println(f.read());
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}