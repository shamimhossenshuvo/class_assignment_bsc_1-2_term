import java.io.*;

public class LearnReader {
    public static void main(String[] args) {
        try{
         Reader input = new FileReader("shuvo.txt");
         int data = input.read();
         while(data != -1) {
             System.out.println((char) data);
             data = input.read(); //For new Char initialization
         }
         input.close();
        } catch(Exception e) {
            System.out.println("File passi na shuvo sir" + e.getMessage());

        }
    }
}