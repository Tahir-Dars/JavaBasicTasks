/*This Java program prompts the user to enter a day number and then prints the corresponding day of the week.*/
import java.util.Scanner;
public class dayname_wrt_num {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int day = take.nextInt();
        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wedesdayday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("This day doesn't exist ");
        }
    }
}
