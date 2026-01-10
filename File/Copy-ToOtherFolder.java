import java.io.*;
class Main{
    public static void main (String[] args) throws IOException{
        FileInputStream f =new FileInputStream ("test.txt");
                FileOutputStream r =new FileOutputStream ("saroj.txt");
                int i ;
                while((i=f.read())!=-1)
                {
              r.write((char)i);
              
                }
                System.out.println("run sucessfully ");

    }
}