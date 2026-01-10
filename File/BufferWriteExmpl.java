import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedWriter b = new BufferedWriter (new FileWriter ("test.txt"));
        b.write("simpleExample Of buffer. ");
        b.newLine();
        b.write("these line make a new file and be writen inside");
        b.close();
        
    }
}