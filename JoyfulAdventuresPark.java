import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class Visitor extends User {
    ArrayList<String> bookedAttractions;

    public Visitor(String username, String password) {
        super(username, password);
        this.bookedAttractions = new ArrayList<>();
    }

    public void bookAttraction(String attractionName) {
        bookedAttractions.add(attractionName);
    }

    public void cancelAttraction(String attractionName) {
        bookedAttractions.remove(attractionName);
    }

    public ArrayList<String> getBookedAttractions() {
        return bookedAttractions;
    }
}

class PaymentManager extends User {
    private double totalBill;

    public PaymentManager(String username, String password) {
        super(username, password);
        this.totalBill = 0.0;
    }

    public void calculateTotalBill(ArrayList<String> bookedAttractions) {
        for (String attraction : bookedAttractions) {
            switch (attraction) {
                case "Merry-Go-Round":
                    totalBill += 5.0;
                    break;
                case "Roller Coaster":
                    totalBill += 8.0;
                    break;
                case "Haunted House":
                    totalBill += 10.0;
                    break;
                // Add more attractions and their prices as needed
                default:
                    System.out.println("Invalid attraction: " + attraction);
            }
        }
    }

    public double getTotalBill() {
        return totalBill;
    }
}

public class JoyfulAdventuresPark {
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadUsers();

        while (true) {
            System.out.println("\nJoyful Adventures Park");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerVisitor(scanner);
                    break;
                case 2:
                    // Implement login logic here
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }

    public static void registerVisitor(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        users.add(new Visitor(username, password)); // Creating Visitor object during registration
        saveUsers();

        System.out.println("Registration successful! You can now login.");
    }

    public static void loadUsers() {
        try {
            File file = new File("users.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                users.add(new Visitor(parts[0], parts[1]));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveUsers() {
        try {
            FileWriter writer = new FileWriter("users.txt");
            for (User user : users) {
                if (user instanceof Visitor) {
                    writer.write(((Visitor) user).username + "," + ((Visitor) user).password + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
