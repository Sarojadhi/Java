public class ExplicitTypeConversion {
    public static void main(String args[]) {
        double d = 3.5;
        long l = (long) d;
        int i = (int) l;
        System.out.println("Double value: " + d);
        System.out.println("Long value: " + l);
        System.out.println("Integer value: " + i);
    }
}
