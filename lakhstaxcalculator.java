#This Java program calculates tax based on income input in lakhs and prints the calculated tax amount.
import java.util.Scanner;
public interface Set_04_Q3 {
    public static void main(String[] args){
        System.out.println("Tax Calculator !");
        Scanner sca= new Scanner(System.in);
        System.out.println("Enter the amount in lacs");
        float inc= sca.nextFloat();
        float tax= 0;
        if(inc<5){
            System.out.println("No Tax .");
        }
        else if (inc>=5 && inc<=10){
            tax= tax+0.1f*(inc-5.0f);
        }
        else if (inc>10.0f && inc<=20.0f){
            tax=tax+0.1f*(10.0f-5.0f);
            tax=tax+0.2f*(inc-10.0f);
        }
        else if (inc>20.0f){
            tax=tax+0.1f*(10.0f-5.0f);
            tax=tax+0.2f*(20.0f-10.0f);
            tax=tax+0.2f*(inc-20.0f);
        }
        System.out.println("Tax is : "+tax);
    }
}
