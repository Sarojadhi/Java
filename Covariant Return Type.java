class A{
    // AAfnai name ko method chah jasma return type hunu parnecha.
     A dekha(){
        System.out.println("Coading is Fun");
        return this;
    }
}

class B extends A {
    @Override
    B dekha(){
        super.dekha();
        System.out.println("Untill you encounter with Bug");
                return this;

    }
}
class Main {
    public static void main (String[] args)
    {
        
        B r = new B  ();
        r.dekha();
    }
}