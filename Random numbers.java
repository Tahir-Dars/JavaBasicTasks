#This Java program generates and prints a random integer between 1 and 100.

import java.util.Random;
public class first {
    public static void main(String[] args) {
        
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Random Numberm is : " + randomNumber);
    }
}
