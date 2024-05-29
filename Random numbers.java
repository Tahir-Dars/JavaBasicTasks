import java.util.Random;

public class first {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random integer between 1 and 100 (inclusive)
        int randomNumber = random.nextInt(100) + 1;

        // Display the generated random number
        System.out.println("Random Number: " + randomNumber);
    }
}
