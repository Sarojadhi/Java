class A {
    int a;
    int  b;
    A(){
        a= 10; b= 20;
       System.out.println(a+" its inside a() "+b);
    }
A(A ref)
{
    a= ref.a;
    b = ref.b;
    System.out.println(a+" "+b);

}
}
public class CopyCons {
    public static void main(String[] args) {
       A r = new A();
       A r1 = new A(r);
}}
