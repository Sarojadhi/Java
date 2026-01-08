import java.io.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		try{
		    FileWriter fw = new FileWriter ("test.txt");
		    System.out.println("file created  with name test.txt");
		     try{
		         
		                     fw.write("Programming is fun until you encounter errors.\n");

		         
		     }
		     catch(IOException e){
		         
		         System.out.println("failed "+e);
		     }


		     finally{
		         fw.close();
		     }
		    
		   
			 
		}
catch(IOException e){
		    System.out.println("found error "+e);
		    
		    
		}
	}
}