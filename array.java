
public class array {
    public static void main(String args[]) {
        int[] arr = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            arr[i] = i;
        }
        System.out.println("elements of array");
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
