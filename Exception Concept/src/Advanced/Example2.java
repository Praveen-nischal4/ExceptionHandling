package Advanced;

public class Example2 {

    public static void main(String[] args) {
        try {
            try {
                // Inner try block without a catch block
                int result = divideByZero();
                System.out.println("Result: " + result);
            } finally {
                // Inner finally block
                System.out.println("Inner Finally: This block always executes");
            }
        } catch (ArithmeticException e) {
            // Outer catch block handling the exception from the inner try block
            System.out.println("Outer Catch (ArithmeticException): " + e.getMessage());
        } finally {
            // Outer finally block
            System.out.println("Outer Finally: This block always executes");
        }
    }

    public static int divideByZero() {
        // Attempting to divide by zero
        return 10 / 0;
    }
}
