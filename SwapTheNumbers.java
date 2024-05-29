import java.util.Scanner;
public class SwapTheNumbers {
    public static void main(String[] args){
      Scanner sk= new Scanner(System.in);
        System.out.println("Please give a value to a:");
        int a=sk.nextInt();
        System.out.println("Please give a value to b:");
        int b=sk.nextInt();
        System.out.println("Before swaping, The values are:\n a="+a+" and b="+b);
           a=a+b;// a is the sum of both
           b=a-b;// now b becomes the subtraction of given value of b from the a(calculated last)
           a=a-b;// now  a becomes the subtraction of last calculated b(which was 'a' initially ) from the summed a
        System.out.println("After swaping, The values are:\n a="+a+" and b="+b);
    }
}
