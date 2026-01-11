public class LibraryManagementSystem {

    static final String fileName = "student.txt";
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        File f = new File(fileName);

        try (f.createNewFile()) {

            System.out.println("File created: " + f.getName());

        } 
        catch (IOException e)
         {
            System.out.println("An error occurred."+e);

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
            sc.nextLine(); // clear buffer

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
            // ADD STUDENT 

            static void addStudent(){
            try {

                bufferWriter bw = new bufferwritter (new filewriter (fileName,true));
                Scanner sc = new Scanner (System.in);
                 System.out.println("\n--- Student Adding Records ---");
                System.out.print ("Enter Student ID: ");
                String Id = sc.nextLine();
                System.out.print ("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print ("Enter Student Age: ");
                int age = sc.nextInt();
                bw.write (Id +", "+name +" , "+age+" , ");
                bw.close();
                System.out.println("Student added Sucessfully "+Id+" "+name+" "+age);
            } catch (IOException e) {
                System.out.println("An error occurred."+e);

            }
            }
            // VIEW STUDENT
            static void ViewStudentDetails{
                try{
                    BufferedReaderbr = new BufferedReader (new FileReader(fileName,true));
                    String l;
                    System.out.println("\n--- Student Records ---");
                    while((l=br.readLine())!null){
                        String[] data = l.split(",");
                        System.out.println("ID: "+data[0]+" Name: "+data[1]+" Age: "+data[2]);
                    }

                }
                catch(FileNotFoundException e ){
                    System.out.println("File not found "+e);

                }
                catch(IOException e){
                    System.out.println("An error occurred."+e);
            }

            
    }

    }