/* class ThrowsExample {
    // Method that throws an exception
    public void riskyMethod() throws Exception {
        // Simulating an exception
        throw new Exception("An error occurred in riskyMethod");
    }

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        try {
            example.riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
} */

 /*    
class ThrowsExample {

    // yo method division garxa ra ArithmeticException throw garna sakxa
    void div(int a, int b) throws ArithmeticException {

        // yadi b zero bhayo bhane manual exception throw hunxa
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        // yadi exception aayena bhane division ko result print hunxa
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {

        // ThrowsExample class ko object banaune
        ThrowsExample example = new ThrowsExample();

        try {
            // div method call garne (yaha b = 0 pass bhayeko xa)
            example.div(10, 0);

        } catch (ArithmeticException e) {
            // div method bata aayeko exception yaha handle hunxa
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
*/


/* 
class Main {

    // yo method number 0 dekhi 10 samma print garxa
    // ani harek iteration ma 1 second sleep garxa
    // yaha InterruptedException throw garna sakcha
    public static void bestariaaija() throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);       // current number print garne
            Thread.sleep(1000);          // 1 second sleep
        }
    }

    public static void main(String[] args) throws InterruptedException {

        bestariaaija();  // method call

        try {
            System.out.println(10 / 0);   // division by zero → ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("cannot div by 0");  // exception handle
        }

        System.out.println("programming is fun.");  // normal print
    }
}
 */

//  DEFAULT EXCEPTION user defined EXCEPTION ma convert garne. 
class Main {

    // Custom Exception banaune
    static class InvalidException extends Exception {
        InvalidException(String message) {
            super(message);  // parent class ko constructor call garera message store garne
        }
    }

    public static void main(String[] args) {

        try {
            electionvoteage(17);  // age pass garna parcha
        } catch (InvalidException e) {
            System.out.println(e.getMessage());  // exception message print garne
        }
        finally {
            System.out.println("aarok xoti Hamro Party li vote hala hai babu");
        }

    }

    // method ma age check garera exception throw garne
    public static void electionvoteage(int age) throws InvalidException {
        if (age < 18) {   // 18 bhanda kam bhaye invalid
            throw new InvalidException("padnaBas Babu");  // custom exception throw
        } else {
            System.out.println("Hamro Party li vote hala hai babu");
        }
                    

    }
    
}
