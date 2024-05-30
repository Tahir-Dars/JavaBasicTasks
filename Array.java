/*This code contains some block of code , Which Arrays are being used */
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 1. Three ways of array usage
        
             // 1.1 Declaration and then memory allocation
        // int marks[];
        // marks = new int[5];
        
             // 1.2 Declaration and memory allocation at the same time
        // int marks[] = new int[7];
        
             // 1.3 Declaration + initialization
        // int marks[] = {10, 6, 89, 9};
        // Arrays.sort(marks);
        // System.out.println(Arrays.toString(marks));

        //  Challenge : Print elements in reverse order
        
        // System.out.println("Enter ten numbers; their reverse will be printed ");
        // int marks[] = new int[10];
        // for(int i = 0; i <= 9; i++) {
        //     marks[i] = sc.nextInt();
        // }
        // for(int i = 9; i >= 0; i--) {
        //     System.out.print(marks[i] + " ");
        // }
        
        // Challenge : Find Maximum Element
        
        // int entry[] = new int[5];
        // for(int i = 0; i <= 4; i++) {
        //     entry[i] = sc.nextInt();
        // }
        // int max = entry[0];
        // for(int i = 1; i <= 4; i++) {
        //     if(entry[0] > entry[i]) {
        //         max = entry[i];
        //     }
        // }
        // System.out.println(max);
        
        // Challenge : Enter an array and check if they are forming a palindrome
        
        // char pal[] = new char[5];
        // for(int i = 0; i < pal.length; i++) {
        //     pal[i] = sc.next().charAt(0);
        // }
        // if(pal[0] == pal[pal.length - 1] && pal[1] == pal[pal.length - 2]) {
        //     System.out.println("It's a palindrome");
        // } else {
        //     System.out.println("It is not a palindrome");
        // }
        
                                 //   Array Operations
        // int numbers[] = {5, 7, 9, 2, 1};
    // Challenge: Sorting the Array
// Arrays.sort(numbers);
// System.out.println("Sorted array: " + Arrays.toString(numbers));

// Challenge: Array Copy
// int[] copyArray = Arrays.copyOf(numbers, numbers.length);
// System.out.println("Copied array: " + Arrays.toString(copyArray));

//  Challenge: Binary Search of the Array
// int index = Arrays.binarySearch(numbers, 5);
// System.out.println("Index of 5 in sorted array: " + index);

//  Challenge: Array Equality Check
// int[] otherArray = {1, 2, 5, 7, 9};
// boolean isEqual = Arrays.equals(numbers, otherArray);
// System.out.println("Are the arrays equal? " + isEqual);

// Challenge: Filling the Array
// int[] fillArray = new int[5];
// Arrays.fill(fillArray, 10);
// System.out.println("Filled array: " + Arrays.toString(fillArray));
       
    }
}
