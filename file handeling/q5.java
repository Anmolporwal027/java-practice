// Reading from an file
import java.io.*;
class Q5{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling\\myfolder\\demo1.txt");
        try(FileInputStream fin = new FileInputStream(file);){
            while(true){
                int x = fin.read();
                if(x == -1)
                    break;
                System.out.print((char)x);//Converting From byte to character
            }
        }
        catch(IOException e){
            System.out.println("Exception "+e);
        }
    }
}