
// simple compile time polymorphism Example
/* public class Main
{
    int a , b, c;
    
    void add(){
    int a=4,b=3;
    c=a+b;
    System.out.println(c);
    }

 void mul(int a ,int b, int c )
    {
    c=a*b;
    System.out.println(c);
}
 void sub(int a , int b){
    c=a-b;
    System.out.println(c);
 }
    public static void main (String[] args){
    Main r = new Main();
    r.add();
    r.sub(35 ,34);
    r.mul(23 , 543 , 2345);
    
}
}
 */
// another example of compile time polymorphism with return type
/* 
public class Main
{
    int a , b, c;
    
    int add(){
    int a=4,b=3;
    c=a+b;
    return c;
    }

 void mul(int a ,int b, int c )
    {
    c=a*b;
    System.out.println(c);
}
 void sub(int a , int b){
    c=a-b;
    System.out.println(c);
 }
    public static void main (String[] args){
    Main r = new Main();
    int a = r.add();
    r.sub(35 ,34);
    r.mul(23 , 543 , 2345);
    System.out.println(a);
}

} */