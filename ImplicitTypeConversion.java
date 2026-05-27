public class ImplicitTypeConversion {
    public static void main(String[] args) {
        byte var1 = 5;
        long var3 = var1;
        System.out.println("short value:" + var1);
        System.out.println("int value=" + var1);
        System.out.println("long value=" + var3);
    }
}
