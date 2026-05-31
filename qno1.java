import java.util.Scanner;

public class qno1 {
    public static void main(String[] args) {
        String s;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ");
        s = sc.next();
        if (s.length() > 1)
            System.out.println("Invalid Input");
        else {
            ch = s.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    System.out.println(ch + " is Vowel");
                } else
                    System.out.println(ch + " is Consonant");
            }
        }
    }
}
