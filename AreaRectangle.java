
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.print("enter the length and breadth of rectangle: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("area of rectangle is=" + (l * b));
        sc.close();
    }

}
