import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("text.txt"); 

        if (f.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}
