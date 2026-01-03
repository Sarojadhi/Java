public throw {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            throw e; // Rethrowing the exception
        }
    }
}



