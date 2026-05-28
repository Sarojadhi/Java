import java.util.Scanner;

public class Continue {
    public static void main(String args[]) {

        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }

    }
}
