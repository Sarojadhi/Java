import java.util.Scanner;

public class BreakExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("enter a number");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            if (i == 5)
                break;
            System.out.println(n);
        }
    }
}
