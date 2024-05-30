import java.util.Scanner;
public class MyArray {
    public static void main(String[] args) {
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number to find it's factorial: ");
        int a=sc.nextInt();
        for(int i=a;i>=1;i--){
            factorial*=i;
        }
        System.out.println("Factorial of "+a+" is "+factorial+"!");
    }
}
