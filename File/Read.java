
/* import java.io.*;
class Main {
    public static void main (String[] args)throws IOException{
        
       FileReader r  = new FileReader ("test.txt") ;
       int i;
       while((i=r.read())!=-1)
       {
           System.out.print((char)i);
           
       }
        
        
        
    }
} */

import java.io.*;

class Main {
    public static void main(String[] args) {

        FileReader r = null;

        try {
            r = new FileReader("test.txt");
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
        } 
        catch (IOException e) {
            System.out.println("Error occurred: " + e);
        } 
        finally {
            try {
                if (r != null)
                    r.close();
            } catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
    }
}
