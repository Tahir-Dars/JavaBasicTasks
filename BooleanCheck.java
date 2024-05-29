 import java.util.Scanner;

public class Task_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st bool value(true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Enter 2nd bool value for b (true/false): ");
        boolean b = scanner.nextBoolean();
        System.out.print("Enter 3rd bool value for c (true/false): ");
        boolean c = scanner.nextBoolean();
        System.out.print("Enter 4th bool value for d (true/false): ");
        boolean d = scanner.nextBoolean();

        int entry = 0;
        if (a) entry++;
        if (b) entry++;
        if (c) entry++;
        if (d) entry++;
        if (entry >= 2) {
            System.out.println("Hello");
        }
        else {
            System.out.println("Goodbye");
        }
    }
}

