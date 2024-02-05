package Advanced;


public class Example4 {

    public static void CheckAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must not be less than 18 to vote");
        } else if (age > 18 && age < 50) {
            throw new IllegalStateException("You can vote, but within 5 minutes");
        } else {
            throw new RuntimeException("No vote at all");
        }
    }

    public static void main(String[] args) throws IllegalArgumentException, IllegalStateException{
        try {
            CheckAge(21);
            System.out.println("Execution continues");
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
