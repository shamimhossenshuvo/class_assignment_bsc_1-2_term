import java.io.FileWriter;
//import java.io.Writer;
public class writer {
    public static void main(String[] args) {
        try {
            FileWriter write = new FileWriter("shuvo.txt");
            write.write("I read in ICE cse");
            write.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
