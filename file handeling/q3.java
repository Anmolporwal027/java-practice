// getting all the files in the form of list using listFiles()
import java.io.*;
class Q3{
    public static void main(String args[]){
        File file = new File("C:\\Users\\ANMOL\\Desktop\\new\\practice\\file handeling");
        File farr[] = file.listFiles();
        for(File f : farr){
            if(f.getName().endsWith(".java")){
                System.out.println("Name : "+f.getName()+"\tPath : "+f.getPath());
            }
        }
    }
}