import java.io.*;
import java.util.Scanner;

public class LibraryManagementSystem {

    static final String fileName = "student.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        File f = new File(fileName);
        try {
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        while (true) {
            System.out.println("\n==== Student Record System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // ADD STUDENT
    static void addStudent() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            System.out.print("Enter Student ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            bw.write(id + "," + name + "," + age);
            bw.newLine();

            System.out.println("Student added successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // VIEW STUDENTS
    static void viewStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            System.out.println("\n--- Student Records ---");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("ID: " + data[0] +
                        " Name: " + data[1] +
                        " Age: " + data[2]);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // SEARCH STUDENT
    static void searchStudent() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            System.out.print("Enter Student ID to search: ");
            String searchId = sc.nextLine();
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(searchId)) {
                    System.out.println("ID: " + data[0] +
                            " Name: " + data[1] +
                            " Age: " + data[2]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // DELETE STUDENT
    static void deleteStudent() {
        File inputFile = new File(fileName);
        File tempFile = new File("temp.txt");

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))
        ) {
            System.out.print("Enter Student ID to delete: ");
            String deleteId = sc.nextLine();
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(deleteId)) {
                    found = true;
                    continue;
                }
                bw.write(line);
                bw.newLine();
            }

            if (found) {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                System.out.println("Student deleted successfully.");
            } else {
                tempFile.delete();
                System.out.println("Student not found.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
