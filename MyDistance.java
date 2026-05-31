import java.util.Scanner;

// Class to represent distance in feet and inches
class Distance {
    private int feet;
    private int inches;

    // Constructor
    Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize();
    }

    // Normalize inches to feet
    private void normalize() {
        feet += inches / 12;
        inches = inches % 12;
    }

    // Method to add two Distance objects
    Distance addDistance(Distance d) {
        return new Distance(this.feet + d.feet, this.inches + d.inches);
    }

    // Method to subtract two Distance objects (absolute difference)
    Distance subtractDistance(Distance d) {
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int diffInches = Math.abs(totalInches1 - totalInches2);
        return new Distance(diffInches / 12, diffInches % 12);
    }

    // Method to display distance
    void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

// Main class
public class MyDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first distance
        System.out.println("Enter first distance:");
        System.out.print("Feet: ");
        int f1 = sc.nextInt();
        System.out.print("Inches: ");
        int i1 = sc.nextInt();
        Distance d1 = new Distance(f1, i1);

        // Input second distance
        System.out.println("Enter second distance:");
        System.out.print("Feet: ");
        int f2 = sc.nextInt();
        System.out.print("Inches: ");
        int i2 = sc.nextInt();
        Distance d2 = new Distance(f2, i2);

        int choice;
        do {
            System.out.println("\nChoose operation:");
            System.out.println("1. Add distances");
            System.out.println("2. Subtract distances");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Distance result;
            switch (choice) {
                case 1:
                    result = d1.addDistance(d2);
                    System.out.print("Sum of distances: ");
                    result.displayDistance();
                    break;

                case 2:
                    result = d1.subtractDistance(d2);
                    System.out.print("Difference of distances: ");
                    result.displayDistance();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}