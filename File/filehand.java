/* import java.io.*;

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
 */




import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World");
		File f = new File("index.txt");
		if(f.exists()){
		    
		   System.out.println("File name: " + f.getName());
        System.out.println("File readable: " + f.canRead());
        System.out.println("File writable: " + f.canWrite());
        System.out.println("File size: " + f.length() + " bytes");
        System.out.println("File deleted: " + f.delete());
		    
		    
		}else{
		    
		    		    System.out.println("file failed to create");

		    
		    
		}
	}
}