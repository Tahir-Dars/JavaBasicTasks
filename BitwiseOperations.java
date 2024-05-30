/*This Java program takes two numbers as input and performs bitwise AND, OR, XOR, and NOT operations on them.*/
import java.util.Scanner;
public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner tool= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int bitwise= tool.nextInt();
        System.out.print("Enter the second number: ");
        int bitwise2= tool.nextInt();
        System.out.println("Their AND operation will result in : "+ (bitwise2&bitwise));
        System.out.println("Their OR operation will result in : "+ (bitwise2|bitwise));
        System.out.println("Their XOR operation will result in : "+ (bitwise2^bitwise));
        System.out.println("Their NOT operation on Number 1 is : "+ (~bitwise));
        System.out.println("Their NOT operation on Number 2 is : "+ (~bitwise2));


    }
}
