import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            File f = new File("saroj.txt");
            File r = new File("samir.txt");

            if (f.exists()) {
                boolean renamed = f.renameTo(r);
                if (renamed) {
                    System.out.println("File renamed successfully.");
                } else {
                    System.out.println("File rename failed.");
                }
            } else {
                System.out.println("Source file not found.");
            }
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Program executed successfully.");
        }
    }
}
