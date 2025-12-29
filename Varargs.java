class A {
    void num (int... a) {

       int sum = 0;
       for(int x:a){
       sum=sum+x;
       }
       System.out.println("sum is : "+sum);
    }
    
}
class Main {
    public static void main (String[] args)
    {
        A r = new A();
        r.num();
         r.num(1 , 2);
          r.num(2313,123);
           r.num(4312, 41 , 4321, 563);
            
    }
} 