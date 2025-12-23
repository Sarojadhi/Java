
class Test {
    int age ; String name; 
    /* Test()
    {
        age = 10;
        name = "Saroj" ;
    } */
    void display ()
    {
        System.out.println(name+" "+age);
    }
}
public class Constructor {
public static void main(String[] args) {
    
    Test a= new Test();
    a.display();
}

    
}
