class A {
    // A constructior li xai self call garxa .
    A(){
        System.out.println("super class constructor ");
    }
    //  methid call garnu  parxa by supr.methodname();
    void disp (){
        System.out.println("super class method ");
    }
}
class B extends A {
    @Override
    void disp (){
        // super.disp();
        System.out.println("sub class method ");
    }
    void show (){
        System.out.println("sub class show method");
    }
}
class Main{
    public static void main (String[] args){
        B obj = new B ();
        obj.disp ();
     obj.show ();
    }
}   