import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

        String fileName = "data.txt";

        // 1. Write to file
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Java File Handling Example\n");
            fw.write("Learning Java is fun!");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // 2. Read from file
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nFile Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // 3. Append to file
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("\nAppended line.");
            fw.close();
            System.out.println("\nData appended.");
        } catch (IOException e) {
            System.out.println("Error appending file.");
        }
    }
}
